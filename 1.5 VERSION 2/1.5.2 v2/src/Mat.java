import java.util.concurrent.atomic.AtomicInteger;

    
    
    public class Mat {
    private  static final AtomicInteger count = new AtomicInteger(4); 
    public final int ID = count.incrementAndGet();
	private int longeurmat;
	public int getID() {
		return ID;
	}

	private int poidmat;

	public Mat(int l,int p) {
		this.longeurmat=l;
		this.poidmat=p;
	}
	
	public Mat() {
		
	}
	
	public void affichage_caracteristiques_Mat() {
		System.out.println("Ce Mat a un longeur  "+" "+longeurmat+"son poids est de "+poidmat+" "+"kg");
	}
	

	public int getLongeurmat() {
		return longeurmat;
	}

	public void setLongeurmat(int longeurmat) {
		this.longeurmat = longeurmat;
	}

	public int getPoidmat() {
		return poidmat;
	}

	public void setPoidmat(int poidmat) {
		this.poidmat = poidmat;
	}
	
	public String toString(){
		return "Mat n"+ this.ID+" ,";
	}
	
	

}
