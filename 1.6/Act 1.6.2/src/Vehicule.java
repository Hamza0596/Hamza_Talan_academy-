import java.util.concurrent.atomic.AtomicInteger;
public abstract class Vehicule {
	private static final AtomicInteger count = new AtomicInteger(0); 
	public final int matricule;
	private int année_modèle;
	private int prix;
	private int puissance;
	
	public Vehicule(int année_modèle,int prix,int puissance) {
		matricule = count.incrementAndGet();  
		this.année_modèle=année_modèle;
		this.prix=prix;
		this.puissance=puissance;	
	}
	
	
	//setter&&getter of annéemodel 
	public int get_année_model() {
		return this.année_modèle;
	}
	
	public void set_année_model(int année) {
		this.année_modèle=année;
	}
	
	//setter&&getter of prix
	public int get_prix() {
		return this.prix;
	}
	
	public void set_prix(int prix) {
		this.prix=prix;
	}
	
	
	//setter&&getter of puissance
	public int get_puissance() {
		return this.puissance;
	}
	
	public void set_puissance(int puissance) {
		this.puissance=puissance;
	}
	
		
	public abstract void demarrer() ;
	public abstract void accelerer() ;
	
	
	public abstract String toString() ;
	
	
	
 
	
	
	
	
	
	

	
	
}
