package com.paygate.hello.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paygate.hello.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HelloWorldController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping("/list/{id}")
	public Map<String, Object> list(@PathVariable String id) {
		Map<String, Object> list = new HashMap<>();
		logger.info("id : {}", id);
		
		list.put("id", id);
		list.put("pw", "test123");
		list.put("location", "SEOUL");
		
		return list;
	}
	
	@GetMapping("/test/{msg}")
	public String test(@PathVariable String msg) {
		logger.info("msg : {}", msg);
		
		return "Restful API test success! - msg : " + msg;
	}
	
	@GetMapping("/getTest")
	public String getTest() {
		logger.info("Get mapping test success");
		
		String rtnMsg = "Get mapping test success!";		
		
		return rtnMsg;
	}
	
	@PostMapping("/postTest")
	public String postTest(Model model) {
		logger.info("Post mapping test success");
		
		String rtnMsg = "Post mapping test success!";
		
		model.addAttribute("resultMsg", "rtnMsg");
		
		return rtnMsg;
	}
}
