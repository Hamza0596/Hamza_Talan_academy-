import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AnnouncementManager  A = new AnnouncementManager ();

		UserImpl u = new UserImpl();
		u.setNom("Hamza");
		u.setPrenom("BOUACHIR");
		u.setPseudo("Hamza123");
		u.setMail("hamza.bouachir@talan.com");
		u.setMot_De_Passe(123456);
		u.setNum_Tel(93107896);
		u.setAdresse("Nabeul");
		u.setRole_id(1);
		u.setId(4);
		AnnouncementImpl An = new AnnouncementImpl();
		
		An.setId(1);
		An.setTitre("Vetement importés");
		An.setDescription("haute qualité");
		An.setCatégorie(3);
		An.setPrix(50.6);
		An.setPhoto("image veste");
		An.setDate_publication("2019-02-25 11:32:12");
		An.setEtat_Disponibilité(true);
		An.setLocalisation("hamamet");
		An.setUser_id(3);
		 
		
		//A.Créer_compte(u);
		//A.se_conecter();
		//A.Modifier_Informations_Personnelles();
		//A.Consulter_liste_Toutes_Les_Anonces_Disponibles();
		//A.Consulter_Informations_Vendeur(1);
		//A.Déposer_Créer_Annonce(An);
		//A.Supprimer_annonce(1);
		//A.Modifier_annonce();
		
	}

}
