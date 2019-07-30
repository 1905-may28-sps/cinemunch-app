package com.cinemunch.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderId implements Serializable{
	
	@Column(name = "SHOWTIMEID")

	private int showtimeId;

	private int showTimeId;

	
	@Column(name = "SEATID")
	private int seatId;
	
	public OrderId() {}

	public OrderId(int showTimeId, int seatId) {
		super();
		this.showTimeId = showTimeId;
		this.seatId = seatId;
	}

	public int getShowTimeId() {
		return showTimeId;
	}

	public void setShowTimeId(int showTimeId) {
		this.showTimeId = showTimeId;

	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}



}

	


