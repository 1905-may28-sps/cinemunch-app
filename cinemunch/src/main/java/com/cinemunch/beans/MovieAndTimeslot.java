package com.cinemunch.beans;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MovieAndTimeslot {
	
	private Movie movie;
	private List<ShowTime> showtimes;
	
	public MovieAndTimeslot() {}

	public MovieAndTimeslot(Movie movie, List<ShowTime> showtimes) {
		super();
		this.movie = movie;
		this.showtimes = showtimes;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public List<ShowTime> getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(List<ShowTime> showtimes) {
		this.showtimes = showtimes;
	}

	@Override
	public String toString() {
		return "MovieAndTimeslot [movie=" + movie + ", showtimes=" + showtimes + "]";
	}
	
	
	
	
}
