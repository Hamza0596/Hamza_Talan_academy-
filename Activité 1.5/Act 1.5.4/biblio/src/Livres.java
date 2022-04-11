
public class Livres {
	static String name;
	static String auteur;
	static double prix;

	 Livres (String name,String auteur,double prix){
		this.name=name;
		this.auteur=auteur;
		this.prix=prix;
	}

	public void affichage () {
		System.out.println("ce livre s'appelle"+"  "+name+" " +"ecrit par"+"  "+auteur+" "+"et son prix est de "+" "+prix+" "+"euros" );
	}

}
