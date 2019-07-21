package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemunch.beans.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
