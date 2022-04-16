
public class BDS extends Livre {
	private boolean color;
	private String direction;

	public BDS(String titre, String auteur, double prix, String nb_pages,boolean color) {
		super(titre, auteur, prix, nb_pages);
		this.color=color;
		this.direction="de gauche à droite";
		// TODO Auto-generated constructor stub
	}

	public BDS() {
		// TODO Auto-generated constructor stub
		

	}
	
	public String  Coverttype() {
		String resultat="non precisé";
		
		if ((this.color)) { 
			resultat="coloré" ;
			
		}
	    
		if (!(this.color)) { 
			resultat="noir blanc" ;
			
		}
		return resultat;
	}
	
	
	
	
	public void afficher_prop_livre() {
		System.out.println("ce BDS s'appele"+this.getTitre()+" "+"ecrit par"+" "+this.getAuteur()+" "+"son priix est"+" "+this.getPrix()+" "+"dinar"+" et il contient "+" "+this.getNb_pages()+" "+"pages"+" "+"il est"+" "+this.Coverttype()+""+"la direction est"+""+direction);
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}
	
	

	
}
