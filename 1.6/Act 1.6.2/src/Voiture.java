
public class Voiture extends Vehicule {

	public Voiture(int ann�e_mod�le, int prix, int puissance) {
		super(ann�e_mod�le, prix, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void demarrer() {
		System.out.println("La voiture de"+ this.get_ann�e_model() +","+"matricule"+" "+matricule+"demarre");		
	}

	@Override
	public void accelerer() {
		System.out.println("La voiture de"+ this.get_ann�e_model() +","+"matricule"+" "+matricule+"accelere");		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "lann�e_mod�le de cette voiture est de "+" "+this.get_ann�e_model()+" "+"son matricule est"+" "+matricule+" "+"son prix est de "+" "+this.get_prix()+" "+"dinar"+" "+"et elle a une puissance de "+" "+this.get_puissance()+" "+"chevaux"+" "+"a �t� enregistr�";	
		 }

}
