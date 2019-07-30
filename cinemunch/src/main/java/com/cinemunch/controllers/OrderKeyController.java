package com.cinemunch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cinemunch.beans.OrderKey;
import com.cinemunch.service.OrderKeyService;

@RestController
@CrossOrigin("*")
@RequestMapping("/orderkey")
public class OrderKeyController {
	
	@Autowired
	OrderKeyService service;
	
	@RequestMapping
	public ResponseEntity<List<OrderKey>> findAll(){
		List<OrderKey> orderKeys = service.getAll();
		if(orderKeys == null || orderKeys.size() == 0) return new ResponseEntity<List<OrderKey>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<OrderKey>>(orderKeys, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OrderKey> add(@RequestBody OrderKey m){
		m = service.add(m);
		return new ResponseEntity<OrderKey>(m, HttpStatus.CREATED);
	}

}
