package com.paygate.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home(Model model) {
		logger.info("Welcome Index Page");
		
		model.addAttribute("resultMsg", "Hello world java");
		
		return "home";
	}
}
