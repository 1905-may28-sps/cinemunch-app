package com.cinemunch.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class MembershipType {
	
	@Id
	@Column(name="MEMBERSHIPTYPEID")
	@SequenceGenerator(name="membershipType_seq_gen", sequenceName="membershipType_seq", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="membershipType_seq_gen", strategy=GenerationType.SEQUENCE)
	private int membershipTypeId;
	
	@Column(nullable=false)
	private String membershipTypeName;
	
	@Column(precision=5, scale=2)
	private BigDecimal membershipTypePrice;
	
	public MembershipType() {
		
	}

	public MembershipType(int membershipTypeId, String membershipTypeName, BigDecimal membershipTypePrice) {
		super();
		this.membershipTypeId = membershipTypeId;
		this.membershipTypeName = membershipTypeName;
		this.membershipTypePrice = membershipTypePrice;
	}

	public int getMembershipTypeId() {
		return membershipTypeId;
	}

	public void setMembershipTypeId(int membershipTypeId) {
		this.membershipTypeId = membershipTypeId;
	}

	public String getMembershipTypeName() {
		return membershipTypeName;
	}

	public void setMembershipTypeName(String membershipTypeName) {
		this.membershipTypeName = membershipTypeName;
	}
	
	public BigDecimal getMembershipTypePrice() {
		return membershipTypePrice;
	}

	public void setMembershipTypePrice(BigDecimal membershipTypePrice) {
		this.membershipTypePrice = membershipTypePrice;
	}

}
