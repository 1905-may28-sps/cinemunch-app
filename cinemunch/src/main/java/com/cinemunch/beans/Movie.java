package com.cinemunch.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Movie {

	@Id
	@Column(name="MOVIEID")
	@SequenceGenerator(name="movie_seq_gen", sequenceName="movie_seq", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="movie_seq_gen", strategy=GenerationType.SEQUENCE)
	private int movieId;
	
	@Column(nullable=false)
	private String movieName;
	
	private String movieActors;
	
	@Column(length=1000)
	private String movieDescription;
	
	@Column(precision=5, scale=2, nullable=false)
	private BigDecimal ticketPrice;
	
	public Movie() {
		
	}

	public Movie(int movieId, String movieName, String movieActors, String movieDescription, BigDecimal ticketPrice) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieActors = movieActors;
		this.movieDescription = movieDescription;
		this.ticketPrice = ticketPrice;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getMovieActors() {
		return movieActors;
	}

	public void setMovieActors(String movieActors) {
		this.movieActors = movieActors;
	}
	
	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	
}
