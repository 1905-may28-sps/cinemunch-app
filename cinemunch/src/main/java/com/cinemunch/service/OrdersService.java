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
//	ShowTime showTime = new ShowTime();
	
	public Orders add(Orders orders) {
		return ordersRepo.save(orders);
	}
	
	public List<Orders> getAll(){
		return ordersRepo.findAll();
	}
	
//	public List<Orders> getSeatId(int id){
////	Seat s = getBySeatId();
//	Orders orders = new Orders();
//	orders.setSeatId(id);
//	List<Orders> orders1 = ordersRepo.findSeatIdByShowTimeId(id);
//	return orders1;
//	}
}
