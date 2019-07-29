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

import com.cinemunch.beans.ShowTime;
import com.cinemunch.service.ShowTimeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/showtime")
public class ShowTimeController {
	
	@Autowired
	ShowTimeService service;
	
	@RequestMapping
	public ResponseEntity<List<ShowTime>> findAll(){
		List<ShowTime> showTimes = service.getAll();
		if(showTimes == null || showTimes.size() == 0) return new ResponseEntity<List<ShowTime>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<ShowTime>>(showTimes, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ShowTime> add(@RequestBody ShowTime s){
		s = service.add(s);
		return new ResponseEntity<ShowTime>(s, HttpStatus.CREATED);
	}
	
	

}
