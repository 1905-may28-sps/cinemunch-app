package com.cinemunch.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Member {

	@Id
	@SequenceGenerator(name="member_seq_gen", sequenceName="member_seq", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="member_seq_gen", strategy=GenerationType.SEQUENCE)
	private int memberId;
	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false)
	private String dob;
		
	private String email;
	
	@Column(nullable=false, unique=true)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name="MEMTYPEID", nullable=false)
	private MemType memType;
	
	public Member() {
		
	}


	public Member(int memberId, String firstName, String lastName, String dob, String email, String username,
			String password, MemType memType) {
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.username = username;
		this.password = password;
		this.memType = memType;
	}


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public MemType getMemType() {
		return memType;
	}

	public void setMemType(MemType memType) {
		this.memType = memType;
	}
	
}
