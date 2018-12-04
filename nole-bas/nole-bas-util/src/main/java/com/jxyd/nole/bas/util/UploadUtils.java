package com.jxyd.nole.bas.util;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

/**
 * @Author: luy
 * @Description:
 * @Date: create in 2018/4/12 14:49
 */
public class UploadUtils {
	
    /**
     * 上传时，保存到服务器用 
     *
     * @param fileToServer
     * @param fileFromClient
     * @param autoMkdirs true 自动创建父目录，false 不自动创建此时如果父目录不存在会抛异常
     * @see org.springframework.web.multipart.MultipartFile.transferTo( File dest)
     */
    public static void upload(File fileToServer, File fileFromClient, boolean autoMkdirs) {
        InputStream in = null;
        OutputStream out = null;
        try {
        	// 文件在服务器存在时，直接返回 
        	if(fileToServer.exists()) {
        		return;
        	}
        	File parentFile = fileToServer.getParentFile();
			if (autoMkdirs) {
				parentFile.mkdirs();
			} else {
				if(!parentFile.exists()) {
					throw new RuntimeException("父目录不存在【"+parentFile+"】");
				}
			}
            byte[] buffer = new byte[4098];
            in = new BufferedInputStream(new FileInputStream(fileFromClient));
            out = new BufferedOutputStream(new FileOutputStream(fileToServer));
            int buffered;
            while ((buffered = in.read(buffer)) != -1) {
                out.write(buffer, 0, buffered);
            }
            out.flush();
        } catch (Exception e) {
            throw new RuntimeException("上传文件错误", e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }
    }
    
    /**
     * yyyy/MM/dd/[MD5值][后缀]    <br>
     * 例如：2018/04/25/18/FF/FFDDED10FAC5C907902D8375AAFD4EAA.png
     * @param fileFromClient
     * @return
     */
    public static String getStandardPath(File fileFromClient) {
    	String part1 = DateUtils.format(new Date(),DateUtils.DATE_2);
    	String part2 = MD5Utils.md5File(fileFromClient);
    	String part3 = getSuffix(fileFromClient);
    	// 返回 
		return part1 + "/" + part2 + part3;
    	
    }
    
    /**
	 * 获取文件名后缀<br>
	 * 例如：test.png 的后缀是 .png
	 * @param file
	 * @return
	 */
	private static String getSuffix(File file) {
		try {
			String name = file.getName();
			String suffix = name.substring(name.lastIndexOf("."));
			return suffix;
		} catch (Exception e) {
			throw new RuntimeException("获取文件名后缀失败", e);
		}
	}
}
