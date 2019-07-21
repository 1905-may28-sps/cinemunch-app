package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemunch.beans.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{
	
}
