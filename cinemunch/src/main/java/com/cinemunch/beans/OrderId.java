package com.cinemunch.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderId implements Serializable{
	
	@Column(name = "MEMBERID")
	private int memberId;
	
	@Column(name = "MOVIEID")
	private int movieId;
	
	@Column(name = "SEATID")
	private int seatId;
	
	@Column(name = "MENUID")
	private int menuId;
	
	public OrderId() {}

	public OrderId(int memberId, int movieId, int seatId, int menuId) {
		super();
		this.memberId = memberId;
		this.movieId = movieId;
		this.seatId = seatId;
		this.menuId = menuId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

}
