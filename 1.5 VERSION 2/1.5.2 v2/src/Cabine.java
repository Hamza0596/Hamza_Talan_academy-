import java.util.concurrent.atomic.AtomicInteger;

public class Cabine {
	private  static final AtomicInteger count = new AtomicInteger(2); 
    public final int ID = count.incrementAndGet();
	private int sizecabine;
	private double superficiecabine;

	public Cabine() {
	}
	
	public Cabine(int sizec,double superf) {
		this.sizecabine=sizec;
		this.superficiecabine=superf;
	}
	
	public void affichage_caracteristiques_cabine() {
		System.out.println("La size de cette cabine est de   "+" "+sizecabine+"sa surface est "+superficiecabine);
	}

	public int getSizecabine() {
		return sizecabine;
	}

	public void setSizecabine(int sizecabine) {
		this.sizecabine = sizecabine;
	}

	public double getSuperficiecabine() {
		return superficiecabine;
	}

	public void setSuperficiecabine(double superficiecabine) {
		this.superficiecabine = superficiecabine;
	}

	public String toString(){
		return "la cabine n"+ this.ID+" ,";
	}

	

}
