
public class Camion extends Vehicule {

	public Camion(int année_modèle, int prix, int puissance) {
		super(année_modèle, prix, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("ce camion est de la generation"+ this.get_année_model() +","+"sa matricule est"+" "+matricule+"demarre");
	}

	@Override
	public void accelerer() {
		// TODO Auto-generated method stub
		System.out.println("ce camion est de la generation"+ this.get_année_model() +","+"sa matricule est"+" "+matricule+"acceler");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "lannée_modèle de ce camion est de "+" "+this.get_année_model()+" "+"son matricule est"+" "+matricule+" "+"son prix est de "+" "+this.get_prix()+" "+"dinar"+" "+"et elle a une puissance de "+" "+this.get_puissance()+" "+"chevaux"+" "+"a été enregistré";	
	}

}
