package com.example.demo.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name = "favoris")
public class Favoris {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @OneToOne @JoinColumn(name = "id")
    private AnnouncementImpl announce;
    @OneToOne @JoinColumn(name = "id")
    private UserImpl user;
	private Date favory_date;
	
	
	public Favoris(int id, AnnouncementImpl announce, UserImpl user, Date favory_date) {
		super();
		this.id = id;
		this.announce = announce;
		this.user = user;
		this.favory_date = favory_date;
	}


	public Favoris(AnnouncementImpl announce, UserImpl user, Date favory_date) {
		super();
		this.announce = announce;
		this.user = user;
		this.favory_date = favory_date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public AnnouncementImpl getAnnounce() {
		return announce;
	}


	public void setAnnounce(AnnouncementImpl announce) {
		this.announce = announce;
	}


	public UserImpl getUser() {
		return user;
	}


	public void setUser(UserImpl user) {
		this.user = user;
	}


	public Date getFavory_date() {
		return favory_date;
	}


	public void setFavory_date(Date favory_date) {
		this.favory_date = favory_date;
	}
	
	
	

	
	
	
}


