import java.util.concurrent.atomic.AtomicInteger;

public class Bateau {
	private  static final AtomicInteger count = new AtomicInteger(0); 
    public final int ID = count.incrementAndGet();
	
	private String couleur;
	private  double prix;

	public Bateau(String couleur, double prix) {
		this.couleur=couleur;
		this.prix=prix;
		
   
	}
	
	public Bateau() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void affichage_caracteristiques_bateau() {
		System.out.println("c'est un bateau de couleur "+" "+couleur+"son prix est de "+prix+" "+"dinar");
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public String toString(){
		return "le bateau num "+" "+this.ID+" "+"est constitué de :";
	}


}
