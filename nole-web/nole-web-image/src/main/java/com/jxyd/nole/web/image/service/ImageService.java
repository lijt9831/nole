package com.jxyd.nole.web.image.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	Map<String, Object> uploadImage(MultipartFile multipartFile, int widthCheck, int heightCheck, boolean exact,
			long sizeCheck, String[] typeCheck);
}
