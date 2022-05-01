import java.sql.Date;
import java.time.LocalDate;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	    LocalDate today = LocalDate.now();

		UserImpl u =new UserImpl( 6,"hamzabouachir@talan.com" , "Monsieur BOUACHIR ","Hamza", "Hamza", "123456","93107896","Nabeul Beni khiar",1) ;
		AnnouncementImpl annonce= new AnnouncementImpl("Vettement ZARA","pull+pantalan",1,22.6,"image",Date.valueOf(today),true,6,"TUNIS",2) ;
		AnnouncementManager A = new AnnouncementManager();
		A.logIn(u);
		A.infoUpdate(u);
		A.showAllAnnouncement();
		A.createAnnounce(annonce);
		A.ConsultSellerInformation(annonce);
        annonce.setId(12);
		A.deleteAnnounce(annonce);   
		A.anounceUpdate(annonce,"Vettement ZARA IMPORTE",20.9,"Image2");
		 

	
}
}
