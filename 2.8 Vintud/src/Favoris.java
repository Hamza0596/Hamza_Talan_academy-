
public class Favoris {
private int id;
private int ref_Id_Annonce;
private int ref_Id_user;
private String date_ajout_favoris ;

	public Favoris() {
	}

	public int getRef_Id_Annonce() {
		return ref_Id_Annonce;
	}

	public void setRef_Id_Annonce(int ref_Id_Annonce) {
		this.ref_Id_Annonce = ref_Id_Annonce;
	}

	public int getRef_Id_user() {
		return ref_Id_user;
	}

	public void setRef_Id_user(int ref_Id_user) {
		this.ref_Id_user = ref_Id_user;
	}

	public String getDate_ajout_favoris() {
		return date_ajout_favoris;
	}

	public void setDate_ajout_favoris(String date_ajout_favoris) {
		this.date_ajout_favoris = date_ajout_favoris;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
