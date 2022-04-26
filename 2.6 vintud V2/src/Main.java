import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AnnouncementManager  A = new AnnouncementManager ();

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
		AnnouncementImpl An = new AnnouncementImpl();
		
		An.setId(1);
		An.setTitre("salami mazraa");
		An.setDescription("yesr bnin");
		An.setCatégorie(3);
		An.setPrix(50.6);
		An.setPhoto("c:\\sfsfds");
		An.setDate_publication("2019-02-25 11:32:12");
		An.setEtat_Disponibilité(true);
		An.setLocalisation("hamamet");
		An.setUser_id(3);
		 
		
		//A.Créer_compte(u);
		//A.se_conecter();
		//A.Modifier_Informations_Personnelles(u);
		//A.Consulter_liste_Toutes_Les_Anonces_Disponibles();
		//A.Consulter_Informations_Vendeur(2);
		//A.Déposer_Créer_Annonce(An);
		//A.Supprimer_annonce(1);
		//A.Modifier_annonce();
		
	}

}