<<<<<<< HEAD
package com.cinemunch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemunch.beans.Orders;
import com.cinemunch.beans.ShowTime;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	

	List<Orders> findSeatIdByShowTime(int showTimeId);
	
}
=======
package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemunch.beans.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	
}
>>>>>>> 6c86bf47d39ce90e04001c8e6d2200440a62cd97
