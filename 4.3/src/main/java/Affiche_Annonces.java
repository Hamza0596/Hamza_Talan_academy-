
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.thp.project.vintud.entity.impl.AnnouncementImpl;
import com.thp.project.vintud.entity.impl.Factory;
import com.thp.project.vintud.entity.impl.Favoris;


public class Affiche_Annonces extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Affiche_Annonces() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
		     HttpSession session = request.getSession();
		     int idSession = (int) session.getAttribute("id");
		     
		     Factory factory = new Factory();
		     String user_Name =factory.getUser().findUserById(idSession);
		     request.setAttribute("user_Name", user_Name);

	      }catch(Exception e){}
		
		/*Send announcement list*/
		Factory factory =new Factory();
		ArrayList l =factory.getAnnonce().showAllAnnouncement();
		request.setAttribute("listeannonce", l);
		
		/*Send favoured or no*/

	    /*String idA = request.getParameter("idAnnonce");
	    int idAnnoncee=Integer.parseInt(idA);*/
	    boolean favourdOrNo= factory.Get_Favoris_Dao().favouredOrNo(2);
	    request.setAttribute("favourdOrNo", favourdOrNo);
		
	    this.getServletContext().getRequestDispatcher("/WEB-INF/AffichageAnnonce.jsp").forward(request,response);
	}
 
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Factory factory =new Factory();

	    HttpSession session = request.getSession();
	    int idSession = (int) session.getAttribute("id");
        LocalDate todaysDate = LocalDate.now();
        
        
	    String idA =  request.getParameter("idAnnonce");
	    int idAnnoncee=Integer.parseInt(idA); 
	    
		Favoris fav =new Favoris(idAnnoncee,idSession,Date.valueOf(todaysDate));
		boolean resultatAjoutFav=factory.Get_Favoris_Dao().createFavoris(fav);
		request.setAttribute("resultatAjoutFav", resultatAjoutFav);
		
	    this.getServletContext().getRequestDispatcher("/WEB-INF/AffichageAnnonce.jsp").forward(request,response);
	}

}
