package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.MemberInfoDao;
import com.example.model.MemberInfo;

@RestController
@RequestMapping("/api")
public class MemberInfoController {
	
	@Autowired
	private MemberInfoDao memberInfoDao;
	
	@GetMapping("/hi")
	public String sayHi() {
		return "hi";
	}
	
	@GetMapping("/findAll")
	public List<MemberInfo> findAllMember(){
		return memberInfoDao.findAll();
	}
	
	@GetMapping("/findJoin")
	public  List<Map<Long, Object>> findJoim(){
		return memberInfoDao.findAllAttachAndAttachMapping();
	}

}
