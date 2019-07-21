package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemunch.beans.ShowTime;

@Repository
public interface ShowTimeRepository extends JpaRepository<ShowTime, Integer>{

}
