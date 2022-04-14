
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	
		Lion l1=new Lion();
	    l1.setSex("lion");
	    
	    l1.setAge("lion");
	    l1.setForce();
	    l1.Affiche_caractéristiques();
	    l1.set_facteur_dominnation();
	    l1.set_rang_domination();
	    l1.Emettre_un_son(8);
	    
	
	    
	    Lion l2=new Lion();
	    l2.setSex("lion");
	    l2.setAge("lion");
	    l2.setForce();
	    l2.Affiche_caractéristiques();
	    l2.set_facteur_dominnation();
	    l2.set_rang_domination();
	    l2.Emettre_un_son(2);
	    
	    
	    
	    Lion l3=new Lion();
	    l3.setSex("lion");
	    l3.setAge("lion");
	    l3.setForce();
	    l3.Affiche_caractéristiques();
	    l3.set_facteur_dominnation();
	    l3.set_rang_domination();
	    l3.Emettre_un_son(4);
	    Lion l4=new Lion();
	    
       
	    
	    Groupe_Lion Gl =new Groupe_Lion(3,"foret");
	    Gl.propres_caract();
	    Gl.ajouter_predateurds(l1);
	    Gl.ajouter_predateurds(l2);
	    Gl.ajouter_predateurds(l3);
	    
	    Gl.afficher_caractéristiques_prédateurs_quilcontient();;
	    Gl.supprimer_predateurds(l2);
	
	    Gl.afficher_caractéristiques_prédateurs_quilcontient();
	    
	    
	}

}
