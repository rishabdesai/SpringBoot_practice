//change the port to 8081 if error while running
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApplication {

	@RequestMapping("/hello")
	public String display() {
		return "hello world";
	}
	

}
