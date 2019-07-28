package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.SeatingChart;
import com.cinemunch.repositories.SeatingChartRepository;

@Service
public class SeatingChartService {

	@Autowired
	SeatingChartRepository seatingChartRepo;
	
	public SeatingChart add(SeatingChart seatingChart) {
		return seatingChartRepo.save(seatingChart);
	}
	
	public List<SeatingChart> getAll(){
		return seatingChartRepo.findAll();
	}
	
	public SeatingChart patch(int seatId, SeatingChart seatingChart) {
		return seatingChartRepo.save(seatingChart);
	}
	
}
