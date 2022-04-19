import java.io.*;

public class ExceptionPropagation1 {
    public static void main(String[] args) throws Exception  {
    	
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert a number:");
        int c = Integer.parseInt(br.readLine());
        
        
        try {
        first(c);
        }
        
        catch(Exception f) {
        	System.out.println(f.getMessage());
        }
    	
    	
    }

        private static void first(int a) {
            try {
        	second(a);
            }
            catch(Exception f) {
                System.out.println(f.getMessage());
            }
        }
        
        

        private static void second(int b)throws Exception {

            if (b < 10) {
            	
            	throw new Exception  ("le nombre est hors plage "); 
            }
            	
            System.out.println("OK");
            }
        }



