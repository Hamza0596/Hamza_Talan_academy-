import java.sql.Blob;
import java.util.Date;

public class AnnouncementImpl implements Announcement {
	private String titre;
	private String description;
	private String catégorie;
	private double prix;
	private Blob photo;
	private Date Date_publication = new Date();
	private boolean etat_Disponibilité;
	private int nbr_Vue;
	private String localisation;

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

	public String getCatégorie() {
		return catégorie;
	}

	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public Date getDate_publication() {
		return Date_publication;
	}

	public void setDate_publication(Date date_publication) {
		Date_publication = date_publication;
	}

	public boolean isEtat_Disponibilité() {
		return etat_Disponibilité;
	}

	public void setEtat_Disponibilité(boolean etat_Disponibilité) {
		this.etat_Disponibilité = etat_Disponibilité;
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
	
	
	

}
