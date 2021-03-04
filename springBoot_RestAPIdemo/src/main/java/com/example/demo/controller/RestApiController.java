package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {
	
	@RequestMapping("/test")
	public String demoMethod() {
		return " Hello world Rest API";
	}

}
