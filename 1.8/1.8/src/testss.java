
public class testss {

	private int taille_grp;
	private String Zone_geo;
	Prédateur[] Tab=new Prédateur[taille_grp];
	
	
	public testss(int taille_grp, String Zone_geo ) {
	this.taille_grp=taille_grp;
	this.Zone_geo=Zone_geo;
	}
	
	
	public void propres_caract() {
		
		System.out.println("ce groupe contien"+" " +taille_grp+" "+"predateurs"+" "+"qui se trouvent dans la zone "+" "+Zone_geo);
		
	}

	public void ajouter_predateurds(Prédateur obj) {
		
		for(int i=0;i<taille_grp;i++) {
			
			while(Tab[taille_grp]==null) {
				if(Tab[i]!=null)
				Tab[i]=obj;
				break;
				
			}
			
		}
		
		
	}
	
	
	
	
	
	

	public int getTaille_grp() {
		return taille_grp;
	}


	public void setTaille_grp(int taille_grp) {
		this.taille_grp = taille_grp;
	}


	public String getZone_geo() {
		return Zone_geo;
	}


	public void setZone_geo(String zone_geo) {
		Zone_geo = zone_geo;
	}
	

}
