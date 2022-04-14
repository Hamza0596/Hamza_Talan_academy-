import java.util.*;
public class Groupe_Lion extends Group_Prédateur implements GroupePredateurAction,GrpLionAction {
	
	private Lion[] couple_dominant=new Lion[2];
	private  int[] Tpcpl =new int[2]; 
	private List<Lion> list1 = new ArrayList<Lion>(); 


	public Groupe_Lion(int taille_grp, String Zone_geo) {
		super(taille_grp, Zone_geo);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void propres_caract() {
		System.out.println("ce groupe contien"+" " +getTaille_grp()+" "+"lion"+" "+"qui se trouvent dans la zone "+" "+getZone_geo());		
	}



	@Override
	public void ajouter_predateurds(Lion obj) {
		// TODO Auto-generated method stub

			list1.add(obj);
		
			
		}
	



	@Override
	public void supprimer_predateurds() {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Quelle est le lion a supprimer");
		int P=in.nextInt();
		list1.remove(P-1);
	}




	@Override
	public void afficher_caractéristiques_prédateurs_quilcontient() {
		
		
		for(int i=0;i<list1.size();i++) {
			list1.get(i).Affiche_caractéristiques();
		}		
	}
	
	
	@Override
	public void constituer_couple_dominant(Lion L1,Lion L2) {
		
		String dom=L1.get_facteur_dominnation();
		String Genrem=L1.getSex() ;
		String Genref=L2.getSex();
		if((dom=="dominant")&&(Genrem=="Male")&&(Genref=="femelle")) {
			couple_dominant[0]=L1;
			couple_dominant[0]=L2;
			System.out.println("Le choix  est validé, c'est un couple domminant");
			
		}
		else {
			System.out.println("non,c'est pas un couple dominant");
			
		}
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lancer_reproduction_lions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void déclarer_lions_non_dominant() {
		
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).get_facteur_dominnation()=="dominant") {
				System.out.println (list1.get(i) +" "+"est un lion dominant");
			}
			else {
				System.out.println(list1);
			}
		}
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	public Lion[] getCouple_dominant() {
		return couple_dominant;
	}

	public void setCouple_dominant(Lion[] couple_dominant) {
		this.couple_dominant = couple_dominant;
	}

	public int[] getTpcpl() {
		return Tpcpl;
	}

	public void setTpcpl(int[] tpcpl) {
		Tpcpl = tpcpl;
	}

	
	

}