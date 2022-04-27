import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UtilisateurDAOImpl implements UtilisateurDAO {

	public UtilisateurDAOImpl() {
	}

	@Override
	public void Créer_compte(UserImpl u1) {
		
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

	@Override
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
        	   
        	   System.out.println("Bienvenu,vous etes connecté");
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
	

	@Override
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
            System.out.println("Modifications enregistrés");
            //étape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }
		
	}

	@Override
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
	
	
	
	
	

}
