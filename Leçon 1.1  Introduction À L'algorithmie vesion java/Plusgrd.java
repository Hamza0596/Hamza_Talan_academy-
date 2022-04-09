import java.util.Scanner;

public class Plusgrd {

	public static void main(String[] args) {
		int plgrnb=0;
		int nb,i;
		
		for(i=1;i<=20;i++) {
			
			Scanner input = new Scanner(System.in);  
    		System.out.println("entrer le nombre num"+i);
    		nb = input.nextInt();
    		if (nb>plgrnb) {
    			plgrnb=nb;
    		}
    		
		}
		System.out.println("le plus grnd nbr est "+plgrnb);

	}

}
