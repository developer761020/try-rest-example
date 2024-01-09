package com.example.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.model.Rest_Model;

@Service
public class Rest_ServiceImpl implements Rest_service{

	@Override
	public List<Rest_Model> findAll() {
		
		ArrayList<Rest_Model> items=new ArrayList<Rest_Model>();
		
		items.add(new Rest_Model(001,"nokia",10000.00,10));
		items.add(new Rest_Model(002,"samsung",20000.00,10));
		items.add(new Rest_Model(003,"vivo",30000.00,10));
		items.add(new Rest_Model(004,"iphone",40000.00,10));
		items.add(new Rest_Model(005,"pixel",50000.00,10));
		return items;
	}

	
}
