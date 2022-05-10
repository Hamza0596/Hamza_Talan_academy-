

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Test() {
        super();
        
        
    }
    
    

    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Auteur A= new Auteur("hamza","BOUACHIR",true);
	request.setAttribute("auteur",A);
  
    this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request,response);
	        
	}
 
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	

}
