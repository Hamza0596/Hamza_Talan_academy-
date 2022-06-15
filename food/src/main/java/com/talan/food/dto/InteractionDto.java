package com.talan.food.dto;
import com.talan.food.entities.User;

public class InteractionDto {
	

	private Long id;
	private String type;
	private String description;
	private int value;
	private User user;

	public InteractionDto() {
	}

	public InteractionDto(String type, String description, int value, User user) {
		this.type = type;
		this.description = description;
		this.value = value;
		this.user = user;
	}

	public InteractionDto(Long id, String type, String description, int value, User user) {
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
		return "InteractionDto [id=" + id + ", type=" + type + ", description=" + description + ", value=" + value
				+ ", user=" + user + "]";
	}
	
	
	
	
	

}
