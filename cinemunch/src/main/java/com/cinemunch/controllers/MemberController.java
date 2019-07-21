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

import com.cinemunch.beans.Member;
import com.cinemunch.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping
	public ResponseEntity<List<Member>> findAll(){
		List<Member> members = service.getAll();
		if(members == null || members.size() == 0) return new ResponseEntity<List<Member>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Member> add(@RequestBody Member m){
		m = service.add(m);
		return new ResponseEntity<Member>(m, HttpStatus.CREATED);
	}

}
