
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
    
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
		AnnouncementManager  A = new AnnouncementManager ();
		A.Déposer_Créer_Annonce(false);
	}

}
