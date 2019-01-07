package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("")
	public String showHello() {
		return "parenthello";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormV2")
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
		
//		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Hi! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
