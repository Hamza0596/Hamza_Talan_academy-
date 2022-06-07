package com.example.demo.DTO;



import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.Entity.RoleImpl;

public class UserDto {
	
	private int id;
	private String Name;
	private String last_Name;
	private String pseudo;
	private String mail;
	private String password;
	private String phone_Number;
	private String adress;
    @ManyToOne @JoinColumn( name="roleid" )
    private RoleImpl role;  

	public UserDto() {
	}
	

	public UserDto(int id, String name, String last_Name, String pseudo, String mail, String password,
			String phone_Number, String adress) {
		this.id = id;
		Name = name;
		this.last_Name = last_Name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.phone_Number = phone_Number;
		this.adress = adress;
	}

	

	public UserDto(String name, String last_Name, String pseudo, String mail, String password, String phone_Number,
			String adress) {
		super();
		Name = name;
		this.last_Name = last_Name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.phone_Number = phone_Number;
		this.adress = adress;
	}

 
	public RoleImpl getRole() {
		return role;
	}


	public void setRole(RoleImpl role) {
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
 
    
    
    

}
