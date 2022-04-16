
public class Roman extends Livre {
	
	private int nbrchapitres;
	private String resule;

	public Roman(String titre, String auteur, double prix, String nb_pages) {
		super(titre, auteur, prix, nb_pages);
		// TODO Auto-generated constructor stub
		this.nbrchapitres=nbrchapitres;
	}

	public Roman() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void afficher_prop_livre() {
		System.out.println("ce livre s'appele"+this.getTitre()+" "+"ecrit par"+" "+this.getNb_pages()+" "+"son priix est"+" "+this.getPrix()+" "+"dinar"+" et il contient "+" "+this.getNb_pages()+" "+"pages"+""+"le nombre de chapitres est "+""+nbrchapitres+" "+"le resumé est"+" "+resule);
	}


	public int getNbrchapitres() {
		return nbrchapitres;
	}

	public void setNbrchapitres(int nbrchapitres) {
		this.nbrchapitres = nbrchapitres;
	}

	public String getResule() {
		return resule;
	}

	public void setResule(String resule) {
		this.resule = resule;
	}
	
	
	
	

}
