import java.util.Scanner;
import java.util.Arrays;
public class Contientnonrecursic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = saisietab();
		int[] x =tirtab(a);
		Scanner input = new Scanner(System.in);  
		System.out.print("entrer un nombre a introduire dans le tableau");
		int n =input.nextInt();
		int resultat =contienounn(n,x);
		System.out.print(resultat);
		
		
	}
	
	
	
	static int[] saisietab() {
		Scanner input = new Scanner(System.in);  
		System.out.print("entrer la taille du tableau");
		int taille =input.nextInt();
		int [] T = new int[taille];
		for(int i=0;i<taille;i++) {
			Scanner inputn = new Scanner(System.in);  
			System.out.print("entrer l'element num " + i);
			int n =inputn.nextInt();
			T[i]=n;
		
		}
		
		return(T);
	}
	
	static int[] tirtab(int[] tab) {
		Arrays.sort(tab);
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		return(tab);
		
	}
	
	static int contienounn(int n,int[]tt) {
		
		
		boolean test= false;
		int i=0;
		while(( i<tt.length)&& test==false) {
			if(tt[i]<n) {
				test=false;
				i++;
			}
			if(tt[i]>=n) {
				
				test=true;
			}
			else {
				System.out.println("element non trouvé");
				test=true;
			}
			
			
		}
		return(i);
	}

}