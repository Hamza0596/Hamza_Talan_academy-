package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "recherche")
public class Recherche {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column(name = "taille")
	private String size;
    @Column(name = "couleur")
	private String color;
    @Column(name = "prix_maxi") 
	private double max_Price;
    @Column(name = "prix_mini") 
	private double min_Price;
    @ManyToOne @JoinColumn( name="user_id" )
	private UserImpl user;
	
	public Recherche() {
	}
    
	public Recherche(int id, String size, String color, double max_Price, double min_Price, UserImpl user) {
		super();
		this.id = id;
		this.size = size;
		this.color = color;
		this.max_Price = max_Price;
		this.min_Price = min_Price;
		this.user = user;
	}
	
	
	public Recherche(String size, String color, double max_Price, double min_Price, UserImpl user) {
		super();
		this.size = size;
		this.color = color;
		this.max_Price = max_Price;
		this.min_Price = min_Price;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMax_Price() {
		return max_Price;
	}

	public void setMax_Price(double max_Price) {
		this.max_Price = max_Price;
	}

	public double getMin_Price() {
		return min_Price;
	}

	public void setMin_Price(double min_Price) {
		this.min_Price = min_Price;
	}

	public UserImpl getUser() {
		return user;
	}

	public void setUser(UserImpl user) {
		this.user = user;
	}


	
	

}
