import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_write {



	public static void main(String[] args) {
  
		readfunction("C:\\Users\\hbouachir\\Desktop\\Workspace Talan\\2.2\\2.2.5\\src\\Main_write.JAVA");
		readfunction_a_l_envers("C:\\Users\\hbouachir\\Desktop\\Workspace Talan\\2.2\\2.2.5\\src\\Main_write.JAVA");
	

	}
	
	static void readfunction(String path) {
		
		File file =new File(path);
		try {
			Scanner scan=new Scanner(file);
			while (scan.hasNextLine()) {
				
				System.out.println("Lu"+" "+scan.nextLine());
			
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	static void readfunction_a_l_envers(String path) {
		
		File file =new File(path);
		ArrayList<String> str = new ArrayList<String>();

		try {
			Scanner scan=new Scanner(file);
			while (scan.hasNextLine()) {
				
				str.add(scan.nextLine());
			
			}
			
			for(int i=str.size()-1;i>=0;i--) {
				System.out.println("lu"+" "+str.get(i));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	}

		
	


