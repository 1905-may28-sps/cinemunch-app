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

import com.cinemunch.beans.Orders;
import com.cinemunch.service.OrdersService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/orders")
public class OrderController {
	
	@Autowired
	OrdersService service;

//	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,
//			produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Orders> add(@RequestBody Orders orders){
//		orders = service.add(orders);
//		return new ResponseEntity<Orders>(orders, HttpStatus.CREATED);
//	}
	//or orderId???
	@RequestMapping(value="/{showTimeId}", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Orders> add(@RequestBody Orders orders, @PathVariable int showTimeId){
		orders = service.add(orders);
		return new ResponseEntity<Orders>(orders, HttpStatus.CREATED);
	}

	@RequestMapping(value="/{showTimeId}")
	public ResponseEntity<List<Orders>> findAll(@PathVariable int showTimeId){
		List<Orders> orders = service.getAll();
		if(orders == null || orders.size() == 0) return new ResponseEntity<List<Orders>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
	}

}

//package com.cinemunch.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cinemunch.beans.Orders;
//import com.cinemunch.beans.ShowTime;
//import com.cinemunch.service.OrdersService;
//
//@RestController
//@CrossOrigin("*")
//@RequestMapping(value="/orders")
//public class OrderController {
//	
//	@Autowired
//	OrdersService service;
//	
//	@RequestMapping
//	public ResponseEntity<List<Orders>> findAll(){
//		List<Orders> orders = service.getAll();
//		if(orders == null || orders.size() == 0) return new ResponseEntity<List<Orders>>(HttpStatus.NO_CONTENT);
//		return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
//	}
//	
//	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Orders> add(@RequestBody Orders o){
//		o = service.add(o);
//		return new ResponseEntity<Orders>(o, HttpStatus.CREATED);
//	}
//
//}
