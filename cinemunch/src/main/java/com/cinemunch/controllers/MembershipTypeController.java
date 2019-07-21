package com.cinemunch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cinemunch.beans.MembershipType;
import com.cinemunch.service.MembershipTypeService;

@RestController
@RequestMapping("/membershipType")
public class MembershipTypeController {
	
	@Autowired
	MembershipTypeService mtypeservice;
	
	@RequestMapping
	public ResponseEntity<List<MembershipType>> findAll(){
		List<MembershipType> memberships = mtypeservice.getAll();
		if(memberships == null || memberships.size() == 0) return new ResponseEntity<List<MembershipType>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<MembershipType>>(memberships, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MembershipType> add(@RequestBody MembershipType mt){
		mt = mtypeservice.add(mt);
		return new ResponseEntity<MembershipType>(mt, HttpStatus.CREATED);
	}

}
