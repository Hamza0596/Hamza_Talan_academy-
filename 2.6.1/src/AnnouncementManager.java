import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AnnouncementManager {

	
	public AnnouncementManager() {
		
		
	}
	
	

	public void Créer_compte( UserImpl u1) {
		
		Connection con = ConnectionManager.getConnection();
		
		try {
            Statement stmt = con.createStatement();
           
            ResultSet res = stmt.executeQuery("INSERT INTO users(id,first_name,last_name,pseudo,mail,u_password,phone,address,role_id) VALUES("+u1.getId()+",'"+u1.getNom()+"','"+u1.getPrenom()+"','"+u1.getPseudo()+"','"+u1.getMail()+"','"+u1.getMot_De_Passe()+"','"+u1.getNum_Tel()+"','"+u1.getAdresse()+"',"+u1.getRole_id()+")");
            con.close();
        } catch (SQLException e) {
            //traitement de l'exception
        }
		
	}

	public void se_conecter() {
		
		
		
		
		
		Connection con = ConnectionManager.getConnection();
		try {
			//SCAN Adresse mail
			Scanner scan= new Scanner(System.in);
			System.out.println("Inserer votre adresse mail");
			String mail = scan.nextLine();
			
			//SCAN msp
			Scanner scan1= new Scanner(System.in);
			System.out.println("Inserer votere mot de passe");
		    String  mdp = scan1.nextLine();
	          
            Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery("SELECT mail FROM users WHERE mail='"+mail+"' AND  u_password = '"+mdp+"'  ");
            
           if(res.next()) {
        	   System.out.println("Bienvenu");
        	   
           }
           else {
        	   System.out.println("Adresse/mot de passe incorrect");
        	   
           }
            con.close();
        } catch (SQLException e) {
        }
		
		
		
	}
	
	public void Modifier_Informations_Personnelles() {
		
		Connection con = ConnectionManager.getConnection();
		try {
			//SCAN Adresse mail
			Scanner scan= new Scanner(System.in);
			System.out.println("Inserer votre adresse mail");
			String mail = scan.nextLine();
			
			//SCAN msp
			Scanner scan1= new Scanner(System.in);
			System.out.println("Inserer votere mot de passe");
		    String  mdp = scan1.nextLine();
			
			
			//SCAN nouveau nom
			Scanner scan2= new Scanner(System.in);
			System.out.println("Inserer votre nouveau nom");
			String nom = scan2.nextLine();
			
			//SCAN nouveau prenom
			Scanner scan3= new Scanner(System.in);
			System.out.println("Inserer votre nouveau prenom");
		    String  prenom = scan3.nextLine();
	          
            Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery("UPDATE users SET first_name='"+nom+"', last_name= '"+prenom+"'  WHERE  mail='"+mail+"' AND  u_password = '"+mdp+"'  ");
            
            //étape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }

		
		
	}
	
	public void Consulter_liste_Toutes_Les_Anonces_Disponibles() {
		
		Connection con = ConnectionManager.getConnection();
		
		try {
            Statement stmt = con.createStatement();
           
            ResultSet res = stmt.executeQuery("SELECT * FROM announcement");
            while(res.next()) {
                System.out.println("Cette annonce est identifiée par le nom "+res.getString("title"));
                }
            
            con.close();
        } catch (SQLException e) {
        }
		
	}
	
	public void Consulter_Informations_Vendeur(int id_vendeur) {
Connection con = ConnectionManager.getConnection();
		
		try {
            Statement stmt = con.createStatement();
           
            ResultSet res = stmt.executeQuery("SELECT * from users where id="+id_vendeur);
            while(res.next()) {
                System.out.println(res.getString("first_name") +res.getString("last_name") +res.getString("pseudo")+res.getString("mail"));
           
                }
            
            con.close();
        } catch (SQLException e) {
        }
		
	}
	
	public void Déposer_Créer_Annonce(boolean etat) {
		
		Connection con = ConnectionManager.getConnection();
		//SCAN titre annonce
		Scanner scan= new Scanner(System.in);
		System.out.println("Inserer le nom de cette annoce");
		String  input_Titre = scan.nextLine();
		
		//SCAN  description annonce
		Scanner scan1= new Scanner(System.in);
		System.out.println("Inserer une decription ");
	    String  input_Description = scan1.nextLine();
		
		
		//SCAN category id
		Scanner scan2= new Scanner(System.in);
		System.out.println("Inserer l'id_category de cette annonce");
		int input_Category_Cd = scan2.nextInt();
		
		//SCAN  price
		Scanner scan3= new Scanner(System.in);
		System.out.println("Inserer le prix de l'annonce");
	    int  inpu_Price = scan3.nextInt();
	    
		//SCAN  picture
		Scanner scan4= new Scanner(System.in);
		System.out.println("Inserer une image");
		String  input_picture = scan4.nextLine();
	    
	    
		//SCAN   publication date
		Scanner scan5= new Scanner(System.in);
		System.out.println("Inserer la date de publication");
	    String  input_Date_Publication = scan5.nextLine();
	    
	    
		//SCAN  view number
		Scanner scan6= new Scanner(System.in);
		System.out.println("Inserer le nombre de vu");
	    int  input_View_Number = scan6.nextInt();
	    
		//SCAN   localisation
		Scanner scan7= new Scanner(System.in);
		System.out.println("Inserer la localisation");
	    String  input_Localisation = scan7.nextLine();
	    
		//SCAN  user_id
		Scanner scan8= new Scanner(System.in);
		System.out.println("Inserer le user_id");
	    int  input_User_Id = scan8.nextInt();
	   
		try {
            Statement stmt = con.createStatement();
            System.out.println("INSERT INTO announcement (title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES('\"+input_Titre+\"','\"+input_Description+\"',\"+input_Category_Cd+\",\"+inpu_Price+\",'\"+input_picture+\"','\"+Date.valueOf(input_Date_Publication)+\"','\"+etat+\"',\"+input_View_Number+\",'\"+input_Localisation+\"',\"+input_User_Id+\"\"");
           
            ResultSet res = stmt.executeQuery("INSERT INTO announcement (title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES('"+input_Titre+"','"+input_Description+"',"+input_Category_Cd+","+inpu_Price+",'"+input_picture+"','"+Date.valueOf(input_Date_Publication)+"','"+etat+"',"+input_View_Number+",'"+input_Localisation+"',"+input_User_Id+"");
            con.close();
        } catch (SQLException e) {
            //traitement de l'exception
        }
		
	}
	
	public void Supprimer_annonce() {
		// TODO Auto-generated method stub
		
	}
	
	public void Modifier_annonce() {
		// TODO Auto-generated method stub
		
	}
	
}
