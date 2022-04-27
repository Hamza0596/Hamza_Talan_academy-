import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		UtilisateurDAOImpl  U_DAO = new UtilisateurDAOImpl ();
		AnnonceDAOImpl An_DAO=new AnnonceDAOImpl();
		
		
		
		UserImpl u = new UserImpl();
		u.setNom("omar1");
		u.setPrenom("zidan1");
		u.setPseudo("amrouch1");
		u.setMail("omarzidan@yahoo.com");
		u.setMot_De_Passe(12345);
		u.setNum_Tel(11111111);
		u.setAdresse("bk");
		u.setRole_id(1);
		u.setId(8);
		AnnouncementImpl An1 = new AnnouncementImpl();
		AnnouncementImpl An2 = new AnnouncementImpl();

		
		An1.setId(1);
		An1.setTitre("salami mazraa");
		An1.setDescription("yesr bnin");
		An1.setCatégorie(3);
		An1.setPrix(50.6);
		An1.setPhoto("c:\\sfsfds");
		An1.setDate_publication("2019-02-25 11:32:12");
		An1.setEtat_Disponibilité(true);
		An1.setLocalisation("hamamet");
		An1.setUser_id(3);
		
		An2.setId(20);
		An2.setTitre("vettement");
		An2.setDescription("bonne qualité");
		An2.setCatégorie(3);
		An2.setPrix(59.6);
		An2.setPhoto("image vetement");
		An2.setDate_publication("2019-02-25 11:32:12");
		An2.setEtat_Disponibilité(true);
		An2.setLocalisation("Nabeul");
		An2.setUser_id(4);
		 
		
		//U_DAO.Créer_compte(u);
		//U_DAO.se_conecter();
		//U_DAO.Modifier_Informations_Personnelles(u);
		//An_DAO.Consulter_liste_Toutes_Les_Anonces_Disponibles();
		//U_DAO.Consulter_Informations_Vendeur(2);
	    //An_DAO.Déposer_Créer_Annonce(An1);
		//An_DAO.Supprimer_annonce(1);
		//An_DAO.Modifier_annonce();
		//An_DAO.Rechercher_annonce_par_nom_catégorie_prix("t-shirt lacuste bon état", 1, 24.98);
		//An_DAO.Filtrer_annonces_prix(90);
		//An_DAO.Filtrer_annonces_par_localisation("Nabeul");
		//An_DAO.Enregistrer_annonce_favoris(2,2);   
		//An_DAO.Voir_nombre_vue_anonces(2);
		
		
		FavorisDaoImpl Dao_Fav = new FavorisDaoImpl();
		Favoris f = new Favoris();
		
        //f.setId(4);
		//f.setRef_Id_Annonce(4);
		//f.setRef_Id_user(3);

		//Dao_Fav.créer_Fav(f);
		//Dao_Fav.supprimer_Fav(f);
		//Dao_Fav.retrouverAnnonce(An1);
		//Dao_Fav.modifier_fav(f);
		
		
		
		
		RechercheDaoImpl Recherche_DAO = new RechercheDaoImpl();
		Recherche recherche0 = new Recherche();
		recherche0.setId(1);
		recherche0.setCouleur("rouge");
		recherche0.setMax_Prix(20);
		recherche0.setMin_Prix(2);
		recherche0.setRef_User_Id(1);
		recherche0.setTaille("xl");
		recherche0.setType_Habits("pull");
		
		Recherche recherche1 = new Recherche();
		recherche0.setId(3);
		recherche1.setId(2);
		recherche1.setCouleur("bleu");
		recherche1.setMax_Prix(50);
		recherche1.setMin_Prix(10);
		recherche1.setRef_User_Id(2);
		recherche1.setTaille("s");
		recherche1.setType_Habits("veste");
		
		//Recherche_DAO.créer_recherche(recherche0);
		//Recherche_DAO.créer_recherche(recherche1);

		//Recherche_DAO.supprimer_recherche(recherche0);
		//Recherche_DAO.supprimer_recherche(recherche1);
		
		//Recherche_DAO.lancer_recherche(5);
		//Recherche_DAO.modifier(5);
		
		
		
		
		//Utilsation DAO FACTROY
		
		Dao_Factory.Get_Utilisateur_Dao().se_conecter();
		Dao_Factory.Get_Annoce_Dao().Voir_nombre_vue_anonces(0);
		Dao_Factory.Get_Annoce_Dao().Consulter_liste_Toutes_Les_Anonces_Disponibles();
		Dao_Factory.Get_Annoce_Dao().Rechercher_annonce_par_nom_catégorie_prix("Veste v Guoss comme nueve", 0, 0);
		
		
	}

}