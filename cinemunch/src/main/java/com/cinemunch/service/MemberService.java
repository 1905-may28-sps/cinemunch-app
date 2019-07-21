package com.cinemunch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemunch.beans.Member;
import com.cinemunch.repositories.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepo;
	
	public Member add(Member member) {
		return memberRepo.save(member);
	}
	
	public List<Member> getAll(){
		return memberRepo.findAll();
	}

}
