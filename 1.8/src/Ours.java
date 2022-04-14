
import java.util.Scanner;

public class Ours extends Pr�dateur implements OursAction,PredateurAction {
	
	private int facteur_agressivit�;
	private int puissance;
	private boolean hivernation;
	
	public Ours() {
    	
	}
	
	public Ours(String sex, String Age, int force, String groupe) {
		super(sex, Age, force, groupe);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void Se_nourrir () {
		
		System.out.println("Un ours est omnivore.");
		
	}
 	
	
	
	@Override
    public void Chasser () {
		
	      System.out.println("l'ours chasse seul");
		
	}
	
	
	
	@Override
    public void Courrir() {
		System.out.println("Un ours ne peut pas courir rapidement ");
		
	}
	
	
	
	@Override
    public void Se_reproduire () {
		System.out.println(" le pic d'activit� de reproduction a g�n�ralement lieu autour du mois de mai");
		
	}
	
	
	
	@Override
	public void Emettre_un_son(int son) {

		switch(son) {
		  case 1:
		    System.out.println("C'est un son qui Exprime  la peur;");
		    break;
		  case 2:
			    System.out.println("C'est un son qui exprime sa pr�sence ;");
		    break;
		    
		  case 3:
		    System.out.println("C'est un son pour effrayer un autre pr�dateur");
		  break;
		  case 4:
			  System.out.println("C'est un son pour exprimer l�agressivit�..");
			  break;
		  

		  default:
			    System.out.println("Ce un son qui n'existe plus");

			   
			    
			    
			    
			    
			   
		}		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void Afficher_caract�ristiques_ours() {
		// TODO Auto-generated method stub
		System.out.println("les carracteristiques de cet ours sont"+" "+"age:"+" "+this.getAge()+" "+"sex:"+" "+this.getSex()+" "+"force "+" "+this.getForce());

	}

	@Override
	public void Grimper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Creuser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hiverner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hurler() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	//Getters and setters
			public int get_facteur_agressivit�() {
				return this.facteur_agressivit�;
			}
			
			public void set_facteur_facteur_agressivit�() {
				
				facteur_agressivit�=0;
				do {
				Scanner fg = new Scanner(System.in);
				System.out.println("donner un facteur d'agressivit� de 0 �10");
				int f=fg.nextInt();
				
				if((f>=0)&&(f<=10)) {
					this.facteur_agressivit�=f;
					
				}
				else {
					System.out.println("facteur non ad�quat");
				}
				}while(facteur_agressivit�==0);
				
			}
			
			
			
			public int get_puissance() {
				return this.puissance;
			}
			
			public void set_puissance() {
				
					Scanner sp = new Scanner(System.in);
					System.out.println("donner sa puissance ");
					int Pw=sp.nextInt();
					
					
				   this.facteur_agressivit�=Pw;
						
					
			
			}
			
			
			
			public boolean get_hivernation() {
				return this.hivernation;
			}
			
			public void set_hivernation(boolean HIVERNATION) {
				
				this.hivernation=HIVERNATION;
			}
}
