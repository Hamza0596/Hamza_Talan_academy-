package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity @Table(name = "users")
public class UserImpl implements User{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column(name = "first_name")
	private String Name;
    @Column(name = "last_name")
	private String last_Name;
	private String pseudo;
	private String mail;
    @Column(name = "u_password")
	private String password;
    @Column(name = "phone")
	private String phone_Number;
    @Column(name = "address")
	private String adress;
    @ManyToOne @JoinColumn( name="roleid" )
    private RoleImpl role;    
    
    
    
	/*List<AnnouncementImpl> announcementList= new ArrayList<AnnouncementImpl>();
	List<AnnouncementImpl> announcement_Favorised_List= new ArrayList<AnnouncementImpl>();*/
	
	
	public UserImpl() {
	}

	public UserImpl(int id, String name, String last_Name, String pseudo, String mail, String password,
			String phone_Number, String adress, RoleImpl role) {
		this.id = id;
		this.Name = name;
		this.last_Name = last_Name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.phone_Number = phone_Number;
		this.adress = adress;
		this.role = role;
	}
	
	

	public UserImpl(String name, String last_Name, String pseudo, String mail, String password, String phone_Number,
			String adress, RoleImpl role) {
		this.Name = name;
		this.last_Name = last_Name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.phone_Number = phone_Number;
		this.adress = adress;
		this.role = role;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public RoleImpl getRole() {
		return role;
	}

	public void setRole(RoleImpl role) {
		this.role = role;
	}

}