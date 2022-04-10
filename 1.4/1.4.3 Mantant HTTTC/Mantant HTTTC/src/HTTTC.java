import java.util.Scanner;

public class HTTTC {

	public static void main(String[] args) {
		
		int[] a =TaxetHt();
		System.out.println("La somme TTc est "+a[0]);
		System.out.println("La somme Ht est "+a[1]);
		
		
	}
	
	
	static int[] TaxetHt() {
        int size;
		int Mht=0;
        Scanner input = new Scanner(System.in);  
		System.out.print("saisir le nombre de produits achété");
		size =input.nextInt();
		int[] TT = new int[size];
		float[] Tx = new float[size];
		int a=0;
		int Mtax=0;
		float conv=0;
        for(int i=0;i<TT.length;i++) {
			Scanner inpu = new Scanner(System.in);  
			System.out.print("donner le prix du produit "+i );
			int n =inpu.nextInt();
			Scanner tax = new Scanner(System.in);  
			System.out.print("quel est la valeur  tax de ce produit");
			String Valtax =tax.nextLine();
			if(Valtax.equals("normal")){
		        conv=0.2f;
		    }
		    else if(Valtax.equals("interm")){
		    
		    	conv=0.1f;
		    }
		    
		    else if(Valtax.equals("reduit")){
		    
		        conv=0.05f;
		    }
		   
		    
			TT[i]=n;
			Mht+=TT[i];
			Tx[i]=conv;
            
			
			 a+=(Tx[i]*TT[i]);
			 Mtax=a+Mht;
			 
			 
        }
        int[] Resultat =new int[2];
		 Resultat[0]=Mtax;
		 Resultat[1]=Mht;
        return(Resultat);
        
        
        
	}}
	
	
