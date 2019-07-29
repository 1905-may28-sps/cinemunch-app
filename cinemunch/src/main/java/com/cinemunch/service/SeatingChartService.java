package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.Movie;
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
	public SeatingChart save(SeatingChart seatingChart ) {
		return seatingChartRepo.save(seatingChart);
	}
	
	public SeatingChart getById(int id) {
		return seatingChartRepo.findOne(id);
	}
	
	public SeatingChart getSeats(int id) {
		SeatingChart s = getById(id);
		return s;
	}
	
	
	
	
	
	
	
//	public SeatingChart patch(Class<Integer> seatId, SeatingChart seatingChart) {
//		return seatingChartRepo.save(seatId);
//	}
	
//	public void patch(SeatingChart toBePatched) {
//        Optional<SeatingChart> optionalSeatingChart = SeatingChartRepository.findOne(toBePatched.getSeatId());
//        if (optionalSeatingChart.isPresent()) {
//            SeatingChart fromDb = optionalSeatingChart.get();
//            beanUtils.copyProperties(fromDb, toBePatched);
//            updateSeatingChart(fromDb);
//        }
//    }
	
	
}
