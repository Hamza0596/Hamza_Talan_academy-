import java.util.Scanner;

public class Bultin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String rep="oui";
		

		while(rep.equals("oui")) {
			Scanner input = new Scanner(System.in);  
			System.out.print("entrer un premier nombre");
			int nb1 = input.nextInt();
			
			System.out.print("entrer un deuxieme nombre");
			int nb2= input.nextInt();
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un mot :");
			String str = sc.nextLine();
			
			if(str.equals("*")) {
				 int result =nb1*nb2;
				 System.out.print("resultat total"+result+" Continuez ? (tapez \"Oui\" pour continuer et \"Non\" pour Sortir)");
			}
			if(str.equals("-")) {
				 int result =nb1-nb2;
				 System.out.print("resultat total"+result+" Continuez ? (tapez \"Oui\" pour continuer et \"Non\" pour Sortir)");
			}
			
			else if(str.equals("+")) {
				 int result =nb1+nb2;
				 System.out.print("resultat total"+result+" Continuez ? (tapez \"Oui\" pour continuer et \"Non\" pour Sortir)");
			}
				
				Scanner scann = new Scanner(System.in); 
				 rep = scann.nextLine();
				
					
			
				
				
			}
		System.out.println("Merci, à bientôt l'ami !");
		
			
		}
}
		
	
		
		
		
		
		

	


