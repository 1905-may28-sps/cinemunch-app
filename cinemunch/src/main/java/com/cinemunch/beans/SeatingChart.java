package com.cinemunch.beans;

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
public class SeatingChart {
	
	@Id
	@SequenceGenerator(name="seatingChart_seq_gen", sequenceName="seatingChart_seq", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="seatingChart_seq_gen", strategy=GenerationType.SEQUENCE)
	private int seatId;
	
	@ManyToOne
	@JoinColumn(name="SHOWTIMEID")
	private ShowTime showTime;
	
	public SeatingChart() {
		
	}

	public SeatingChart(int seatId, ShowTime showTime) {
		super();
		this.seatId = seatId;
		this.showTime = showTime;
	}
	
	public int getSeatId() {
		return seatId;
	}
	
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	
	public ShowTime getShowTime() {
		return showTime;
	}
	
	public void setShowTime(ShowTime showTime) {
		this.showTime = showTime;
	}	

}
