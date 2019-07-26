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
	
}
