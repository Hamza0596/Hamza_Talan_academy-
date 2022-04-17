import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x;
		x=saisietab();
		displaytabavant(x);
		Tri(x);
		displaytabapres(x);
		
    
}
	
	
	
	
	
	static void Tri(int[] tab) {
	
		for (int i = 0; i <= tab.length-1; i++)  
        {
             int index = i;  
             for (int j = i + 1; j < tab.length; j++)
             {
                  if (tab[j] < tab[index]){ 
                       index = j;
                  }
             }

             int min = tab[index];
             tab[index] = tab[i]; 
             tab[i] = min;
        }
		
	}
	
	
	
	
	
	static int[] saisietab() {
		int size;
		
		
		Scanner input = new Scanner(System.in);  
		System.out.print("donner la taille du tableau");
		size = input.nextInt();
		
		int[] TT= new int[size];
		int k=0;
		
		
		for( k=0 ; k <size ; k++) {
			Scanner inpu = new Scanner(System.in);  
    		System.out.print("entrer un nombre");
    		int n = input.nextInt();
			TT[k]=n;
			
		
		}
		return(TT);

		
		
		
		
		
		
		
	}
	
	static void displaytabavant(int[] Tableau) {
		int i;
		System.out.println("le tableau avant le tri est sous la forme suivante:");
		for(i=0;i<Tableau.length-1;i++) {
			System.out.println(Tableau[i]);
		}
	}
		
	
	
	
	
	
	
	
	
	static void displaytabapres(int[] Tableau) {
			int i;
			System.out.println("le tableau apres le tri est sous la forme suivante:");

			for(i=0;i<=Tableau.length-1;i++) {
				System.out.println(Tableau[i]);
			}
			
	}
}
