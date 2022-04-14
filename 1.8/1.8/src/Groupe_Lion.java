import java.util.*;
public class Groupe_Lion extends Group_Prédateur implements GroupePredateurAction,GrpLionAction {
	
	private Lion[] couple_dominant=new Lion[2];
	private  int[] Tpcpl =new int[2]; 
	Lion[] Tab=new Lion[getTaille_grp()];
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
	public void supprimer_predateurds(Lion obj) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("donner l'indice du lion a supprimer");
		int P=in.nextInt();
		list1.remove(P);
	}




	@Override
	public void afficher_caractéristiques_prédateurs_quilcontient() {
		
		
		for(int i=0;i<getTaille_grp();i++) {
			list1.get(i).Affiche_caractéristiques();
		}		
	}
	
	
	@Override
	public void constituer_couple_dominant() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lancer_reproduction_lions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void déclarer_lions_non_dominant() {
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
