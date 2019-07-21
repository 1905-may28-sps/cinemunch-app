package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemunch.beans.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer>{

}
