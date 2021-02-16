package com.aruss.evaluacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aruss.evaluacion.entity.BaseEntity;


@RestController
@RequestMapping("uri")
public class BaseController {
	
	@Autowired
	@GetMapping(path="/messages", produces=MediaType.APPLICATION_JSON_VALUE)
	public BaseEntity getListUsers() {
		BaseEntity baseEntity = new BaseEntity();
		baseEntity.setiIdMessage(1L);
		baseEntity.setsDescription("Example for microservice");
		return baseEntity;
	}

}
