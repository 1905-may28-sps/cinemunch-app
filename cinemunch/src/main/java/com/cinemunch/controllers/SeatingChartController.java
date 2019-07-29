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
import com.cinemunch.beans.SeatingChart;
import com.cinemunch.beans.ShowTime;
import com.cinemunch.service.SeatingChartService;

@RestController
@RequestMapping("/seatingchart")
@CrossOrigin("*")
public class SeatingChartController {
	
	@Autowired
	SeatingChartService service;
	ShowTime sbean;
	
	@RequestMapping
	public ResponseEntity<List<SeatingChart>> findAll(){
		List<SeatingChart> seatingCharts = service.getAll();
		if(seatingCharts == null || seatingCharts.size() == 0) return new ResponseEntity<List<SeatingChart>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<SeatingChart>>(seatingCharts, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SeatingChart> add(@RequestBody SeatingChart s){
		s = service.add(s);
		return new ResponseEntity<SeatingChart>(s, HttpStatus.CREATED);
	}
	
//	@RequestMapping(value="{seatId}", method=RequestMethod.PATCH, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<ShowTime> patch( @RequestBody ShowTime p){
//		p = service.patch(2, p);
//		return new ResponseEntity(p, HttpStatus.ACCEPTED);
//	}
	
	@RequestMapping(value="{seatId}", method=RequestMethod.PATCH, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SeatingChart> findOne(@RequestBody SeatingChart seatInfo){
		System.out.println(seatInfo.toString());
		SeatingChart s = service.patch(seatInfo);
		if (s != null) {
			s.setShowTime(sbean);
			return new ResponseEntity<SeatingChart>(s, HttpStatus.OK);
		}
		return new ResponseEntity<SeatingChart>(HttpStatus.UNAUTHORIZED);
	}

}