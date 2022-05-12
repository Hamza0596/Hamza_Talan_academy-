package com.thp.project.vintud.entity.impl;
import java.util.ArrayList;
import java.util.List;

public class UserImpl {
	
	private int id;
	private String mail;
	private String last_Name;
	private String Name;
	private String pseudo;
	private String password;
	private String phone_Number;
	private String adress;
	private int role_id ;
	List<AnnouncementImpl> announcementList= new ArrayList<AnnouncementImpl>();
	List<AnnouncementImpl> announcement_Favorised_List= new ArrayList<AnnouncementImpl>();

	public UserImpl(int  id, String mail , String last_Name,String Name, String pseudo, String password,String phone_Number,String adress,int role_id) {
		
		this.id=id;
		this.mail=mail;
		this.last_Name=last_Name;
		this.Name=Name;
		this.pseudo=pseudo;
		this.password=password;
		this.phone_Number=phone_Number;
		this.adress=adress;
		this.role_id=role_id;
	}
	public UserImpl( String mail , String last_Name,String Name, String pseudo, String password,String phone_Number,String adress,int role_id) {
		
		
		this.mail=mail;
		this.last_Name=last_Name;
		this.Name=Name;
		this.pseudo=pseudo;
		this.password=password;
		this.phone_Number=phone_Number;
		this.adress=adress;
		this.role_id=role_id;
		
	}
	public UserImpl() {
		
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the last_Name
	 */
	public String getLast_Name() {
		return last_Name;
	}

	/**
	 * @param last_Name the last_Name to set
	 */
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phone_Number
	 */
	public String getPhone_Number() {
		return phone_Number;
	}

	/**
	 * @param phone_Number the phone_Number to set
	 */
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}

	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * @return the announcementList
	 */
	public List<AnnouncementImpl> getAnnouncementList() {
		return announcementList;
	}

	/**
	 * @param announcementList the announcementList to set
	 */
	public void setAnnouncementList(List<AnnouncementImpl> announcementList) {
		this.announcementList = announcementList;
	}

	/**
	 * @return the announcement_Favorised_List
	 */
	public List<AnnouncementImpl> getAnnouncement_Favorised_List() {
		return announcement_Favorised_List;
	}

	/**
	 * @param announcement_Favorised_List the announcement_Favorised_List to set
	 */
	public void setAnnouncement_Favorised_List(List<AnnouncementImpl> announcement_Favorised_List) {
		this.announcement_Favorised_List = announcement_Favorised_List;
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
	 * @return the role_id
	 */
	public int getRole_id() {
		return role_id;
	}
	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	
	

}
