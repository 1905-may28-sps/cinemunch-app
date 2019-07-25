package com.cinemunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cinemunch.beans.Member;

@Transactional
@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{
	
	Member findByUsernameLikeIgnoreCase(String username);
	
//	Member findByUsernameLikeIgnoreCaseAndPassword(String username, String password);
	
}
