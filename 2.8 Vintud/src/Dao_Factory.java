
public class Dao_Factory {

	public static AnnonceDAOImpl Get_Annoce_Dao() {
		return new AnnonceDAOImpl() ;
	}
	
	public static FavorisDaoImpl Get_Favoris_Dao() {
		return new FavorisDaoImpl() ;
	}
	
	
	public static RechercheDaoImpl Get_Recherche_Dao() {
		return new RechercheDaoImpl() ;
	}
	
	
	public static UtilisateurDAOImpl Get_Utilisateur_Dao() {
		return new UtilisateurDAOImpl() ;
	}
}
