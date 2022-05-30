package com.example.demo.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  @Table(name = "announcement")
public class AnnouncementImpl implements Announcement{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column(name = "title")
	private String title;
    @Column(name = "description")
	private String description;
    @ManyToOne @JoinColumn( name="category_id" )	
    private CategoryImpl category;
    @Column(name = "price")
	private double price;
    @Column(name = "picture")
	private String photo;
    @Column(name = "publication_date")
	private Date publication_Date;
    @Column(name = "is_available")
    private	 boolean disponibility_State;
    @Column(name = "view_number")
	private int viewNumber;
    @Column(name = "localisation")
	private String localisation;
    @ManyToOne @JoinColumn( name="user_id" )
	private UserImpl user;
	
	

	public AnnouncementImpl() {
	
	}
	
	public AnnouncementImpl(int id, String title, String description, CategoryImpl category, double price, String photo,
			Date publication_Date, boolean disponibility_State, int viewNumber, String localisation, UserImpl user) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.photo = photo;
		this.publication_Date = publication_Date;
		this.disponibility_State = disponibility_State;
		this.viewNumber = viewNumber;
		this.localisation = localisation;
		this.user = user;
	}
	

	public AnnouncementImpl(String title, String description, CategoryImpl category, double price, String photo,
			Date publication_Date, boolean disponibility_State, int viewNumber, String localisation, UserImpl user) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.photo = photo;
		this.publication_Date = publication_Date;
		this.disponibility_State = disponibility_State;
		this.viewNumber = viewNumber;
		this.localisation = localisation;
		this.user = user;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Date getPublication_Date() {
		return publication_Date;
	}


	public void setPublication_Date(Date publication_Date) {
		this.publication_Date = publication_Date;
	}


	public boolean isDisponibility_State() {
		return disponibility_State;
	}


	public void setDisponibility_State(boolean disponibility_State) {
		this.disponibility_State = disponibility_State;
	}


	public int getViewNumber() {
		return viewNumber;
	}


	public void setViewNumber(int viewNumber) {
		this.viewNumber = viewNumber;
	}


	public String getLocalisation() {
		return localisation;
	}


	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}



	public CategoryImpl getCategory() {
		return category;
	}



	public void setCategory(CategoryImpl category) {
		this.category = category;
	}



	public UserImpl getUser() {
		return user;
	}



	public void setUser(UserImpl user) {
		this.user = user;
	}


	
	
	
	

}
