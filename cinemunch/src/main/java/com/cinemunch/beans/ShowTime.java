package com.cinemunch.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class ShowTime {
	
	@Id
	@Column(name="SHOWTIMEID")
	@SequenceGenerator(name="showTime_seq_gen", sequenceName="showTime_seq", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="showTime_seq_gen", strategy=GenerationType.SEQUENCE)
	private int showTimeId;
	
	@Column(nullable=false)
	private String showDate;
	
	@ManyToOne
	@JoinColumn(name="MOVIEID")
	private Movie movie;
	
	public ShowTime() {
		
	}

	public ShowTime(int showTimeId, String showDate, Movie movie) {
		super();
		this.showTimeId = showTimeId;
		this.showDate = showDate;
		this.movie = movie;
	}
	
	public int getShowTimeId() {
		return showTimeId;
	}
	
	public void setShowTimeId(int showTimeId) {
		this.showTimeId = showTimeId;
	}
	
	public String getShowDate() {
		return showDate;
	}
	
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	

}
