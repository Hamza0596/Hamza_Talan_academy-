
public class Factory {


	public static AnnonceDAOImpl getAnnonce () {
		return new AnnonceDAOImpl();
	}
	
	public static UtilisateurDAOImpl getUser() {
		return new UtilisateurDAOImpl();
	}
		
	public static RechercheDaoImpl Get_Recherche_Dao() {
		return new RechercheDaoImpl() ;
	}
	
	public static FavorisDaoImpl Get_Favoris_Dao() {
		return new FavorisDaoImpl() ;
	}
	

}
