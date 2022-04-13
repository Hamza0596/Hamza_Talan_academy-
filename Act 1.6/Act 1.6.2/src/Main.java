
public class Main {

	public Main() {

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture V1 =new Voiture(1990,60,10);
		System.out.println(V1);
		V1.demarrer();
		V1.accelerer();
		
		
		Voiture V2 =new Voiture(1996,60,10);
		System.out.println(V2);
		V1.demarrer();
		V1.accelerer();
	
		Camion C1 =new Camion(1900,50000,600);
		System.out.println(C1);
		C1.demarrer();
		C1.accelerer();
		
		
		Camion C2 =new Camion(1980,6000,40);
		System.out.println(C2);
		C2.demarrer();
		C2.accelerer();
	
	}
	

}
