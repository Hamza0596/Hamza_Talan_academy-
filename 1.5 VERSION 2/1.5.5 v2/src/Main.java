
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		BDS BD=new BDS("Mario","Hamza bouachir",45,"deux cents",false);
		BD.setColor(true);
		
		BD.afficher_prop_livre();
		
		Manga M=new Manga("kilo","Hamza",45,"cents");
		M.afficher_prop_livre();
		
		Roman R=new Roman("roman historique","hamza",45,"trois cents");
		R.setNbrchapitres(50);
		R.setResule("efzflklelzlmleflp$fem:;cedz:ù");
		R.afficher_prop_livre();
		
		
		    LivreRecette lrc1 = new LivreRecette("Marmiton", "Philippe Etchebest", 15,"cents");
	        Recettes rc1 = new Recettes("Les pâtes crues", "Comment réaliser de délicieuses pâtes crues.", 3);
	        rc1.addastuce();
	        rc1.addetape();
	        lrc1.ajout_recette(rc1); 
		    rc1.affiche_les_etapes();

	}
	
	

}
