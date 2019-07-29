package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemunch.beans.SeatingChart;

@Repository
public interface SeatingChartRepository extends JpaRepository<SeatingChart, Integer>{


	SeatingChart findByOccupancyId(String occupancyId);

}
