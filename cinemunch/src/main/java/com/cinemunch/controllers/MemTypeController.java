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

import com.cinemunch.beans.MemType;
import com.cinemunch.service.MemTypeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/memtype")
public class MemTypeController {
	
	@Autowired
	MemTypeService service;
	
	@RequestMapping
	public ResponseEntity<List<MemType>> findAll(){
		List<MemType> memTypes = service.getAll();
		if(memTypes == null || memTypes.size() == 0) return new ResponseEntity<List<MemType>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<MemType>>(memTypes, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MemType> add(@RequestBody MemType m){
		m = service.add(m);
		return new ResponseEntity<MemType>(m, HttpStatus.CREATED);
	}

}