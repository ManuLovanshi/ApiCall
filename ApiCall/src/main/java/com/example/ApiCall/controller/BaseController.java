package com.example.ApiCall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiCall.service.ExternalAPIService;

@RestController
public class BaseController {
	
	@Autowired
	ExternalAPIService externalAPIService;
	
	@GetMapping("/getFact")
	public String getFacts() {
		return externalAPIService.getCatFacts();
	}

}
