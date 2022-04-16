import java.util.concurrent.atomic.AtomicInteger;

public class Voile {
private  static final AtomicInteger count = new AtomicInteger(5); 
public final int ID = count.incrementAndGet();	
private int Longeurvoile;
private int Largeurvoile;
public int poidvoile;
protected String qualité;
private boolean enroule ;
private boolean deroule ;




	public Voile( int Longeurvoile,int Largeurvoile,int poidvoile,String qualité){

		this.Longeurvoile=Longeurvoile;
		
	}
	public Voile( ){

	}
	
	public boolean enrouler() {
		this.enroule=true;
		return(enroule);
		
	}
	
	public boolean derouler() {
		this.enroule=true;
		return(deroule);
		
	}
	
	
	
	
	
	
	
	
	public int getLongeurvoile() {
		return Longeurvoile;
	}
	public void setLongeurvoile(int longeurvoile) {
		Longeurvoile = longeurvoile;
	}
	public int getLargeurvoile() {
		return Largeurvoile;
	}
	public void setLargeurvoile(int largeurvoile) {
		Largeurvoile = largeurvoile;
	}
	public int getPoidvoile() {
		return poidvoile;
	}
	public void setPoidvoile(int poidvoile) {
		this.poidvoile = poidvoile;
	}
	public String getQualité() {
		return qualité;
	}
	public void setQualité(String qualité) {
		this.qualité = qualité;
	}
	public boolean isEnroule() {
		return enroule;
	}
	public void setEnroule(boolean enroule) {
		this.enroule = enroule;
	}
	public boolean isDeroule() {
		return deroule;
	}
	public void setDeroule(boolean deroule) {
		this.deroule = deroule;
	}
	
	public String toString(){
		return "Voile n"+ this.ID+" ,";
	}
	
	
	

}
