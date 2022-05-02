import java.sql.Date;
import java.time.LocalDate;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		UserImpl u1 =new UserImpl( "omarbouachir@yaho.com" , "BOUACHIR","omar","omar123", "123456","56789654","ariena",1) ;
		
		
        Factory.getAnnonce().deleteAnnounce(11);
        Factory.getUser().creatUserAcount(u1);
        Recherche recherche  =new Recherche("vettement enfant ","S","bleu",50.6,20.4,1) ;
        Factory.Get_Recherche_Dao().Createresearch(recherche);
	}

}
