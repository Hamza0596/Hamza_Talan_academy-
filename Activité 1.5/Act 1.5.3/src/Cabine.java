
public class Cabine {

	static int longeur_cabine;
	static int largeur_cabine;
	final int ID=4;
	Cabine(int L){
		this.longeur_cabine=L;
	}

	Cabine(){
		
	}

	public void affichage() {
		System.out.print("cle mat du bateau est carracterisée par le couple" + longeur_cabine +"et"+largeur_cabine);		
	}
}
