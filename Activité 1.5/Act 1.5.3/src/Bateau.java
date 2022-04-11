
public class Bateau {
static boolean couleur;
static boolean nom;
final int ID=1;

Bateau(boolean Name){
	this.nom=Name;
}

Bateau(boolean color,int a){
	this.couleur=color;
}

public void affichage() {
	System.out.print("cle mat du bateau est carracterisée par le couple" + couleur +"et"+nom);

	
}
}
