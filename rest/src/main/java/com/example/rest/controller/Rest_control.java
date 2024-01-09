package com.example.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.model.Rest_Model;
import com.example.rest.service.Rest_service;

@RestController
public class Rest_control {
	@Autowired
	Rest_service service;
	
	@GetMapping(value="/items")
	public List<Rest_Model> getItems(){
		List<Rest_Model> items=service.findAll();
		return items;
	}

}
