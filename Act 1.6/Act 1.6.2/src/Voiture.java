
public class Voiture extends Vehicule {

	public Voiture(int année_modèle, int prix, int puissance) {
		super(année_modèle, prix, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void demarrer() {
		System.out.println("La voiture de"+ this.get_année_model() +","+"matricule"+" "+matricule+"demarre");		
	}

	@Override
	public void accelerer() {
		System.out.println("La voiture de"+ this.get_année_model() +","+"matricule"+" "+matricule+"accelere");		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "lannée_modèle de cette voiture est de "+" "+this.get_année_model()+" "+"son matricule est"+" "+matricule+" "+"son prix est de "+" "+this.get_prix()+" "+"dinar"+" "+"et elle a une puissance de "+" "+this.get_puissance()+" "+"chevaux"+" "+"a été enregistré";	
		 }

}
