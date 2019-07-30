package com.cinemunch.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class OrderKey {
	
	@Id
	@Column(name="ORDERKEYID")
	@SequenceGenerator(name="orderKey_seq_gen", sequenceName="orderKey_seq", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="orderKey_seq_gen", strategy=GenerationType.SEQUENCE)
	private int orderKeyId;
	
	@ManyToOne
	@JoinColumn(name = "MEMBERID")
	private Member member;
	
	@ManyToOne
	@JoinColumn(name = "SHOWTIMEID")
	private ShowTime showTime;
	
	private int seatId;
	
	@ManyToOne
	@JoinColumn(name = "MENUID")
	private Menu menu;
	
	public OrderKey() {
		
	}

	public OrderKey(int orderKeyId, Member member, ShowTime showTime, int seatId, Menu menu) {
		super();
		this.orderKeyId = orderKeyId;
		this.member = member;
		this.showTime = showTime;
		this.seatId = seatId;
		this.menu = menu;
	}

	public int getOrderKeyId() {
		return orderKeyId;
	}

	public void setOrderKeyId(int orderKeyId) {
		this.orderKeyId = orderKeyId;
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
