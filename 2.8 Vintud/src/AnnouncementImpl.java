import java.sql.Blob;
import java.util.Date;

public class AnnouncementImpl implements Announcement {
	private String titre;
	private String description;
	private String localisation;
	private String Date_publication ;
	private String photo;
	private double price ; 
	
	private int cat�gorie;
	private int nbr_Vue;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int user_id;
	
	private double prix;
	private boolean etat_Disponibilit�;


	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public AnnouncementImpl() {
		
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCat�gorie() {
		return cat�gorie;
	}

	public void setCat�gorie(int cat�gorie) {
		this.cat�gorie = cat�gorie;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDate_publication() {
		return Date_publication;
	}

	public void setDate_publication(String date_publication) {
		Date_publication = date_publication;
	}

	public boolean isEtat_Disponibilit�() {
		return etat_Disponibilit�;
	}

	public void setEtat_Disponibilit�(boolean etat_Disponibilit�) {
		this.etat_Disponibilit� = etat_Disponibilit�;
	}

	public int getNbr_Vue() {
		return nbr_Vue;
	}

	public void setNbr_Vue(int nbr_Vue) {
		this.nbr_Vue = nbr_Vue;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	


	
	
	

}