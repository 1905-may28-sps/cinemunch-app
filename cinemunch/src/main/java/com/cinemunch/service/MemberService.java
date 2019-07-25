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
		Member m = memberRepo.findByUsernameLikeIgnoreCase(member.getUsername());
		while(m != null) { 
		return null;}
		return memberRepo.save(new Member(member.getFirstName(), member.getLastName(), member.getDob(), member.getEmail(), member.getUsername(), member.getPassword(), member.getMembershipType(), member.getMovie(), member.getMenu()));
	}
	
	public List<Member> getAll(){
		return memberRepo.findAll();
	}
	
	public Member login(Member member) {
		Member m = memberRepo.findByUsernameLikeIgnoreCase(member.getUsername());
		if(m != null && m.getPassword().equals(member.getPassword()))
			return m;
		return null;
	}

}
