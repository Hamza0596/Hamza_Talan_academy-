package com.thp.project.vintud.entity.impl;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		UserImpl u1 =new UserImpl( "omarbouachir@yaho.com" , "BOUACHIR","omar","omar123", "123456","56789654","ariena",1) ;
		
		
       // Factory.getAnnonce().deleteAnnounce(11);
        //Factory.getUser().creatUserAcount(u1);
       // Recherche recherche  =new Recherche("vettement enfant ","S","bleu",50.6,20.4,1) ;
       // Factory.Get_Recherche_Dao().Createresearch(recherche);
		//ArrayList l =Factory.getAnnonce().showAllAnnouncement();
		//AnnouncementImpl  a =(AnnouncementImpl) l.get(3);
		
		//System.out.println(a.getId());
		
		//String h =Factory.getUser().findUserById(12);
		//System.out.println(h);
       
		
     //  boolean res=Factory.Get_Favoris_Dao().favouredOrNo(1);
     // System.out.println(res);
    
	}

}
