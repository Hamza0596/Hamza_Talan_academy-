package com.thp.project.vintud.entity.impl;

import java.util.ArrayList;
import java.util.List;

public interface AnnonceDAO {
	public  ArrayList showAllAnnouncement();
    public boolean createAnnounce(AnnouncementImpl An);
    public void deleteAnnounce(int id);
    public void anounceUpdate(AnnouncementImpl An, String newTitle, double newPrice, String newPicture);
    public void getAnnounceByName_Catégorie_Price(String title,double price, int categorie);
    public void getAnnouceByLocalisation(String localisation);
    public ArrayList showAnnouncementById(int myId) ;

} 
