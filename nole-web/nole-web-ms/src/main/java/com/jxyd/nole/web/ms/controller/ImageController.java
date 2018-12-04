package com.jxyd.nole.web.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/img")
@Controller
public class ImageController {

	@RequestMapping(path = "/photoList")
	public String photoList() {
		return "img/photoList";
	}

}
