
public class Manga extends Livre {
private boolean color_mmanga;
private String direction_mangas="droite a gauche";


	public Manga(String titre, String auteur, double prix, String nb_pages) {
		super(titre, auteur, prix, nb_pages);
		this.color_mmanga=color_mmanga;
		;
		
	}
	
	

	public Manga() {
	}
	
	
	public String  Coverttype() {
		
	    String resultat="noir et blanc";
		
		return resultat;
	
	}
	
	public void afficher_prop_livre() {
		System.out.println("ce livre s'appele"+this.getTitre()+" "+"ecrit par"+" "+this.getNb_pages()+" "+"son priix est"+" "+this.getPrix()+" "+"dinar"+" et il contient "+" "+this.getNb_pages()+" "+"pages"+" "+this.Coverttype()+""+"la direction est"+""+direction_mangas);
	}



	public boolean isColor_mmanga() {
		return color_mmanga;
	}



	public void setColor_mmanga(boolean color_mmanga) {
		this.color_mmanga = color_mmanga;
	}



	public String getDirection_mangas() {
		return direction_mangas;
	}



	public void setDirection_mangas(String direction_mangas) {
		this.direction_mangas = direction_mangas;
	}
	
	
	

}
