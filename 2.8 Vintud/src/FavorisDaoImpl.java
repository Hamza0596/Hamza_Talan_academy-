import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FavorisDaoImpl implements FavorisDAO {

	public FavorisDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void créer_Fav(Favoris favoris ) {
		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			Date date = new Date(System.currentTimeMillis());
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("INSERT INTO favoris(ref_Id_Annonce,ref_Id_user,Favoris_Ajout_Date) VALUES("+favoris.getRef_Id_Annonce()+","+favoris.getRef_Id_user()+", DATE '"+formatter.format(date)+"')");
            con.close();
        } 
		catch (SQLException e) {

        }
	}
	
	public void supprimer_Fav(Favoris fav) {
		try {
			ConnectionManager C= ConnectionManager.getInstance();
			
			Connection con = C.getConnection();
			Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery(" DELETE FROM  favoris WHERE id= "+fav.getId()+"" );
            
            //étape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }
		
	}
	
	 public void retrouverAnnonce(AnnouncementImpl annonce) {
			try {
				ConnectionManager C= ConnectionManager.getInstance();
				
				Connection con = C.getConnection();
				Statement stmt = con.createStatement();
	            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
	            ResultSet res = stmt.executeQuery(" SELECT * FROM  favoris WHERE ref_id_annonce= "+annonce.getId()+"" );
	            if(res.next()) {
	            	System.out.println("l'annonce est trouvé dans la liste des favoris ");
	            	System.out.println("cette annonce est ajoutée le "+res.getString("favoris_ajout_date"));
	            }
	            else {
	            	System.out.println("l'annonce n'est pas trouvé dans la liste des favoris ");
	            	
	            }
	            
	            //étape 5: fermez l'objet de connexion
	            con.close();
	        } catch (SQLException e) {
	        }
		 
	 }
	 
	 public void modifier_fav(Favoris fav) {
		 

		    
			try {
				//SCAN ref_id_annonce
				Scanner scan= new Scanner(System.in);
				System.out.println("Inserer la nouvelle ref_id_annonce d'une annonce existante");
				int ref_id_annonce = scan.nextInt();
				
				//SCAN ref_id_user
				Scanner scan1= new Scanner(System.in);
				System.out.println("Inserer le nouvelle ref_id_user d'un utilisateur existant");
			    int  ref_id_user = scan1.nextInt();
				ConnectionManager C= ConnectionManager.getInstance();
				
				Connection con = C.getConnection();
				Statement stmt = con.createStatement();
	            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
				stmt.executeUpdate(" UPDATE favoris SET  ref_id_annonce ="+ref_id_annonce+" ,ref_id_user="+ref_id_user+"   WHERE id= "+fav.getId());
	            
		            System.out.println("modifications terminés");
	            //étape 5: fermez l'objet de connexion
	            con.close();
	        } catch (SQLException e) {
	        }
		 
	 }

}
