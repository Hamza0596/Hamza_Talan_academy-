package com.thp.project.vintud.entity.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FavorisDaoImpl implements FavorisDAO {

	public FavorisDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createFavoris(Favoris fav) {
		boolean resultatAjoutFav = false;
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
			String req = "insert into favoris(userfav_id ,annonce_id,dateajoutfav) values(?,?,?)";
			PreparedStatement ps =con.prepareStatement(req);
			ps.setInt(1, fav.getUserId());
			ps.setInt(2, fav.getAnnonceFavId());
			ps.setDate(3, fav.getDateAjout());						


			if (ps.executeUpdate() == 1) {
				System.out.println("The favored announcement has been added successfully ");
				resultatAjoutFav=true;
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); }	
   			return resultatAjoutFav;
	}

	@Override
	public void Delete(Favoris fav) {
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
			String req = "DELETE FROM favoris WHERE id=?";
			PreparedStatement ps =con.prepareStatement(req);
			ps.setInt(1, fav.getId());
									
			if (ps.executeUpdate() == 1) {
				System.out.println("The favored announcement has been deleted successfully from the favoured list ");
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
    }	
	}

	@Override
	public void showFavouredAnnouncements() {
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  favoris ");
            con.close();
             while(res.next()){ 
            System.out.println("The id of the favoured announce  is "+" "+res.getString("annonce_id")) ;
             }
        } 
		catch (SQLException e) {
			e.printStackTrace();
        }		
	}

	@Override
	public void updateFavoris(Favoris fav ,int newAnnounceId ) {
		try {	
			 
			ConnectionManager C= ConnectionManager.getInstance();
			Connection con = C.getConnection();
			String req = "UPDATE favoris SET annonce_id = ?  where id=?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1, newAnnounceId);
			ps.setDouble(2, fav.getId());
		
			
			if (ps.executeUpdate() == 1) {
				System.out.println(" We have successfully update your favoured announce ");
				 }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
	}}
	
	public boolean favouredOrNo(int idAnnonce) {
		boolean isFavoured=false;
		ConnectionManager C= ConnectionManager.getInstance();
		Connection con = C.getConnection();		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(" SELECT * FROM  favoris where annonce_id="+idAnnonce);
            con.close();
             while(res.next()){ 
            	 isFavoured=true;
             }
        } 
		catch (SQLException e) {
			e.printStackTrace();
        }
		return isFavoured;
	}
	
	

	

}
