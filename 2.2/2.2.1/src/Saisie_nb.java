import java.util.Scanner;

public class Saisie_nb {

	public Saisie_nb() {
	}
	
	
	
	public void entrernbr()  throws Exception  {
		
		Scanner S=new Scanner(System.in);
		System.out.println("Entrer un nombre compris entre 10 et 30");
		int  nb=S.nextInt();
		
		if ((nb>30)||(nb<10)) {
            throw new Exception  ("le nombre est hors plage ");    

		}
		 
		
	}

}
