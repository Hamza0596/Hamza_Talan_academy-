import java.nio.file.FileSystemLoopException;
import java.util.*;
public class Main {

	public Main() {
		
		}

	public static void main(String[] args) {
		ArrayList<String> animaux = new ArrayList<>();
		animaux.add("Lion");
		animaux.add("Tiger");
		animaux.add("Cat");
		animaux.add("Dog");
		System.out.println(animaux);
		animaux.add(2, "Elephant");
		System.out.println(animaux);
		ArrayList<String> copy_annimaux = new ArrayList<>(animaux);
		System.out.println(copy_annimaux);
		animaux.addAll(copy_annimaux);
		System.out.println(animaux);
		System.out.println("Taille du tableau"+" "+animaux.size());
		
		suprime_animal_par_indice(animaux,4);
		suprime_animal_par_nom(animaux,"Tiger");
		recherche_animal_index(animaux,1);
		recherche_animal_nom(animaux,"Dog");
		listsoert(animaux) ;
		System.out.println(listsoert(animaux));
		
		
		
	}
	static void suprime_animal_par_indice(ArrayList a,int i) {
		
		
		System.out.println("Suppression de l'élément en position :"+" "+i);
		System.out.println("Suppression de l'élément :"+" "+a.get(i-1));
		a.remove(i-1);
		System.out.println("Nouveau tableau:"+" "+a);
		System.out.println("Taille du tableau"+" "+a.size());
		

		
	}   
	
	static void suprime_animal_par_nom(ArrayList a,String nom) {

		
		
		System.out.println("Suppression de l'animal (nom):"+" "+nom);
		for(int i=0 ; i<a.size();i++) {
			if(a.contains(nom)) {
				a.remove(nom);
				System.out.println("element suprimé");
			}
			
			
		}
		a.remove(nom);
		System.out.println("Nouveau tableau:"+" "+a);
		System.out.println("Taille du tableau"+" "+a.size());
		

		
	}
	
    static void recherche_animal_index(ArrayList a,int i) {
    	
    	System.out.println("l'animal rechercher est un"+" "+a.get(i-1));
    	
    	
    	
    }
    static void recherche_animal_nom(ArrayList a,String nom) {

    	
    	boolean resultat=a.contains(nom);
    	if(resultat==true) {
    		System.out.println("element trouvé dans la position :"+" "+(a.indexOf(nom)+1));

    }
    	else {
    		System.out.println("element non  trouvé ");
    		
    	}
    	

}
    static ArrayList Tri_collections(ArrayList a) {
    	
    	Collections.sort(a);
    	return a;
    	
    }
    
    static ArrayList listsoert(ArrayList a) {
    	
    	a.sort(null);
    	return a;
    	
    }
    
    


}


