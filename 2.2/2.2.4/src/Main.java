import java.io.File;
import java.io.FilenameFilter;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		affichage_contenu_Tab_recur("C:\\Users\\hbouachir\\Desktop\\dossier test path");	
		affichage_contenu_Tab("C:\\Users\\hbouachir\\Desktop\\dossier test path");
	
	affichage_contenu_Tab_recur_filter("C:\\Users\\hbouachir\\Desktop\\dossier test path");
		
		
		
		

}
	
	static void affichage_contenu_Tab(String path){
		
		File A =new File(path);
		String[] Tab ;
		Tab =A.list();
		for(int i=0;i<Tab.length;i++) {
	    System.out.println(Tab[i]);
	    
	}
	}
	
	static void affichage_contenu_Tab_recur(String path) {
		
		File A =new File(path);
		String[] Tab ;
	
		Tab =A.list();
		for(int i=0;i<Tab.length;i++) {
			File A2 =new File(path+"/"+Tab[i]);
			
			if(A2.isFile())
			System.out.println(Tab[i]);
			
			else{
				 
				affichage_contenu_Tab(path+"/"+Tab[i]);
				
			}
		}
		}
	
	static void affichage_contenu_Tab_recur_filter(String path) {
		
		FilenameFilter B =new Filter();
		File A =new File(path);
		String[] Tabb=A.list(B);
	
	
		for(int i=0;i<Tabb.length;i++) {
			File A2 =new File(path+"/"+Tabb[i]);
			
			if(A2.isFile())
			System.out.println(Tabb[i]);
			
			else{
				 
				affichage_contenu_Tab(path+"/"+Tabb[i]);
				
			}
		}
		}
	
	
	}
	
	
	
	
	
	

