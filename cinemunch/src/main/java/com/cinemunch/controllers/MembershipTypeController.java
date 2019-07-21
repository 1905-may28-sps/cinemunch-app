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
@RequestMapping("/membershiptype")
public class MembershipTypeController {
	
	@Autowired
	MembershipTypeService service;
	
	@RequestMapping
	public ResponseEntity<List<MembershipType>> findAll(){
		List<MembershipType> membershipTypes = service.getAll();
		if(membershipTypes == null || membershipTypes.size() == 0) return new ResponseEntity<List<MembershipType>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<MembershipType>>(membershipTypes, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MembershipType> add(@RequestBody MembershipType m){
		m = service.add(m);
		return new ResponseEntity<MembershipType>(m, HttpStatus.CREATED);
	}

}
