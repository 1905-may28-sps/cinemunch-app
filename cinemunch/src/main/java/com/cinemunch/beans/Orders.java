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
	@MapsId ("SHOWTIMEID")
	@JoinColumn(name = "SHOWTIMEID")
	private ShowTime showTime;
	
	private int seatId;
	
	@ManyToOne
	@MapsId ("MENUID")
	@JoinColumn(name = "MENUID")
	private Menu menu;
	
	public Orders() {
		
	}

	public Orders(OrderId orderId, Member member, ShowTime showTime, int seatId, Menu menu) {
		super();
		this.orderId = orderId;
		this.member = member;
		this.showTime = showTime;
		this.seatId = seatId;
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

	public ShowTime getShowTime() {
		return showTime;
	}

	public void setShowTime(ShowTime showTime) {
		this.showTime = showTime;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	
}
