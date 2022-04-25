import java.util.ArrayList;
import java.util.List;

public class UserImpl implements User {
     
	private String mail;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String prenom;
	private String  nom;
	private String pseudo;
	private int mot_De_Passe;
	private int num_Tel;
	private String adresse;
	private int id,role_id;
	List<AnnouncementImpl> list_Annoce=new ArrayList<AnnouncementImpl>();
	List<AnnouncementImpl> list_Annoce_Favoris=new ArrayList<AnnouncementImpl>();
	
	public UserImpl() {

	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getMot_De_Passe() {
		return mot_De_Passe;
	}

	public void setMot_De_Passe(int mot_De_Passe) {
		this.mot_De_Passe = mot_De_Passe;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getNum_Tel() {
		return num_Tel;
	}

	public void setNum_Tel(int num_Tel) {
		this.num_Tel = num_Tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<AnnouncementImpl> getList_Annoce() {
		return list_Annoce;
	}

	public void setList_Annoce(List<AnnouncementImpl> list_Annoce) {
		this.list_Annoce = list_Annoce;
	}

	public List<AnnouncementImpl> getList_Annoce_Favoris() {
		return list_Annoce_Favoris;
	}

	public void setList_Annoce_Favoris(List<AnnouncementImpl> list_Annoce_Favoris) {
		this.list_Annoce_Favoris = list_Annoce_Favoris;
	}
	
	
	
	

}
