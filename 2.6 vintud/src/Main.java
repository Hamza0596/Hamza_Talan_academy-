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
		u.setPseudo("Hamzawi");
		u.setMail("hamza.bouachir@talan.com");
		u.setMot_De_Passe(123456);
		u.setNum_Tel(93107896);
		u.setAdresse("Nabeul");
		u.setRole_id(1);
		u.setId(4);
		AnnouncementImpl An = new AnnouncementImpl();
		
		An.setId(1);
		An.setTitre("salami mazraa");
		An.setDescription("yesr bnin");
		An.setCat�gorie(3);
		An.setPrix(50.6);
		An.setPhoto("c:\\sfsfds");
		An.setDate_publication("2019-02-25 11:32:12");
		An.setEtat_Disponibilit�(true);
		An.setLocalisation("hamamet");
		An.setUser_id(3);
		 
		
		//A.Cr�er_compte(u);
		//A.se_conecter();
		//A.Modifier_Informations_Personnelles();
		//A.Consulter_liste_Toutes_Les_Anonces_Disponibles();
		//A.Consulter_Informations_Vendeur(1);
		//A.D�poser_Cr�er_Annonce(An);
		//A.Supprimer_annonce(1);
		//A.Modifier_annonce();
		
	}

}