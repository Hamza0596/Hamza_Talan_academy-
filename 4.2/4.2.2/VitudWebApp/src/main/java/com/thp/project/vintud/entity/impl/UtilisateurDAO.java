package com.thp.project.vintud.entity.impl;

public interface UtilisateurDAO {
	public void creatUserAcount(UserImpl u);
	 public boolean logIn (String mail, String mdp);
	 public void infoUpdate(UserImpl u);
	 public void ConsultSellerInformation(AnnouncementImpl An);
	 public void addRole(int id,String name);
	 
}
