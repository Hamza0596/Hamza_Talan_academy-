package com.talan.food.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double price;
	@ManyToOne @JoinColumn(name="userId" )
	private User  user;
	private Date date;
	private boolean confirmed;
	
	

	public Reservation() {
		this.confirmed=false;
	
	}
	
	public Reservation(double price ,User user, Date date) {
		this.price = price;
		this.user = user;
		this.date = date;
		this.confirmed=false;
	}
	

	
	public Reservation(Long id, double price, User user, Date date) {
	
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
		return "Reservation [id=" + id + ", price=" + price + ", user=" + user + ", date=" + date + "]";
	}
	
	
	
	

}
