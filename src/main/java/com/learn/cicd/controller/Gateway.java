package com.learn.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class Gateway {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "This is Homepage";
	}
	
	@GetMapping("/btn/{str}")
	public String btn(@PathVariable("str") String str) {
		return str+" This was your passing parameter";
	}
}