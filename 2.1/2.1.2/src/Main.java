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
		R�cup�rer_valeur(noms,"Steve");
		modif_val_via_cl�(noms,"John");
		Supprimer_cl�_et_sa_valeur(noms,"Steve");
		System.out.println(noms.get("Steve"));
		supprimer_cl�_valeur_associ�(noms, "Rajeev", "Bengaluru");
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
				System.out.println("la cl� est trouv�e");
				
			}
			else {
				System.out.println("cl� introuvable");
			}
	 }
     
	 static void contains_value(Map a, String value) {
		
		 if(a.containsValue(value)) {
				System.out.println("la valeur inser�e est trouv�e");
				
			}
			else {
				System.out.println("valeur introuvable");
			}
		 
		 
	 }
     
	 static void R�cup�rer_valeur(Map a,String cl�) {
		 
		 if(a.containsKey(cl�)) {
			 System.out.println("la valeur de la cl�  "+" "+cl�+" "+"est egale a"+" "+a.get(cl�));
		 }
		 else {
		System.out.println("c'est pas possible car la cl� est  introuvable");	 
		 }
	 }
	 
	 static void modif_val_via_cl�(Map a,String cl�) {
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Donner la nouvelle valeur de la cl�"+" "+cl�);

		    String s= myObj.nextLine();
		 a.put(cl�,s );
		 System.out.println("la valeur de la cl�  "+" "+cl�+" "+"est egale a"+" "+a.get(cl�));
		 
		 
	 }

	 static void Supprimer_cl�_et_sa_valeur(Map a,String cl�) {
		 
		 a.remove(cl�);
		 System.out.println("le couple cl�/valeur "+" "+"de la cl�"+" "+cl�+" "+"est supprimer");
		 
	 }
     
	 static void supprimer_cl�_valeur_associ�(Map a, String cl�, String valeur) {
		 
		 a.remove(cl�, valeur);
	 }

}

