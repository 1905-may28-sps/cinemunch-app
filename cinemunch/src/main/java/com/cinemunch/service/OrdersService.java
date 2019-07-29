package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.Orders;
import com.cinemunch.repositories.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	OrdersRepository ordersRepo;
	
	public Orders add(Orders orders) {
		return ordersRepo.save(orders);
	}
	
	public List<Orders> getAll(){
		return ordersRepo.findAll();
	}

}
