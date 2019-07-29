
package com.cinemunch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemunch.beans.Orders;
import com.cinemunch.beans.ShowTime;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	

	List<Orders> findSeatIdByShowTime(int showTimeId);
	
}

