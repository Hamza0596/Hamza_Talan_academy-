package com.talan.food.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Interaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String description;
	private int value;
	@ManyToOne @JoinColumn(name="userId" )
	private User user;
	
	public Interaction() {
	}

	
	public Interaction(String type, String description, int value, User user) {
		super();
		this.type = type;
		this.description = description;
		this.value = value;
		this.user = user;
	}


	public Interaction(Long id, String type, String description, int value, User user) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.value = value;
		this.user = user;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Interaction [id=" + id + ", type=" + type + ", description=" + description + ", value=" + value
				+ ", user=" + user + "]";
	}
	
	
	
	

}
