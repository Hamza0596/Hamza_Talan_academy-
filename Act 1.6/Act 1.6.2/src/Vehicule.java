import java.util.concurrent.atomic.AtomicInteger;
public abstract class Vehicule {
	private static final AtomicInteger count = new AtomicInteger(0); 
	public final int matricule;
	private int ann�e_mod�le;
	private int prix;
	private int puissance;
	
	public Vehicule(int ann�e_mod�le,int prix,int puissance) {
		matricule = count.incrementAndGet();  
		this.ann�e_mod�le=ann�e_mod�le;
		this.prix=prix;
		this.puissance=puissance;	
	}
	
	
	//setter&&getter of ann�emodel 
	public int get_ann�e_model() {
		return this.ann�e_mod�le;
	}
	
	public void set_ann�e_model(int ann�e) {
		this.ann�e_mod�le=ann�e;
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
