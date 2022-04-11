
public class Voile {
	static boolean color;
	static boolean matiere;
	final int ID=5;
	Voile (boolean c){
		this.color=c;
	}

	Voile (){
		
	}

	public void affichage() {
		System.out.print("cle mat du bateau est carracterisée par le couple"+ color+"et"+matiere);
		
	}
}
