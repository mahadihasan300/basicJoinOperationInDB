package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MemberInfo {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String address;
	
	
	
	public MemberInfo() {
		super();
	}
	
	
	public MemberInfo(Long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
