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

import com.cinemunch.beans.Member;
import com.cinemunch.service.MemberService;

@RestController
@CrossOrigin("*")
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/member")
	public ResponseEntity<List<Member>> findAll(){
		List<Member> members = service.getAll();
		if(members == null || members.size() == 0) return new ResponseEntity<List<Member>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Member> findByUsername(@RequestBody Member loginInfo){
		System.out.println(loginInfo.toString());
		Member m = service.login(loginInfo);
		if (m != null) {
			m.setPassword("");
			return new ResponseEntity<Member>(m, HttpStatus.OK);
		}
		return new ResponseEntity<Member>(HttpStatus.UNAUTHORIZED);
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Member> add(@RequestBody Member m){
		Member mem = service.add(m);
		if(mem==null)return new ResponseEntity<Member>(HttpStatus.CONFLICT);
		return new ResponseEntity<Member>(mem, HttpStatus.CREATED);
	}

}
