import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class Recettes {
	private String namerecette;
	private String description;
	private int Niveau_difficult�s;
	List<String> Listeetape = new ArrayList<String>() ;
	List<String> listeastuce = new ArrayList<String>() ;

	public Recettes(String name,String description,int niv) {
		this.namerecette=name;
		this.description=description;
		this.Niveau_difficult�s=niv;
	}

	public void addetape() {
		
		Scanner scanne = new Scanner(System.in);
		System.out.println("donner l'etape a ajouter");
		String etape=scanne.nextLine();
		Listeetape.add(etape);
		
	}
	
    public void addastuce() {
    	
		Scanner scanne = new Scanner(System.in);
		System.out.println("donner l'astuce a ajouter");
		String astuce=scanne.nextLine();
		listeastuce.add(astuce);
		
		
	}
    
    
    public void affiche_les_etapes() {
    	for(int i=0;i<Listeetape.size();i++) {
    		System.out.println("les etapes de cette recettes sont :");
    		
    		System.out.println(Listeetape.get(i));    		
    	}
    }

	public String getNamerecette() {
		return namerecette;
	}

	public void setNamerecette(String namerecette) {
		this.namerecette = namerecette;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNiveau_difficult�s() {
		return Niveau_difficult�s;
	}

	public void setNiveau_difficult�s(int niveau_difficult�s) {
		Niveau_difficult�s = niveau_difficult�s;
	}

	public List<String> getListeetape() {
		return Listeetape;
	}

	public void setListeetape(List<String> listeetape) {
		Listeetape = listeetape;
	}

	public List<String> getListeastuce() {
		return listeastuce;
	}

	public void setListeastuce(List<String> listeastuce) {
		this.listeastuce = listeastuce;
	}
    
}
