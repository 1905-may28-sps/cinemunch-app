

package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.Movie;
import com.cinemunch.beans.MovieAndTimeslot;
import com.cinemunch.beans.ShowTime;
import com.cinemunch.repositories.MovieRepository;
import com.cinemunch.repositories.ShowTimeRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepo;
	
	@Autowired
	ShowTimeRepository showtimeRepo;
	
	public Movie add(Movie movie) {
		return movieRepo.save(movie);
	}
	
	public List<Movie> getAll(){
		return movieRepo.findAll();
	}
	
	public Movie getById(int id) {
		return movieRepo.findOne(id);
	}
	
	public MovieAndTimeslot getListings(int id) {
		Movie m = getById(id);
		
		MovieAndTimeslot listings = new MovieAndTimeslot();
		listings.setMovie(m);
		List<ShowTime> times = showtimeRepo.getShowTimeByMovie(m);
		listings.setShowtimes(times);
		return listings;
	}
}
