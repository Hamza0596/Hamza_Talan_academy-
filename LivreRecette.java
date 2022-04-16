import java.util.*;


public class LivreRecette extends Livre {
List<Recettes> Listesdesrecettes = new ArrayList<Recettes>() ;


	public LivreRecette(String titre, String auteur, double prix, String nb_pages) {
		super(titre, auteur, prix, nb_pages);
	}

	public LivreRecette() {
	}
	
	
			
			public void ajout_recette(Recettes obj) {
		
		Listesdesrecettes.add(obj);
		
	}

}
