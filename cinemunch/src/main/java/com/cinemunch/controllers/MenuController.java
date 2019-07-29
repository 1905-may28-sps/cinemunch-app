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

import com.cinemunch.beans.Menu;
import com.cinemunch.service.MenuService;

@RestController
@CrossOrigin("*")
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	MenuService service;
	
	@RequestMapping
	public ResponseEntity<List<Menu>> findAll(){
		List<Menu> menus = service.getAll();
		if(menus == null || menus.size() == 0) return new ResponseEntity<List<Menu>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Menu>>(menus, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Menu> add(@RequestBody Menu m){
		m = service.add(m);
		return new ResponseEntity<Menu>(m, HttpStatus.CREATED);
	}
	
}
