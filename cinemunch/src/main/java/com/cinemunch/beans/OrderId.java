
package com.cinemunch.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderId implements Serializable{
	
	@Column(name = "SHOWTIMEID")
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

	@Override
	public int hashCode() {
		 final int prime = 31;
	        int result = 1;
	        result = prime * result + seatId;
	        result = prime * result + showTimeId;
	        return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderId other = (OrderId) obj;
        if (seatId != other.seatId)
            return false;
        if (showTimeId != other.showTimeId)
            return false;
        return true;
	}

}

