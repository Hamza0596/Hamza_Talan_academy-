package contientrecurive;

import java.util.Scanner;
import java.util.Arrays;
public class Contientrecu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = saisietab();
		int[] x =tirtab(a);
		Scanner input = new Scanner(System.in);  
		System.out.print("entrer un nombre a introduire dans le tableau");
		int n =input.nextInt();
		int i =0;
		int resultat =contienounn(n,x,i);
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
	
	static int contienounn(int n,int[]tt,int i) {
		
		
		boolean test= false;
		
		
			if(tt[i]==n) {
				
				
		          test=true;}
				
			else if (test==false && i <tt.length){
				i++;      
				return  (contienounn (n,tt,i+1));
                      
                        }
			{
			
		}
		return(i);
	}

}
