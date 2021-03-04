package com.pages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demoController {
	
	@GetMapping("/testing")
	public String demo(Model model) {
		model.addAttribute("dateis",new java.util.Date());
		return "helloHtml";
		
	}

}
