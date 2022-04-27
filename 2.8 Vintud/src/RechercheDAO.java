import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public interface RechercheDAO {

	public void créer_recherche(Recherche recherche ) ;
	public void supprimer_recherche(Recherche recherche);
	public void lancer_recherche(int id_recherche);
	public void modifier(int id_modif);
	
	
	

}
