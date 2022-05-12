

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Date;

import com.thp.project.vintud.entity.impl.AnnouncementImpl;
import com.thp.project.vintud.entity.impl.Factory;


public class DepotAnnonces extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DepotAnnonces() {
        super();
    }

    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			  HttpSession session = request.getSession();
			     int id = (int) session.getAttribute("id");
		}
		catch(Exception e){
			
		}
	   
		
	    this.getServletContext().getRequestDispatcher("/WEB-INF/Depot.jsp").forward(request,response);
	    
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 String title =request.getParameter("title");
	     String description =request.getParameter("description");
	     String category =request.getParameter("category");
	     int categoryy=Integer.parseInt(category);  
	     String price =request.getParameter("price");
	     double priced=Double.parseDouble(price);  
	     String localisation =request.getParameter("localisation");
	     Factory factory = new Factory();
	     AnnouncementImpl An = new AnnouncementImpl(title,description,categoryy,priced,"photo",Date.valueOf("2020-12-05"),true,1,localisation,1);
	     boolean resultat=factory.getAnnonce().createAnnounce(An);
	     request.setAttribute("resultat", resultat);
	     
	     
	     
	     

	     this.getServletContext().getRequestDispatcher("/WEB-INF/Depot.jsp").forward(request,response);
	     

	}

}
