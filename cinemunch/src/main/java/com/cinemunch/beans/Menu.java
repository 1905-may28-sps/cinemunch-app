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
public class Menu {
	
	@Id
	@Column(name="MENUID")
	@SequenceGenerator(name="menu_seq_gen", sequenceName="menu_seq", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="menu_seq_gen", strategy=GenerationType.SEQUENCE)
	private int menuId;
	
	@Column(nullable=false)
	private String mealName;
	
	@Column(nullable=false, length=1000)
	private String mealDescription;
	
	@Column(precision=5, scale=2, nullable=false)
	private BigDecimal mealPrice;
	
	public Menu() {
		
	}

	public Menu(int menuId, String mealName, String mealDescription, BigDecimal mealPrice) {
		super();
		this.menuId = menuId;
		this.mealName = mealName;
		this.mealDescription = mealDescription;
		this.mealPrice = mealPrice;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public String getMealDescription() {
		return mealDescription;
	}

	public void setMealDescription(String mealDescription) {
		this.mealDescription = mealDescription;
	}

	public BigDecimal getMealPrice() {
		return mealPrice;
	}

	public void setMealPrice(BigDecimal mealPrice) {
		this.mealPrice = mealPrice;
	}
	
	

}
