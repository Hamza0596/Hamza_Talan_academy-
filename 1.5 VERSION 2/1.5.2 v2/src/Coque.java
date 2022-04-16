import java.util.concurrent.atomic.AtomicInteger;

public class Coque {
	private  static final AtomicInteger count = new AtomicInteger(1); 
    public final int ID = count.incrementAndGet();

	private String typecoque;
	private  String formcoque;
	
	public Coque(String typecoque,String formcoque) {
		this.formcoque=formcoque;
		this.formcoque=formcoque;
	}
	
	public Coque() {
		
	}
	
	
	public void affichage_caracteristiques_coque() {
		System.out.println("la coque est de type "+" "+typecoque+"sa forme est "+formcoque);
	}

	public String getTypecoque() {
		return typecoque;
	}

	public void setTypecoque(String typecoque) {
		this.typecoque = typecoque;
	}

	public String getFormcoque() {
		return formcoque;
	}

	public void setFormcoque(String formcoque) {
		this.formcoque = formcoque;
	}
	
	public String toString(){
		return "la coque n"+ this.ID+" ,";
	}


	
}
