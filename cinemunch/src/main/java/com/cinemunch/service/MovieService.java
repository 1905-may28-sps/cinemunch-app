package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.Movie;
import com.cinemunch.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepo;
	
	public Movie add(Movie movie) {
		return movieRepo.save(movie);
	}
	
	public List<Movie> getAll(){
		return movieRepo.findAll();
	}
	
}
