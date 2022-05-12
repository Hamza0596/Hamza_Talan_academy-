

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AnnoucementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AnnoucementController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    this.getServletContext().getRequestDispatcher("/WEB-INF/announcement.jsp").forward(request,response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    this.getServletContext().getRequestDispatcher("/WEB-INF/announcement.jsp").forward(request,response);

	}

}
