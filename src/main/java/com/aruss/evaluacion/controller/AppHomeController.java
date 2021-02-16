package com.aruss.evaluacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aruss.evaluacion.entity.BaseEntity;

@RestController
@RequestMapping("/")
public class AppHomeController {
	
	@Autowired
	@GetMapping(path="/", produces=MediaType.APPLICATION_JSON_VALUE)
	public String getHomeMessage() {
		return "Welcome to the microservice home";
	}

}
