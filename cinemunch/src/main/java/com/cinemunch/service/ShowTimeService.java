package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.ShowTime;
import com.cinemunch.repositories.ShowTimeRepository;

@Service
public class ShowTimeService {

	@Autowired
	ShowTimeRepository showTimeRepo;
	
	public ShowTime add(ShowTime showTime) {
		return showTimeRepo.save(showTime);
	}
	
	public List<ShowTime> getAll(){
		return showTimeRepo.findAll();
	}
	
}
