package com.cinemunch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cinemunch.beans.SeatingChart;
import com.cinemunch.repositories.SeatingChartRepository;
import com.cinemunch.service.SeatingChartService;

@RestController
@RequestMapping("/seatingchart")
@CrossOrigin("*")
public class SeatingChartController {
	
	@Autowired
	SeatingChartService service;
	
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
	
	
//	@PutMapping("/heavyresource/{id}")
//	@RequestMapping(value= "/{seatId}", method=RequestMethod.PUT)
//	public ResponseEntity<?> save(@RequestBody SeatingChart seatingchart,
//	  @PathVariable("seatid") String id) {
//	    SeatingChartRepository.save(seatingchart, id);
//	    return ResponseEntity.ok("resource saved");}
	
	
	
	
//	@RequestMapping(value="/{seatId}", method=RequestMethod.PATCH, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<SeatingChart> patch( @RequestBody SeatingChart p){
//		p = service.patch(int, p);
//		return new ResponseEntity(p, HttpStatus.ACCEPTED);
//	}
	
//	@PatchMapping("/{id}")
//    ResponseEntity<?> saveSeat(@RequestBody Map<String, String> seats) {
//        SeatingChart toBePatchedSeatingChart = objectMapper.convertValue(seats, SeatingChart.class);
//        showTimeservice.patch(toBePatchedSeatingChart);
//    }

}
