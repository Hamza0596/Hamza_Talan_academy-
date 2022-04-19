import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Map numberMapping = new HashMap<>();
		Map noms = new HashMap<>();

		
		numberMapping.put("one",1);
		numberMapping.put("two",2);
		numberMapping.put("three",3);
		numberMapping.put("four",4);
		System.out.println(numberMapping);
		
		noms.put("Steve","London");
		noms.put("John","New York");
		noms.put("Rajeev","Bengaluru");
		System.out.println(noms);
		is_empty(noms);
		trouvez_size(noms);
		contains_key(noms, "Steve");
		contains_value(noms,"New York");
		Récupérer_valeur(noms,"Steve");
		modif_val_via_clé(noms,"John");
		Supprimer_clé_et_sa_valeur(noms,"Steve");
		System.out.println(noms.get("Steve"));
		supprimer_clé_valeur_associé(noms, "Rajeev", "Bengaluru");
		System.out.println(noms.get("Rajeev"));
		
		
		

	}
	
	 static void is_empty(Map a) {
		
		if(a.isEmpty()) {
			System.out.println("c'est vide");
			
		}
		else {
			System.out.println("c'est pas vide");
		}

		
	}
	 
	 static void trouvez_size(Map a) {
        
			System.out.println("la taille de cette classe est"+" "+a.size());

	 }
	 
	 static void contains_key(Map a, String key) {
	        
			if(a.containsKey(key)) {
				System.out.println("la clé est trouvée");
				
			}
			else {
				System.out.println("clé introuvable");
			}
	 }
     
	 static void contains_value(Map a, String value) {
		
		 if(a.containsValue(value)) {
				System.out.println("la valeur inserée est trouvée");
				
			}
			else {
				System.out.println("valeur introuvable");
			}
		 
		 
	 }
     
	 static void Récupérer_valeur(Map a,String clé) {
		 
		 if(a.containsKey(clé)) {
			 System.out.println("la valeur de la clé  "+" "+clé+" "+"est egale a"+" "+a.get(clé));
		 }
		 else {
		System.out.println("c'est pas possible car la clé est  introuvable");	 
		 }
	 }
	 
	 static void modif_val_via_clé(Map a,String clé) {
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Donner la nouvelle valeur de la clé"+" "+clé);

		    String s= myObj.nextLine();
		 a.put(clé,s );
		 System.out.println("la valeur de la clé  "+" "+clé+" "+"est egale a"+" "+a.get(clé));
		 
		 
	 }

	 static void Supprimer_clé_et_sa_valeur(Map a,String clé) {
		 
		 a.remove(clé);
		 System.out.println("le couple clé/valeur "+" "+"de la clé"+" "+clé+" "+"est supprimer");
		 
	 }
     
	 static void supprimer_clé_valeur_associé(Map a, String clé, String valeur) {
		 
		 a.remove(clé, valeur);
	 }

}

