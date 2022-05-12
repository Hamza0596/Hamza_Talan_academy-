package com.thp.project.vintud.entity.impl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnnonceDAOImpl implements AnnonceDAO {

	public AnnonceDAOImpl() {
	}

	@Override
	public List showAllAnnouncement() {
		ArrayList<AnnouncementImpl > listeAnnonce = new ArrayList<AnnouncementImpl>();

		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  announcement ");
            con.close();
             while(res.next()){ 
            	 AnnouncementImpl annonce = new AnnouncementImpl(res.getString("title"),res.getNString("description"),res.getInt("category_id"),res.getDouble("price"),res.getNString("picture"),res.getDate("publication_date"),res.getBoolean("is_available"),res.getInt("view_number"),res.getString("localisation"),res.getInt("user_id")) ;
            	 listeAnnonce.add(annonce);
             }
        } 
		catch (SQLException e) {
			e.printStackTrace();
        }
		return listeAnnonce ;
	}

	@Override
	public boolean createAnnounce(AnnouncementImpl An) {
		boolean resultat=false;
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
			String req = "insert into Announcement(title, description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps =con.prepareStatement(req);
			ps.setString(1, An.getTitle());
			ps.setString(2, An.getDescription());
			ps.setInt(3,An.getCatégorie());
			ps.setDouble(4,An.getPrice());
			ps.setString(5,An.getPhoto());
			ps.setDate(6,  An.getPublication_Date());
			ps.setBoolean(7,An.getDisponibility_State());
			ps.setInt(8,An.getViewNumber());
			ps.setString(9,An.getLocalisation());
			ps.setInt(10,An.getUser_id());			

			if (ps.executeUpdate() == 1) {
				System.out.println("Announcement has been added successfully ");
				resultat=true;
				 }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
    }	
		return resultat;
	}

	@Override
	public void deleteAnnounce(int id) {
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
			String req = "DELETE FROM announcement WHERE id=?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1, id);
			
			if (ps.executeUpdate() == 1) {
				System.out.println(" We have successfully deleted your announce ");
				 }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
    }	
	}

	@Override
	public void anounceUpdate(AnnouncementImpl An, String newTitle, double newPrice, String newPicture) {
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();
			Connection con = C.getConnection();
			String req = "UPDATE announcement SET title=?,price=? ,picture=? where id=?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setString(1, newTitle);
			ps.setDouble(2, newPrice);
			ps.setString(3, newPicture);
			ps.setInt(4, An.getId());
			
			if (ps.executeUpdate() == 1) {
				System.out.println(" We have successfully update your announce ");
				 }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
	}		
	}
	    
	public void getAnnounceByName_Catégorie_Price(String title,double price, int categorie) {
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();
		try{
		Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(" SELECT * FROM  announcement WHERE title='"+title+"' OR price="+price+" OR category_id="+categorie+" ");
        con.close();
        while(res.next()){ 
        System.out.println("The title of this annouce is "+" "+res.getString("title")) ;
         }
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
}
	
	public void getAnnounceByPrice(double minPrice , double maxPrice) {
		
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  announcement where price BETWEEN "+minPrice+" AND "+maxPrice+" ");
            con.close();
             while(res.next()){ 
            System.out.println("The title of this announce is "+" "+res.getString("title")) ;
             }
        } 
		catch (SQLException e) {
			e.printStackTrace();
        }	
	}
	
    public void getAnnouceByLocalisation(String localisation) {
    	
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  announcement where localisation = '"+localisation+"'  ");
            con.close();
             while(res.next()){ 
            System.out.println("The title of this announce is "+" "+res.getString("title")) ;
             }
        } 
		catch (SQLException e) {
			e.printStackTrace();
        }
    }
    
    public void addAnnounceTofavoris(AnnouncementImpl An, int id) {
    	try {
    		ConnectionManager C= ConnectionManager.getInstance();
    		Connection con = C.getConnection();	
			String req = "INSERT INTO favoris (userfav_id,annonce_id,dateajoutfav) VALUES(?,?,?)";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1,An.getUser_id());
			ps.setInt(2,id);
			LocalDate today = LocalDate.now();
			ps.setDate(3,Date.valueOf(today));
			if (ps.executeUpdate() == 1) {
				
				System.out.println("Announce has been added successfully to favoris list ");
			}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
         }
    	
    }
    
    public void getViewNumber(int id) {
	

		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  announcement  WHERE id="+id+"");
            
            con.close();
             while(res.next()){ 
            	 
            	 System.out.println("the number of views of this announcement  is equal to "+ res.getString("view_number"));

             }
        } catch (SQLException e) {
        }
	}
}
