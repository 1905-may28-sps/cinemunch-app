package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.Member;
import com.cinemunch.beans.SeatingChart;
import com.cinemunch.beans.ShowTime;
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
	
	public SeatingChart patch(SeatingChart seatingChart) {
		SeatingChart s = seatingChartRepo.findOne(seatingChart.getSeatId());
		return s;
	}
	
	public SeatingChart occupy(SeatingChart seatingChart) {
		SeatingChart s = seatingChartRepo.findByOccupancyId(seatingChart.getOccupancyId());
		while(s != null) { //this means someone has occupied this seat.
		return null;}
		return seatingChartRepo.save(seatingChart);//otherwise save occupancyId
	}
	
}