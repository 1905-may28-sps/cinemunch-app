package com.cinemunch.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderId implements Serializable{
	
	@Column(name = "SHOWTIMEID")
	private int showtimeId;
	
	@Column(name = "SEATID")
	private int seatId;
	
	public OrderId() {}

	public OrderId(int showtimeId, int seatId) {
		super();
		this.showtimeId = showtimeId;
		this.seatId = seatId;
	}

	public int getShowtimeId() {
		return showtimeId;
	}

	public void setShowtimeId(int showtimeId) {
		this.showtimeId = showtimeId;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

}
