public abstract class Group_Prédateur {
	
	private int taille_grp;
	private String Zone_geo;

	public Group_Prédateur(int taille_grp, String Zone_geo) {
		this.taille_grp=taille_grp;
		this.Zone_geo=Zone_geo;
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
