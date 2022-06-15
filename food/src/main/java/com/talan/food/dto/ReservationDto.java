package com.talan.food.dto;
import java.util.Date;
import com.talan.food.entities.User;

public class ReservationDto {

	
	private Long id;
	private double price;
	private User  user;
	private Date date;
	private boolean confirmed;
	
	public ReservationDto() {
		this.confirmed=false;
	}
	
	
	
	public ReservationDto(double price, User user, Date date) {
		this.price = price;
		this.user = user;
		this.date = date;
		this.confirmed=false;

	}
	
	
	public ReservationDto(Long id, double price, User user, Date date) {
		this.id = id;
		this.price = price;
		this.user = user;
		this.date = date;
		this.confirmed=false;

	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	public boolean isConfirmed() {
		return confirmed;
	}


	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}


	@Override
	public String toString() {
		return "ReservationDto [id=" + id + ", price=" + price + ", user=" + user + ", date=" + date + ", confirmed="
				+ confirmed + "]";
	}
	
	
	
	

}
