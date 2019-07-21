package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemunch.beans.MembershipType;

@Repository
public interface MembershipTypeRepository extends JpaRepository<MembershipType, Integer>{

}
