package com.paygate.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@PostMapping("/")
	public String home() {
		
		return "home";
	}
	
	@PostMapping("/test")
	public String test() {
		String rtnMsg = "Hello world test";
		
		return rtnMsg;
	}
}
