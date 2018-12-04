package com.jxyd.nole.web.image.service.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.UploadUtils;
import com.jxyd.nole.web.image.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {
	
	private static final Log log = LogFactory.getLog(ImageServiceImpl.class);
	
	private String MSG_0 = "上传成功";
	private String MSG_1 = "缺失文件";
	private String MSG_2 = "文件类型错误";
	private String MSG_3 = "文件字节过大";
	private String MSG_4 = "不是图片";
	private String MSG_5 = "图片像素过大";
	private String MSG_6 = "图片像素不匹配";
	private String MSG_9 = "服务器异常";
	
	@Value("#{configProperties['pic.physical.path']}")
	private String picPhysicalPath;
	@Value("#{configProperties['pic.virtual.path']}")
	private String picVirtualPath;

	@Override
	public Map<String, Object> uploadImage(MultipartFile multipartFile, int widthCheck, int heightCheck, boolean exact,
			long sizeCheck, String[] typeCheck) {
		Map<String, Object> map = new HashMap<String, Object>();

		try {
			//
			if (multipartFile == null) {
				map.put("code", 1);
				map.put("msg", MSG_1);
				return map;
			}

			//
			String contentType = multipartFile.getContentType();
			boolean typeChecked = false;
			for (String type : typeCheck) {
				if (type.equalsIgnoreCase(contentType)) {
					typeChecked = true;
					break;
				}
			}
			if (!typeChecked) {
				map.put("code", 2);
				map.put("msg", MSG_2);
				return map;
			}
			//
			long size = multipartFile.getSize();
			if (sizeCheck != 0 && size > sizeCheck) {
				map.put("code", 3);
				map.put("msg", MSG_3);
				return map;
			}
			//
			BufferedImage image = ImageIO.read(multipartFile.getInputStream());
			if (image == null) {
				map.put("code", 4);
				map.put("msg", MSG_4);
				return map;
			}
			int width = image.getWidth();
			int height = image.getHeight();
			//
			if (!exact && (heightCheck > 0 && height > heightCheck || widthCheck > 0 && width > widthCheck)) {
				map.put("code", 5);
				map.put("msg", MSG_5);
				return map;
			}
			//
			if (exact && (heightCheck > 0 && height != heightCheck || widthCheck > 0 && width != widthCheck)) {
				map.put("code", 6);
				map.put("msg", MSG_6);
				return map;
			}

			String originalFilename = multipartFile.getOriginalFilename();
			String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
			File tempFile = File.createTempFile("tmp", suffix);
			multipartFile.transferTo(tempFile);
			String relativePath = UploadUtils.getStandardPath(tempFile);
			UploadUtils.upload(new File(picPhysicalPath + relativePath), tempFile, true);
			tempFile.delete();
			map.put("relativePath", relativePath);
			map.put("picVirtualPath", picVirtualPath);
			map.put("code", 0);
			map.put("msg", MSG_0);
			return map;
		} catch (Exception e) {
			log.error("保存图片失败 ", e);
			map.put("code", 9);
			map.put("msg", MSG_9);
			return map;
		} finally {
			if ((int) map.get("code") != 0) {
				String name = multipartFile != null ? multipartFile.getOriginalFilename() : "null";
				log.debug("上传失败：" + map.toString() + "，详情 ：[multipartFile=" + name + ", widthCheck=" + widthCheck
						+ ", heightCheck=" + heightCheck + ", exact=" + exact + ", sizeCheck=" + sizeCheck
						+ ", typeCheck=" + Arrays.toString(typeCheck) + ", picPhysicalPath=" + picPhysicalPath + "]");
			} else {
				log.info(map.toString());
			}
		}
	}
	
}
