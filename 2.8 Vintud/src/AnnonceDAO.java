
public interface AnnonceDAO {

	public void Consulter_liste_Toutes_Les_Anonces_Disponibles();
	public void Déposer_Créer_Annonce(AnnouncementImpl An);
	public void Supprimer_annonce(int id_Annonce);
	public void Modifier_annonce();
	public void Rechercher_annonce_par_nom_catégorie_prix(String nom,int categorie,double price);
    public void Filtrer_annonces_prix(double max_price);
    public void Filtrer_annonces_par_localisation(String localisation);
    public void Enregistrer_annonce_favoris(int id_annonce , int id_user);
    public void Voir_nombre_vue_anonces(int id_annonce);
}
