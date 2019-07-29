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
public class MemType {
	
	@Id
	@Column(name="MEMTYPEID")
	@SequenceGenerator(name="memType_seq_gen", sequenceName="memType_seq", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="memType_seq_gen", strategy=GenerationType.SEQUENCE)
	private int memTypeId;
	
	@Column(nullable=false)
	private String memTypeName;
	
	@Column(precision=5, scale=2)
	private BigDecimal memTypePrice;
	
	public MemType() {
		
	}

	public MemType(int memTypeId, String memTypeName, BigDecimal memTypePrice) {
		super();
		this.memTypeId = memTypeId;
		this.memTypeName = memTypeName;
		this.memTypePrice = memTypePrice;
	}

	public int getMemTypeId() {
		return memTypeId;
	}

	public void setMemTypeId(int memTypeId) {
		this.memTypeId = memTypeId;
	}

	public String getMemTypeName() {
		return memTypeName;
	}

	public void setMemTypeName(String memTypeName) {
		this.memTypeName = memTypeName;
	}
	
	public BigDecimal getMemTypePrice() {
		return memTypePrice;
	}

	public void setMemTypePrice(BigDecimal memTypePrice) {
		this.memTypePrice = memTypePrice;
	}

}