package com.thp.project.vintud.entity.impl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class UtilisateurDAOImpl implements UtilisateurDAO  {

	public UtilisateurDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean creatUserAcount(UserImpl u) {
		boolean resultat=false;

		if( findUserByEMail(u.getMail())==false && findUserByPhoneNumber(u.getPhone_Number())==false){
			
		
		try {	
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
		
			String req = "insert into users (first_name, last_name,pseudo,mail,u_password,phone,address,role_id) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setString(1, u.getName());
			ps.setString(2, u.getLast_Name());
			ps.setString(3,u.getPseudo());
			ps.setString(4,u.getMail());
			ps.setString(5,u.getPassword());
			ps.setString(6,u.getPhone_Number());
			ps.setString(7,u.getAdress());
			ps.setInt(8,u.getRole_id());			
			
			
			if (ps.executeUpdate() == 1) {
				System.out.println("user has been added successfully ");
				resultat=true;
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				e.printStackTrace();

			}
		}
		return resultat;
	}

	@Override
	public boolean logIn(String mail, String mdp) {
		ConnectionManager C= ConnectionManager.getInstance();

		Connection con = C.getConnection();
        boolean isconnected=false;
		try {
            Statement stmt = con.createStatement();
       
            
            ResultSet res = stmt.executeQuery(" SELECT * FROM  users where  mail='"+mail+"' AND u_password='"+mdp+"' ");           
            con.close();
             if(res.next()){ 
            	 System.out.println("welcome you are now connected to your account");
            	 isconnected=true;
             }
             else {
            	 System.out.println("wrong email or password please try again ");
            	 isconnected=false;
             }
        } catch (SQLException e) {
			e.printStackTrace();

        }	
		 return isconnected;
		
		
	}

	@Override
	public void infoUpdate(UserImpl u) {
		try {
    		ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
    		String req = "UPDATE users SET first_name = ?, last_name = ?, pseudo = ?, mail = ?, u_password = ?, phone = ?, address = ?, role_id = ? WHERE id= ?";
    		PreparedStatement ps = con.prepareStatement(req);
    		ps.setString(1, u.getName());
    		ps.setString(2, u.getLast_Name());
    		ps.setString(3,u.getPseudo());
    		ps.setString(4,u.getMail());
    		ps.setString(5,u.getPassword());
    		ps.setString(6,u.getPhone_Number());
    		ps.setString(7,u.getAdress());
    		ps.setInt(8,u.getRole_id());
    		ps.setInt(9,u.getId());
    		
    		if (ps.executeUpdate() == 1) {
    			System.out.println("your information has been updated successfully  ");
    			 }
     }catch(SQLException e) {
			e.printStackTrace(); 
     }		
	}

	@Override
	public void ConsultSellerInformation(AnnouncementImpl An) {
	  	ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
	    	try{
	    		Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery(" SELECT * FROM  announcement WHERE user_id="+An.getUser_id()+" ");
	            
	            try {
	            	Statement stmt1 = con.createStatement();
	                ResultSet res1 = stmt.executeQuery(" SELECT first_name,last_name  FROM  users WHERE id="+An.getUser_id()+" ");
	            	   while(res1.next()){ 
	                       System.out.println("The seller of this annouce is "+" "+res1.getString("first_name")) ;
	                        }
	            	   con.close();
	            } catch(SQLException e) {
	        		e.printStackTrace();

	            }
	            con.close();
	         
	    	}
	    	catch(SQLException e) {
	    		e.printStackTrace();
	    	}		
	}
	
	public void addRole(int id,String name) {
		try {
    		ConnectionManager C= ConnectionManager.getInstance();
    		Connection con = C.getConnection();	
			String req = "INSERT INTO role (id,nom) VALUES(?,?)";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1,id);
			ps.setString(2,name);
			if (ps.executeUpdate() == 1) {
				
				System.out.println("Role has been added successfully to role list ");
			}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
         }
    	
    
		
	}
	
	public boolean findUserByEMail(String email) {
		boolean isfound=false;
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();
    	try{
    		Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  users  WHERE mail='"+email+"' ");
            
     	   while(res.next()){ 
               System.out.println("This email is already used by"+" "+res.getString("first_name")) ;
               isfound=true;
                }
    	   con.close();
         
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return isfound;
		
	}
	
	public boolean findUserByPhoneNumber(String phoneNumber) {
		boolean phoneIsFound=false;
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();
    	try{
    		Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  users  WHERE phone='"+phoneNumber+"' ");
            
     	   while(res.next()){ 
               System.out.println("This phone number is already used by"+" "+res.getString("first_name")) ;
               phoneIsFound=true;
                }
    	   con.close();
         
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return phoneIsFound;
		
	}
	
	public int getIdByEmail(String email) {
		int id = 0;
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();
    	try{
    		Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT  id FROM  users  WHERE mail='"+email+"' ");
            
     	   while(res.next()){ 
              id=res.getInt("id");
                }
    	   con.close();
         
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return id;
		
	}
	
	
	public String findUserById(int id) {
		String name ="";
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();
    	try{
    		Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  users  WHERE id="+id+" ");
            
     	   while(res.next()){ 
               name=res.getString("first_name");
                }
    	   con.close();
         
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return name;
		
	}

}
