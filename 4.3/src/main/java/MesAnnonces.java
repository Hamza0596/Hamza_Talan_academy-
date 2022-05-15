

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import com.thp.project.vintud.entity.impl.Factory;

public class MesAnnonces extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MesAnnonces() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Factory factory =new Factory();

			HttpSession session = request.getSession();
			int id = (int) session.getAttribute("id");
			String user_Name =factory.getUser().findUserById(id);
		     
		    request.setAttribute("user_Name", user_Name);
			ArrayList l =factory.getAnnonce().showAnnouncementById(id);
			request.setAttribute("listeannonce", l);
		    }catch(Exception e) {}
		     
		
	        this.getServletContext().getRequestDispatcher("/WEB-INF/MesAnnonces.jsp").forward(request,response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Factory factory =new Factory();
		String idannoce=request.getParameter("idannoce");
		int idannonceAsupprimer=Integer.parseInt(idannoce);
		factory.getAnnonce().deleteAnnounce(idannonceAsupprimer);
		
        this.getServletContext().getRequestDispatcher("/WEB-INF/MesAnnonces.jsp").forward(request,response);
	
	}

}
