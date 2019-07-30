

package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemunch.beans.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	
}

