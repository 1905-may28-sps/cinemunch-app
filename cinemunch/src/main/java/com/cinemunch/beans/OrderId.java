<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/master
package com.cinemunch.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderId implements Serializable{
	
	@Column(name = "SHOWTIMEID")
<<<<<<< HEAD
	private int showtimeId;
=======
	private int showTimeId;
>>>>>>> refs/remotes/origin/master
	
	@Column(name = "SEATID")
	private int seatId;
	
	public OrderId() {}

<<<<<<< HEAD
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
=======
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
>>>>>>> refs/remotes/origin/master
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

<<<<<<< HEAD

}
=======
	
}
>>>>>>> refs/remotes/origin/master
