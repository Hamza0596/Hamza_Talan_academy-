
public class Camion extends Vehicule {

	public Camion(int ann�e_mod�le, int prix, int puissance) {
		super(ann�e_mod�le, prix, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("ce camion est de la generation"+ this.get_ann�e_model() +","+"sa matricule est"+" "+matricule+"demarre");
	}

	@Override
	public void accelerer() {
		// TODO Auto-generated method stub
		System.out.println("ce camion est de la generation"+ this.get_ann�e_model() +","+"sa matricule est"+" "+matricule+"acceler");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "lann�e_mod�le de ce camion est de "+" "+this.get_ann�e_model()+" "+"son matricule est"+" "+matricule+" "+"son prix est de "+" "+this.get_prix()+" "+"dinar"+" "+"et elle a une puissance de "+" "+this.get_puissance()+" "+"chevaux"+" "+"a �t� enregistr�";	
	}

}
