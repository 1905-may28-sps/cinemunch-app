package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.OrderKey;
import com.cinemunch.repositories.OrderKeyRepository;

@Service
public class OrderKeyService {
	
	@Autowired
	OrderKeyRepository orderKeyRepo;
	
	public OrderKey add(OrderKey orderKey) {
		return orderKeyRepo.save(orderKey);
	}
	
	public List<OrderKey> getAll(){
		return orderKeyRepo.findAll();
	}

}
