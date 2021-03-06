package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleImpl implements Role{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column(name = "nom")
	private String name;
	
    
	
    
	public RoleImpl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	



	public RoleImpl(String name) {
		super();
		this.name = name;
	}





	public RoleImpl() {
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

}
