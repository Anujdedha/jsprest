package com.howtodoinjava.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class IndexController {

	@RequestMapping("/page")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}
	
	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "next";
	}
	@GetMapping("/otp")
	public String data() {
		System.out.print("dsdsd");
		return "next";
	}

	@RequestMapping(value="/postdata", method=RequestMethod.POST)
	public String postData(@RequestBody Map demo) {
		System.out.println("demo id:");
	
		return "test";
	}	
}