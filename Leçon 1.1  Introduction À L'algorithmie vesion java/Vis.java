import java.util.Scanner;
import java.util.Random;

public class Vis {

	public static void main(String[] args) {
		
		int i=0;
		
		Random random = new Random();
		int nb;
		nb = random.nextInt(4);
		
		
		
		boolean test= false;
		
        while(test==false && i<=5) {
        	Scanner input = new Scanner(System.in);  
    		System.out.print("entrer une position");
    		int position = input.nextInt();
        	
        	if (position < nb) {
        		System.out.println("kabbar");
				test=false;
        	}
        	if (position > nb) {
        		System.out.println("sagghar");
				test=false;
        	}
        	if (position == nb) {
        		System.out.println("ok");
				test=true;
        	}
        	if (i==5) {
        		System.out.println("5sart");
				test=true;
        	}
        	
        	
        	i++;
        	
        	
        }
	}

}
