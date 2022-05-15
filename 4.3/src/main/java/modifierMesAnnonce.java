

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import com.thp.project.vintud.entity.impl.AnnouncementImpl;
import com.thp.project.vintud.entity.impl.Factory;


public class modifierMesAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public modifierMesAnnonce() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Factory factory =new Factory();

			HttpSession session = request.getSession();
			int id = (int) session.getAttribute("id");
			String user_Name =factory.getUser().findUserById(id);
		    request.setAttribute("user_Name", user_Name);
		    
		    
		    
		    }catch(Exception e) {}	
		

	
    this.getServletContext().getRequestDispatcher("/WEB-INF/modifierMesAnnonce.jsp").forward(request,response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		 String newTitle =request.getParameter("title");
	     String newDescription =request.getParameter("description");
	     String newCategory =request.getParameter("category");
	     int categoryy=Integer.parseInt(newCategory);  
	     String price =request.getParameter("price");
	     double Newprice=Double.parseDouble(price);  
	     String NewLocalisation =request.getParameter("localisation");
	     int idAnnonce=Integer.parseInt(request.getParameter("idannoce"));
	     Factory factory = new Factory();
	
		
		
		
    this.getServletContext().getRequestDispatcher("/WEB-INF/modifierMesAnnonce.jsp").forward(request,response);

	}

}
