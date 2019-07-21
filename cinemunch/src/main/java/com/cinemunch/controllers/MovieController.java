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

import com.cinemunch.beans.Movie;
import com.cinemunch.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService service;
	
	@RequestMapping
	public ResponseEntity<List<Movie>> findAll(){
		List<Movie> movies = service.getAll();
		if(movies == null || movies.size() == 0) return new ResponseEntity<List<Movie>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Movie> add(@RequestBody Movie m){
		m = service.add(m);
		return new ResponseEntity<Movie>(m, HttpStatus.CREATED);
	}

}
