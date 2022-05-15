package com.thp.project.vintud.entity.impl;

public class Recherche {
	private int id;
	private String typeClothing;
	private String size;
	private String color;
	private double max_Price;
	private double min_Price;
	private int User_id;
	
	public Recherche() {
	}
	public Recherche(int id,String typeClothing,String size,String color,double max_Price,double min_Price,int  User_id) {
		this.id=id;
		this.typeClothing=typeClothing;
		this.size=size;
		this.color=color;
		this.max_Price=max_Price;
		this.min_Price=max_Price;
		this.User_id=User_id;
	}
	
	public Recherche(String typeClothing,String size,String color,double max_Price,double min_Price,int User_id) {
		this.typeClothing=typeClothing;
		this.size=size;
		this.color=color;
		this.max_Price=max_Price;
		this.min_Price=min_Price;
		this.User_id=User_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeClothing() {
		return typeClothing;
	}
	public void setTypeClothing(String typeClothing) {
		this.typeClothing = typeClothing;
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
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	
	
	
	
	

}
