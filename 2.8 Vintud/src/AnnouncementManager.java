import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AnnouncementManager {

	
	public AnnouncementManager() {
		
		
	}


	public void Cr�er_compte( UserImpl u1) {
		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("INSERT INTO users(id,first_name,last_name,pseudo,mail,u_password,phone,address,role_id) VALUES("+u1.getId()+",'"+u1.getNom()+"','"+u1.getPrenom()+"','"+u1.getPseudo()+"','"+u1.getMail()+"','"+u1.getMot_De_Passe()+"','"+u1.getNum_Tel()+"','"+u1.getAdresse()+"',"+u1.getRole_id()+")");
            con.close();
        } 
		catch (SQLException e) {

        }
		
	}

	public boolean se_conecter() {
		
		boolean conection_State=false;
		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
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
        	   
        	   System.out.println("Bienvenu,vous etes connect�");
        	   conection_State= true;
        	   
           }
           
           else {
        	   System.out.println("Adresse/mot de passe incorrect");
        	   
           }
            con.close();
        } 
		catch (SQLException e) {
        }
		return conection_State;
	}
	
	public void Modifier_Informations_Personnelles(UserImpl u) {
		
		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		try {
			//SCAN Adresse mail
			Scanner scan= new Scanner(System.in);
			System.out.println("Inserer votre adresse mail");
			String mail = scan.nextLine();
			
			//SCAN mot de passe
			Scanner scan1= new Scanner(System.in);
			System.out.println("Inserer votre mot de passe");
		    String  mdp = scan1.nextLine();
		
            Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery("UPDATE users SET first_name='"+u.getNom()+"', last_name= '"+u.getPrenom()+"',pseudo='"+u.getPseudo()+"',phone= '"+u.getNum_Tel()+"' WHERE  mail='"+mail+"' AND  u_password = '"+mdp+"'  ");
            System.out.println("Modifications enregistr�s");
            //�tape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }

		
		
	}
	
	public void Consulter_liste_Toutes_Les_Anonces_Disponibles() {
		
		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
            Statement stmt = con.createStatement();
           
            ResultSet res = stmt.executeQuery("SELECT * FROM announcement");
            while(res.next()) {
                System.out.println("Cette annonce est identifi�e par le nom "+" "+res.getString("title") +" "+ "et par la description"+" "+res.getString("description")+" "+"et par le prix"+" "+res.getInt("price"));
                }
            
            con.close();
        } catch (SQLException e) {
        }
		
	}
	
	public void Consulter_Informations_Vendeur(int id_vendeur) {
		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * from announcement where user_id="+id_vendeur);
             if(res.next()) {
            	 try {
            		 
            		 ResultSet res1 = stmt.executeQuery("SELECT * from users where id="+id_vendeur); 
            		  while(res1.next()) {
                          System.out.println("ce vendeur s'appelle"+" "+res1.getString("first_name")+ " "+res1.getString("last_name")+" "+"son pseudo est :" +res1.getString("pseudo")+""+"son mail est : "+" "+res1.getString("mail"));
                     
                          }
            		 
            	 }
            	 catch (SQLException e) {
                 }
            	 
             }
             else {
            	 System.out.println("c'est pas un vendeur");
            	 
             }
          
            
            con.close();
        } catch (SQLException e) {
        }
		
	}
	
	public void D�poser_Cr�er_Annonce(AnnouncementImpl An) {
		
		try {
			ConnectionManager C= ConnectionManager.getInstance();
			
			Connection con = C.getConnection();            Statement stmt = con.createStatement();
   
         
            ResultSet res = stmt.executeQuery("INSERT INTO announcement (id,title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES ("+An.getId()+",'"+An.getTitre()+"','"+ An.getDescription() +"','"+An.getCat�gorie()+"','"+An.getPrix()+"','"+An.getPhoto()+"',DATE'"+An.getDate_publication()+"',"+An.isEtat_Disponibilit�()+","+0+",'"+An.getLocalisation()+"',"+An.getUser_id()+")");
            con.close();                     
        } catch (SQLException e) {
            //traitement de l'exception
        }
		
	}
	
	public void Supprimer_annonce(int id_Annonce) {
		
		try {
			ConnectionManager C= ConnectionManager.getInstance();
			
			Connection con = C.getConnection();
			Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery(" DELETE FROM  announcement WHERE id="+id_Annonce );
            
            //�tape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }

		
	}
	
	public void Modifier_annonce() {
		
		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
			
			//SCAN id annonce
			Scanner scan0= new Scanner(System.in);
			System.out.println("Inserer l'id de l'annonce a modifier ");
			int in_id = scan0.nextInt();
			
			
			//SCAN nouveau titre
			Scanner scan= new Scanner(System.in);
			System.out.println("Inserer un nouveau titre pour cette annonce");
			String in_Titre = scan.nextLine();
			
			//SCAN nouvelle description
			Scanner scan1= new Scanner(System.in);
			System.out.println("Inserer une nouvelle description pour cette annonce");
		    String  in_Description = scan1.nextLine();
			
			
			//SCAN nouvelle localisation
			Scanner scan2= new Scanner(System.in);
			System.out.println("Inserer la nouvelle localisation pour cette annonce ");
			String in_localisation = scan2.nextLine();
			
		
	          
            Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery("UPDATE announcement SET title='"+in_Titre+"', description= '"+in_Description+"' , localisation= '"+in_localisation+"' WHERE  id="+in_id+" ");
            
            //�tape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }
		
		
		
	}

	
	
}
