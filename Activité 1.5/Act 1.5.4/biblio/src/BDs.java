
public class BDs extends Livres {

	static boolean color;
	public BDs(String name, String auteur, double prix,boolean color) {
		super(name, auteur, prix);
		
		this.color=color;
	}
	
	public void affichage() {
		
		String resultat;
		resultat="";
		if(color==true) {
			resultat="couleur";
		}
		else { resultat="noir et blanc";
			
		}
		System.out.println("ce manga s'appelle"+"  "+name+" " +"ecrit par"+"  "+auteur+" "+"et son prix est de "+" "+prix+" "+"euros"+" "+"il est imprimé en "+" "+resultat);
		
		
		
	}

}
