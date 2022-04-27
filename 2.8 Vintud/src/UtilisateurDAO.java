
public interface UtilisateurDAO {
	
	public void Créer_compte( UserImpl u1) ;
	public boolean se_conecter() ;
	public void Modifier_Informations_Personnelles(UserImpl u) ;
	public void Consulter_Informations_Vendeur(int id_vendeur);
	

}
