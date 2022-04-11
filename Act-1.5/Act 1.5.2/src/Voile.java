
public class Voile {
	
	static private int a;
	static private int b;
	static public int c;
	static protected int d;
	static private boolean enroule;
	static private boolean deroule ;
	

		 Voile (int k,int l) {
			 this.a=k;
			 this.b=l;
			
		}
		
        Voile (int f) {
        	this.c=f;
			
		}
		
		
	public void enrouler(boolean Enr) {
		this.enroule=Enr;
		
	}
	public void derouler(boolean der) {
		this.enroule=der;
	}

}
//proposition : utiliser une seul variable enr_der, puis initialiser à true dans la fonction enrouler et a false dans la fonction derouler*/