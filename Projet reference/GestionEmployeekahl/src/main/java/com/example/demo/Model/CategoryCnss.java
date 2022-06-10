package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class CategoryCnss {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(nullable = false, updatable = false)
	public  String type;
	
	  
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
	
	
	
	
	public CategoryCnss() {
		
	}
	

	public CategoryCnss(String type) {
		this.type = type;
	}

	public CategoryCnss(long id, String type) {
		this.id = id;
		this.type = type;
	}
	
	
	

}
