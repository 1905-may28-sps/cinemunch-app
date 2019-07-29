package com.cinemunch.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Orders {
	
	@EmbeddedId
	private OrderId orderId;
	
	@ManyToOne
	@MapsId ("MEMBERID")
	@JoinColumn(name = "MEMBERID")
	private Member member;
	
	@ManyToOne
	@MapsId ("MOVIEID")
	@JoinColumn(name = "MOVIEID")
	private Movie movie;
	
	@ManyToOne
	@MapsId ("SEATID")
	@JoinColumn(name = "SEATID")
	private SeatingChart seatingChart;
	
	@ManyToOne
	@MapsId ("MENUID")
	@JoinColumn(name = "MENUID")
	private Menu menu;
	
	public Orders() {
		
	}

	public Orders(OrderId orderId, Member member, Movie movie, SeatingChart seatingChart, Menu menu) {
		super();
		this.orderId = orderId;
		this.member = member;
		this.movie = movie;
		this.seatingChart = seatingChart;
		this.menu = menu;
	}

	public OrderId getOrderId() {
		return orderId;
	}

	public void setOrderId(OrderId orderId) {
		this.orderId = orderId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public SeatingChart getSeatingChart() {
		return seatingChart;
	}

	public void setSeatingChart(SeatingChart seatingChart) {
		this.seatingChart = seatingChart;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
}
