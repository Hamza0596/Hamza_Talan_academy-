import java.util.concurrent.atomic.AtomicInteger;

public class Pont {
	private  static final AtomicInteger count = new AtomicInteger(3); 
    public final int ID = count.incrementAndGet();
	private int logeurpont;
	private String forme;

	public Pont(int l, String f) {
		this.forme=f;
		this.logeurpont=l;
	}
	
	public Pont() {
		
	}
	
	public void affichage_caracteristiques_pont() {
		System.out.println("ce pont a un longeur de  "+" "+logeurpont+"sa forme est "+forme);
	}

	public int getLogeurpont() {
		return logeurpont;
	}

	public void setLogeurpont(int logeurpont) {
		this.logeurpont = logeurpont;
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}
	
	public String toString(){
		return "le pont n"+ this.ID+" ,";
	}


}
