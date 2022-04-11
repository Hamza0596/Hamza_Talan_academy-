
public class Pont {
	static boolean type_bois;
	static boolean couleur_bois;
	final int ID=3;
	Pont(boolean tb){
		this.type_bois=tb;
	}

	Pont(){
		
	}

	public void affichage() {
		System.out.print("cle mat du bateau est carracterisée par le couple" + type_bois +"et"+couleur_bois);
		
	}
}
