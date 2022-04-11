
public class Coque {
	static boolean matiere;
	static boolean forme;
	final int ID=2;
	Coque(boolean m){
		this.matiere=m;
	}

	Coque(boolean f,boolean mm){
		this.forme=f;
		this.matiere=mm;
	}

	public void affichage() {
		System.out.print("cle mat du bateau est carracterisée par le couple" + matiere +"et"+forme);
		
	}
}
