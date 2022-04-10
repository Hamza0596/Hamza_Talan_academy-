import java.util.Scanner;

public class Contient_nn_recursi {

	public static void main(String[] args) {
		
		int[] x =saisetab();
		boolean a =searche(x);
		System.out.print(a);

		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	static int[] saisetab() {
		int size;
	
		Scanner input = new Scanner(System.in);  
		System.out.print("entrer la size");
		size =input.nextInt();
		int[] Tab=new int[size];
		
		for(int i=0;i<size;i++) {
			
			Scanner inpu = new Scanner(System.in);  
			System.out.print("entrer le nombre num"+i);
			int n =inpu.nextInt();
			Tab[i]=n;
			
			
		}
		return(Tab);
	}
	
	static boolean  searche(int[] tt) {
		Scanner inpu = new Scanner(System.in);  
		System.out.print("entrer un nombre");
		int k =inpu.nextInt();
		
		boolean resultat=false;
			for(int i=0;i<tt.length;i++) {
				
				if (tt[i]==k) {
					resultat=true;
					
				}
				
			
			}
			return(resultat);
		
		
	}
}
	
	
	
		
		
