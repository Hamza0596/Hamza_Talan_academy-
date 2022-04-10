import java.util.Scanner;

public class Contient_recursiv {
  public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
  System.out.print("entrer un nombre");
  int[] tab={6,20,12,100,8};
  int x = input.nextInt();
   
       int i=0;
       if (conti(tab,x,i)){
       System.out.println("le nombre est trouvé");
       }
       else { 
        System.out.println("le nombre non trouvé");
       }
       }



       private static boolean conti(int[] Tab,int n,int i){
       
      
       boolean a = false;
       if (Tab[i]==n){
       a = true;
       
       }
       else if (a==false && i <Tab.length-1){
       return conti(Tab,n,i+1);
       }
       return(a);

       }
  
}
