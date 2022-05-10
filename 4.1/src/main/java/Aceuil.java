

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Aceuil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Aceuil() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message="welcome dans hello";
		request.setAttribute("variable", message);
	    this.getServletContext().getRequestDispatcher("/WEB-INF/aceuil.jsp").forward(request,response);	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
