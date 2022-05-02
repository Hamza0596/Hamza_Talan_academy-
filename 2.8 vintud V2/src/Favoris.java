import java.sql.Date;

;

public class Favoris {
	private int id;
	private int annonceFavId;
	private int userId;
	private Date dateAjout;

	public Favoris(int id,int annonceFavId,int userId,Date dateAjout) {
		this.id=id;
		this.annonceFavId=annonceFavId;
	    this.userId=userId;
	    this.dateAjout=dateAjout;
	}

	public Favoris(int annonceFavId,int userId,Date dateAjout) {
		this.annonceFavId=annonceFavId;
	    this.userId=userId;
	    this.dateAjout=dateAjout;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnnonceFavId() {
		return annonceFavId;
	}

	public void setAnnonceFavId(int annonceFavId) {
		this.annonceFavId = annonceFavId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	
	
}
