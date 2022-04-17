public class Epees {

	public static void main(String[] args) {
		String[] Tab= {"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
	    String x;
	    int taille =Tab.length;
	    int i;
	    
	    
	    for( i=0;i<Tab.length-1;i++) {
	    	for(int j =taille-1; j >i; j--) {
	    		int ind=0;
	    		while(ind<Math.min(Tab[j-1].length(),Tab[j].length())) {
	    			if (Tab[j].charAt(ind)<Tab[j-1].charAt(ind)){
	    				x=Tab[j];
	    				Tab[j]=Tab[j-1];
	    				Tab[j-1]=x;
	    				ind=Math.min(Tab[j-1].length(),Tab[j].length());
	    				}

	    				else if(Tab[j].charAt(ind)>Tab[j-1].charAt(ind)){
	    				ind=Math.min(Tab[j-1].length(),Tab[j].length());
	    				}

	    				else {
	    				ind++;
	    				}
	    		}
}
}
	    		for(i=0; i < taille; i++) {
            		System.out.println(Tab[i]);
            	}
	    	
	    
	}

}