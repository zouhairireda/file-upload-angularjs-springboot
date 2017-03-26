package com.projects.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

@Controller
public class UploadController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/upload")
	@ResponseBody
	public String upload(@RequestParam("file") MultipartFile file) {
		
		System.out.println(file.getOriginalFilename());
		return "ok";
	}
}
