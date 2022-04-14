import java.util.Scanner;
public class Lion extends Prédateur implements LionAction,PredateurAction {

	 private String facteur_domination  ;
	    private String rang_domination; 
	    private int facteur_impétuosité  ;
	    
	    
	     public Lion() {
	    	
		}
	    
	    
	    public Lion(String sex, String Age, int force, String groupe) {
			super(sex, Age, force, groupe);
		}
   

	
	
	@Override
    public void Se_nourrir () {
		System.out.println("Lorsquun lion se nourrit, il se nourrit uniquement de viande.");

		
		
		
	}
 	
	
	
	@Override
    public void Chasser () {
		
	      System.out.println("Ce lion chasse en groupe");
		
	}
	
	
	
	@Override
    public void Courrir() {
		System.out.println("le lion cours à tres grande vittese");
		
	}
	
	
	
	@Override
    public void Se_reproduire () {
		System.out.println("la saison de reproduction n'existe pas pour les lion");	
	}
	
	@Override
	public void Emettre_un_son(int son) {
		
		switch(son) {
		  case 1:
		    System.out.println("C'est un son qui Exprime l’appartenance à un groupe");
		    break;
		  case 2:
			    System.out.println("C'est un son qui exprime exprime la domination;");
		    break;
		    
		  case 3:
		    System.out.println("C'est un son qui exprime la soumission");
		  break;
		  case 4:
			  System.out.println("C'est un son qui exprime l’agressivité.");
			  break;
		  

		  default:
			    System.out.println("Ce un son qui n'existe plus");

			   
			    
			   
		}		
	}
	
	@Override
	public void Affiche_caractéristiques() {
		
		System.out.println("les carracteristiques de ce lion sont"+" "+"age:"+" "+this.getAge()+" "+"sex:"+" "+this.getSex()+" "+"force "+" "+this.getForce());
	
		
	}


	@Override
	public void Rugir() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Entendre_un_son() {
		
		
		
	}


	@Override
	public void séparer_temporairement() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	//Getters and setters
		public String get_facteur_dominnation() {
			return this.facteur_domination;
			
			
		}
		
        

		public void set_facteur_dominnation() {
			 do {
			Scanner scanne = new Scanner(System.in);
			System.out.println("donner le facteur de dommination : d pour domminat et nd si non dominant");
			String fact_dom=scanne.nextLine();
			
			if(fact_dom.equals("d")) {
				this.facteur_domination="dominant";
			}
			else if (fact_dom.equals("nd")) {
				this.facteur_domination="non dominant";
				
			}
			else {System.out.println("choix erroné");}
			 }while(facteur_domination==null);
		
		}

		
		
		public String get_rang_domination() {
			
			
			
			return this.rang_domination;
		}
		
		
		
		public void set_rang_domination() {
			
			do {
			Scanner scann = new Scanner(System.in);
			System.out.println("donner le rang de domination, A ou B ou g ou o");
			String rang_domin=scann.nextLine();
			
			if(rang_domin.equals("A")) {
				this.rang_domination="Alpha";
			}
			else if (rang_domin.equals("b")) {
				this.rang_domination="BETA";
				
			}
			else if (rang_domin.equals("g")) {
				this.rang_domination="GAMA";
					
				}
			else if  (rang_domin.equals("o")) {
				this.rang_domination="OMEGA";
					
				}
			
			
		}while(rang_domination==null);
			
			
		}
		
		
		
		
		

		
		public int get_facteur_impétuosité() {
			return this.facteur_impétuosité;
		}
		
		public void set_rang_domination(int fact_imp) {
			
			this.facteur_impétuosité=fact_imp;
		}

			
}
		
		
		
		
	
	
	
	


	