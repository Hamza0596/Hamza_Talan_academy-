

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
	    this.getServletContext().getRequestDispatcher("/WEB-INF/Depot.jsp").forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String mail =request.getParameter("mail");
	     String password =request.getParameter("password");

	     Factory factory = new Factory();
	     
	    AnnouncementImpl An = new AnnouncementImpl("vettement fille","jupe jupe",1,12.7,"photo",Date.valueOf("2020-12-05"),true,1,"hamamet",1);


	   factory.getAnnonce().createAnnounce(null);;
	     

		
	    this.getServletContext().getRequestDispatcher("/WEB-INF/Depot.jsp").forward(request,response);
	}

}
