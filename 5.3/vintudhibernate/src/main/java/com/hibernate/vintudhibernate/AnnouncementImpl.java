package com.hibernate.vintudhibernate;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="announcement")
public class AnnouncementImpl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="category_id")
	private int categorie;
	@Column(name="price")
	private double price;
	@Column(name="picture")
	private String photo;
	@Column(name="publication_date")
	private Date publication_Date;
	@Column(name="is_available")
    private	 boolean disponibility_State;
	@Column(name="view_number")
	private int viewNumber;
	@Column(name="localisation")
	private String localisation;
	@Column(name="user_id")
	private int user_id;
	
	
	public AnnouncementImpl(int id,String title,String description,int categorie,double price,String photo,Date publication_Date,boolean disponibility_State,int viewNumber,String localisation, int user_id) {
		this.id=id;
		this.title=title;
		this.description=description;
		this.categorie=categorie;
		this.price=price;
		this.photo=photo;
		this.publication_Date=publication_Date;
		this.disponibility_State=disponibility_State;
		this.viewNumber=viewNumber;
		this.localisation=localisation;
		this.user_id=user_id;
	}
	
	public AnnouncementImpl(String title,String description,int catesgorie,double price,String photo,Date publication_Date,boolean disponibility_State,int viewNumber,String localisation,int user_id) {
		this.title=title;
		this.description=description;
		this.categorie=categorie;
		this.price=price;
		this.photo=photo;
		this.publication_Date=publication_Date;
		this.disponibility_State=disponibility_State;
		this.viewNumber=viewNumber;
		this.localisation=localisation;
		this.user_id=user_id;
	}
	
	public AnnouncementImpl() {
	
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the cat�gorie
	 */
	public int getCategorie() {
		return categorie;
	}

	/**
	 * @param cat�gorie the cat�gorie to set
	 */
	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the publication_Date
	 */
	public Date getPublication_Date() {
		return publication_Date;
	}

	/**
	 * @param publication_Date the publication_Date to set
	 */
	public void setPublication_Date(Date publication_Date) {
		this.publication_Date = publication_Date;
	}

	/**
	 * @return the disponibility_State
	 */
	public boolean getDisponibility_State() {
		return disponibility_State;
	}

	/**
	 * @param disponibility_State the disponibility_State to set
	 */
	public void setDisponibility_State(boolean disponibility_State) {
		this.disponibility_State = disponibility_State;
	}

	/**
	 * @return the viewNumber
	 */
	public int getViewNumber() {
		return viewNumber;
	}

	/**
	 * @param viewNumber the viewNumber to set
	 */
	public void setViewNumber(int viewNumber) {
		this.viewNumber = viewNumber;
	}

	/**
	 * @return the localisation
	 */
	public String getLocalisation() {
		return localisation;
	}

	/**
	 * @param localisation the localisation to set
	 */
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	

}
