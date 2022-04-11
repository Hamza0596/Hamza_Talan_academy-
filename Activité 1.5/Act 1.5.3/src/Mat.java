
public class Mat {
	static int longeur_Mat;
	static int forme_mat;
	final int ID=5;
	Mat(int L){
		this.longeur_Mat=L;
	}

	Mat(){
		
	}

	public void affichage() {
		System.out.print("cle mat du bateau est carracterisée par le couple"+ forme_mat+"et"+longeur_Mat);
		
	}
}
