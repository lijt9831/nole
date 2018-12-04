package com.jxyd.nole.web.image.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.web.image.service.ImageService;
import com.jxyd.nole.web.image.util.IpUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@Api(value = "图片上传服务")
public class ImageController {

	private static final Log log = LogFactory.getLog(ImageController.class);
	
	@Autowired
	private ImageService imageService;

	@ApiOperation(value = "通用图片上传,支持 png和jpeg，大小不能超过10M")
	@RequestMapping(method = RequestMethod.POST, path = "/upload", produces = { "application/json; charset=UTF-8" })
	@ResponseBody
	public Object upload(
			@ApiParam(name = "file", value = "图片文件", required = true) @RequestPart(value = "file", required = true) MultipartFile file) {

		log.info("请求来自[" + IpUtils.getIpAddr() + "]");
		
		// 校验项
		boolean exact = false;
		int widthCheck = 0;
		int heightCheck = 0;
		int sizeCheck = 1024 * 1024 * 10;
		String[] typeCheck = new String[] { "IMAGE/PNG", "IMAGE/JPEG" };

		// 文件上传
		return imageService.uploadImage(file, widthCheck, heightCheck, exact, sizeCheck, typeCheck);
	}

}
