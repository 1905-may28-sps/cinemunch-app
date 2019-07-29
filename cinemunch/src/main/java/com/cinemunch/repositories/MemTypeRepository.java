package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemunch.beans.MemType;

@Repository
public interface MemTypeRepository extends JpaRepository<MemType, Integer>{

}