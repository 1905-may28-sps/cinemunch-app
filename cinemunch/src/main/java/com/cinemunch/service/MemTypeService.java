package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.MemType;
import com.cinemunch.repositories.MemTypeRepository;

@Service
public class MemTypeService {
	
	@Autowired
	MemTypeRepository memTypeRepo;
	
	public MemType add(MemType memType) {
		return memTypeRepo.save(memType);
	}
	
	public List<MemType> getAll(){
		return memTypeRepo.findAll();
	}

}