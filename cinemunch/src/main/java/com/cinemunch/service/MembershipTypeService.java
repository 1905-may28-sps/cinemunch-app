package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.MembershipType;
import com.cinemunch.repositories.MembershipTypeRepository;

@Service
public class MembershipTypeService {
	
	@Autowired
	MembershipTypeRepository membershipTypeRepo;
	
	public MembershipType add(MembershipType membershipType) {
		return membershipTypeRepo.save(membershipType);
	}
	
	public List<MembershipType> getAll(){
		return membershipTypeRepo.findAll();
	}

}
