package com.thp.project.vintud.entity.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RechercheDaoImpl implements RechercheDAO {

	public RechercheDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Createresearch(Recherche R) {
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
			String req = "insert into recherches(Type_habit, Taille,couleur,Max_prix,Min_prix,user_id) values(?,?,?,?,?,?)";
			PreparedStatement ps =con.prepareStatement(req);
			ps.setString(1, R.getTypeClothing());
			ps.setString(2, R.getSize());
			ps.setString(3,R.getColor());
			ps.setDouble(4,R.getMax_Price());
			ps.setDouble(5,R.getMin_Price());
			ps.setInt(6,R.getUser_id());
		
			if (ps.executeUpdate() == 1) {
				System.out.println("Research has been added successfully ");
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
    }			
	}

	@Override
	public void showResearch() {
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  recherches ");
            con.close();
             while(res.next()){ 
            System.out.println("The type_habit of this reaserch is "+" "+res.getString("type_habit")) ;
             }
        } 
		catch (SQLException e) {
			e.printStackTrace();
        }				
	}

	@Override
	public void deleteResearch(Recherche R) {
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
			String req = "DELETE FROM recherches WHERE id=?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1, R.getId());
			
			if (ps.executeUpdate() == 1) {
				System.out.println(" We have successfully deleted your reaserch ");
				 }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
    }
	}

	@Override
	public void updateResearch(Recherche R, String size, String color) {
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();
			Connection con = C.getConnection();
			String req = "UPDATE recherches SET taille=?,couleur=?  where id=?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setString(1, size);
			ps.setString(2, color);
			ps.setInt(3, R.getId());
			
			if (ps.executeUpdate() == 1) {
				System.out.println(" We have successfully update your reaserch ");
				 }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
	}
		
	}

}
