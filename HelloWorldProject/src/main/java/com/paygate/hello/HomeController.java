package com.paygate.hello;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("resultMsg", "Hello world java" );
		
		return "home";
	}
	
	@RequestMapping(value = "/list/{id}", method=RequestMethod.GET)
	@ResponseBody()
	public Map<String, Object> list(@PathVariable String id) {
		Map<String, Object> list = new HashMap<>();
		
		list.put("id", id);
		list.put("pw", "test123");
		list.put("location", "SEOUL");
		
		return list;
	}
	
	@RequestMapping(value = "/test/{msg}", method=RequestMethod.GET)
	@ResponseBody()
	public String test(@PathVariable String msg) {
		
		
		return "Hello world test : " + msg;
	}
	
}
