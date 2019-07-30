package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemunch.beans.OrderKey;

public interface OrderKeyRepository extends JpaRepository<OrderKey, Integer> {

}
