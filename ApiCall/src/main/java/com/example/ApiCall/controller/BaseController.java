package com.example.ApiCall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@GetMapping("/google")
	public String google() {
		return "iojuyhgtrfd";
	}

}
