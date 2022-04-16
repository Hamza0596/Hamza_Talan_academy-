
public class Livre {
	private String titre;
	private String auteur;
	private double prix;
	private String nb_pages ;

	public Livre(String titre,String auteur,double prix,String nb_pages) {
		this.titre=titre;
		this.auteur=auteur;
		this.prix=prix;
		this.nb_pages=nb_pages;
	}
	
	public Livre() {
	}
	
	public void afficher_prop_livre() {
		System.out.println("ce livre s'appele"+titre+" "+"ecrit par"+" "+auteur+" "+"son priix est"+" "+prix+" "+"dinar"+" et il contient "+" "+nb_pages+" "+"pages");
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getNb_pages() {
		return nb_pages;
	}

	public void setNb_pages(String nb_pages) {
		this.nb_pages = nb_pages;
	}
	
	


}
