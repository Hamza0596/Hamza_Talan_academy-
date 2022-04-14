import java.util.Scanner;
public abstract class Prédateur implements PredateurAction {

	private String sex;
	private String Age;
	private int force;
	private String groupe;
	
	
	
	public Prédateur() {
		
	}
	
	public Prédateur(String sex,String Age, int force,String groupe) {
		this.sex=sex;
		this.Age=Age;
		this.force=force;
		this.groupe=groupe;
		
	}
	

	@Override
	public void Se_nourrir() {
		// TODO Auto-generated method stub
		System.out.println("se nourir");
	}

	@Override
	public void Chasser() {
		// TODO Auto-generated method stub
		System.out.println("je chasses");
	}

	@Override
	public void Courrir() {
		// TODO Auto-generated method stub
		System.out.println("je cours");
	}

	@Override
	public void Se_reproduire() {
		// TODO Auto-generated method stub
		System.out.println("je cours");

	}

	@Override
	public void Emettre_un_son(int son) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	//get setters

	public String getSex() {
		return sex;
	}

	public void setSex(String aaa) {
		
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("donner le sex de ce "+aaa);
			String S=input.nextLine();
			if(S.equals("M")) {
				this.sex = "Male";
				
			}
			else if(S.equals("F")) {
				this.sex="femelle";
			}
			
			else { System.out.println("choix erroné");}
		}while(sex==null);
		
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String individu) {
		do{
			Scanner inpu = new Scanner(System.in);
			System.out.println("donner l'age de ce"+individu);
			String A=inpu.nextLine();
			if(A.equals("J")) {
				this.Age = "jeune";
			}
			else if(A.equals("A")) {
				this.Age="Adulte";
			}
			
			else if(A.equals("V")) {
				this.Age="Vieux";
			}
			
			
			else { System.out.println("choix erroné");}
		}while(Age==null);
	}

	public int getForce() {
		return force;
	}

	public void setForce() {
		
		do {
			Scanner inp = new Scanner(System.in);
			System.out.println("donner la force de ce predateur:Max 100 et Min 30");
			int P=0;
			P=inp.nextInt();
			if((P<100)&&(P>30)) {
				this.force=P;
				
			}
			else {
				System.out.println("fausse puissance");
			}
			
		}while(this.force==0);
		
		
		
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	

}