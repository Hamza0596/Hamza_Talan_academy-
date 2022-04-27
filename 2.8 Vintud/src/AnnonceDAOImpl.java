import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AnnonceDAOImpl implements AnnonceDAO {

	public AnnonceDAOImpl() {
	}

	@Override
	public void Consulter_liste_Toutes_Les_Anonces_Disponibles() {

		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
            Statement stmt = con.createStatement();
           
            ResultSet res = stmt.executeQuery("SELECT * FROM announcement");
            while(res.next()) {
                System.out.println("Cette annonce est identifiée par le nom "+" "+res.getString("title") +" "+ "et par la description"+" "+res.getString("description")+" "+"et par le prix"+" "+res.getInt("price"));
                }
            
            con.close();
        } catch (SQLException e) {
        }
	}

	@Override
	public void Déposer_Créer_Annonce(AnnouncementImpl An) {

		try {
			ConnectionManager C= ConnectionManager.getInstance();
			
			Connection con = C.getConnection();            Statement stmt = con.createStatement();
   
         
            ResultSet res = stmt.executeQuery("INSERT INTO announcement (id,title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES ("+An.getId()+",'"+An.getTitre()+"','"+ An.getDescription() +"','"+An.getCatégorie()+"','"+An.getPrix()+"','"+An.getPhoto()+"',DATE'"+An.getDate_publication()+"',"+An.isEtat_Disponibilité()+","+0+",'"+An.getLocalisation()+"',"+An.getUser_id()+")");
            con.close();                     
        } catch (SQLException e) {
            //traitement de l'exception
        }
		
	}

	@Override
	public void Supprimer_annonce(int id_Annonce) {

		try {
			ConnectionManager C= ConnectionManager.getInstance();
			
			Connection con = C.getConnection();
			Statement stmt = con.createStatement();
            //ResultSet res = stmt.executeQuery("CREATE DATABASE db_bibliotheque");
            ResultSet res = stmt.executeQuery(" DELETE FROM  announcement WHERE id="+id_Annonce );
            
            //étape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }
	}

	@Override
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
            
            //étape 5: fermez l'objet de connexion
            con.close();
        } catch (SQLException e) {
        }		
	}
	
	
   public void Rechercher_annonce_par_nom_catégorie_prix(String nom,int categorie,double price) {
	   ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
           Statement stmt = con.createStatement();
          
           ResultSet res = stmt.executeQuery("SELECT * FROM announcement  WHERE title= '"+nom+"' OR category_id="+categorie+" OR price="+price+"" );
           while(res.next()) {
               System.out.println("Cette annonce est identifiée par le nom "+" "+res.getString("title") +" "+ "et par la description"+" "+res.getString("description")+" "+"et par le prix"+" "+res.getInt("price"));
               }
           
           con.close();
       } catch (SQLException e) {
       }
	   
	   
   }

   public void Filtrer_annonces_prix(double max_price) {
	   
	   ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
           Statement stmt = con.createStatement();
          
           ResultSet res = stmt.executeQuery("SELECT * FROM announcement  WHERE  price < "+max_price+" " );
           while(res.next()) {
               System.out.println("Cette annonce est identifiée par le nom "+" "+res.getString("title") +" "+ "et par la description"+" "+res.getString("description")+" "+"et par le prix"+" "+res.getInt("price"));
               }
           
           con.close();
       } catch (SQLException e) {
       }
	   
	   
   }
    
   public void Filtrer_annonces_par_localisation(String localisation) {
	   
	   ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
           Statement stmt = con.createStatement();
          
           ResultSet res = stmt.executeQuery("SELECT * FROM announcement  WHERE  localisation = '"+localisation+"' " );
           System.out.println("SELECT * FROM announcement  WHERE  localisation = '"+localisation+"' ");
           while(res.next()) {
               System.out.println("Cette annonce est identifiée par le nom "+" "+res.getString("title") +" "+ "et par la description"+" "+res.getString("description")+" "+"et par le prix"+" "+res.getInt("price"));
               }
           
           con.close();
       } catch (SQLException e) {
       }
	   
   }
   
   public void Enregistrer_annonce_favoris(int id_annonce, int id_user) {
	   
		ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			Date date = new Date(System.currentTimeMillis());
           Statement stmt = con.createStatement();
           ResultSet res = stmt.executeQuery("INSERT INTO favoris(ref_Id_Annonce,ref_Id_user,Favoris_Ajout_Date) VALUES("+id_annonce+","+id_user+", DATE '"+formatter.format(date)+"')");
           con.close();
       } 
		catch (SQLException e) {

       }
	   
   }
   
   
   public void Voir_nombre_vue_anonces(int id_annonce) {
	   ConnectionManager C= ConnectionManager.getInstance();
		
		Connection con = C.getConnection();
		
		try {
          Statement stmt = con.createStatement();
         
          ResultSet res = stmt.executeQuery("SELECT view_number FROM announcement  WHERE id= '"+id_annonce+"' " );
          while(res.next()) {
              System.out.println("Cette annonce à un nombre de vu égale à  "+" "+res.getString("view_number"));
              }
          
          con.close();
      } catch (SQLException e) {
      }
	   
   }
   
   
   
}
