
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Lion l=new Lion();
	    l.setSex();
	    
	    l.setAge();
	    l.setForce();
	    l.Affiche_caractéristiques();
	    l.set_facteur_dominnation();
	    l.set_rang_domination();
	    
	    Ours o =new Ours();
	    
        o.setSex();
	    
	    o.setAge();
	    o.setForce();
	    o.Afficher_caractéristiques_ours();
	    o.Chasser();
	    o.set_puissance();
	    o.set_facteur_facteur_agressivité();
	    o.Courrir();
	    

	}

}
