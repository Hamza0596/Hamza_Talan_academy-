package com.thp.project.vintud.entity.impl;

public interface AnnonceDAO {
	public void showAllAnnouncement();
    public void createAnnounce(AnnouncementImpl An);
    public void deleteAnnounce(int id);
    public void anounceUpdate(AnnouncementImpl An ,String newTitle, double newPrice,String newPicture);
    public void getAnnounceByName_Catégorie_Price(String title,double price, int categorie);
    public void getAnnouceByLocalisation(String localisation);
    
} 
