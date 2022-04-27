import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RechercheDaoImpl implements RechercheDAO {

	@Override
	public void créer_recherche(Recherche recherche) {
        ConnectionManager C= ConnectionManager.getInstance();
 		
		Connection con = C.getConnection();
		
		try {
			
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("INSERT INTO recherches(type_habit,taille,couleur,max_prix,min_prix,ref_User_Id) VALUES('"+recherche.getType_Habits()+"','"+recherche.getTaille()+"','"+recherche.getCouleur()+"',"+recherche.getMax_Prix()+","+recherche.getMin_Prix()+" ,"+recherche.getRef_User_Id()+" )");
            con.close();
        } 
		catch (SQLException e) {

        }		
	}

	@Override
	public void supprimer_recherche(Recherche recherche) {
		
		try {
			ConnectionManager C= ConnectionManager.getInstance();
			
			Connection con = C.getConnection();
			Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery(" DELETE FROM  recherches WHERE id= "+recherche.getId()+"" );
            
            //étape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }
		
	}

	@Override
	public void lancer_recherche(int id_recherche) {

		try {
			ConnectionManager C= ConnectionManager.getInstance();
			
			Connection con = C.getConnection();
			Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery(" SELECT * FROM  recherches WHERE id= "+id_recherche );
            if(res.next()) {
            	System.out.println("cette recherche est indentidié par le type d'habit "+res.getString("type_habit")+"et par la couleur "+res.getString("couleur"));
            }
            
            //étape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }
		
	}

	@Override
	public void modifier(int id_modif) {
		try {
			//SCAN ref_id_annonce
			Scanner scan= new Scanner(System.in);
			System.out.println("Inserer la nouvelle couleur de cette recherche ");
		    String Color  = scan.nextLine();
			
			//SCAN ref_id_user
			Scanner scan1= new Scanner(System.in);
			System.out.println("Inserer la nouvelle taille de cette recherche");
		    String taille   = scan1.nextLine();
			ConnectionManager C= ConnectionManager.getInstance();
			
			Connection con = C.getConnection();
			Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
			stmt.executeUpdate(" UPDATE recherches SET  taille ='"+taille+"' ,couleur='"+Color+"'   WHERE id= "+id_modif);
            
	            System.out.println("modifications terminés");
            //étape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }		
	}
	
}


