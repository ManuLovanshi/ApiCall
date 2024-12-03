package com.example.ApiCall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalAPIService {

	@Autowired
	private RestTemplate restTemp;
	
	public static final String catFactURL = "https://cat-fact.herokuapp.com/facts";
	public String getCatFacts() {
		String response = "API call failed";
		try{
			ResponseEntity<List> facts = restTemp.getForEntity(catFactURL, List.class);
			response = facts.getBody().toString();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return response;
	}
}
