package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.Menu;
import com.cinemunch.repositories.MenuRepository;

@Service
public class MenuService {

	@Autowired
	MenuRepository menuRepo;
	
	public Menu add(Menu menu) {
		return menuRepo.save(menu);
	}
	
	public List<Menu> getAll(){
		return menuRepo.findAll();
	}
	
}
