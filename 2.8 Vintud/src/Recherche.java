
public class Recherche {

	public Recherche() {
	}
	
	private int id ;
	private String type_Habits;
	private String taille ;
	private String  couleur;
	private double max_Prix ;
	private double min_Prix ;
    private int ref_User_Id;
    
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType_Habits() {
		return type_Habits;
	}
	public String getTaille() {
		return taille;
	}
	public String getCouleur() {
		return couleur;
	}
	public double getMax_Prix() {
		return max_Prix;
	}
	public double getMin_Prix() {
		return min_Prix;
	}
	public int getRef_User_Id() {
		return ref_User_Id;
	}
	public void setType_Habits(String type_Habits) {
		this.type_Habits = type_Habits;
		
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public void setMax_Prix(double max_Prix) {
		this.max_Prix = max_Prix;
	}
	public void setMin_Prix(double min_Prix) {
		this.min_Prix = min_Prix;
	}
	public void setRef_User_Id(int ref_User_Id) {
		this.ref_User_Id = ref_User_Id;
	}
    

    
    
    
}
