

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.thp.project.vintud.entity.impl.Factory;
import com.thp.project.vintud.entity.impl.UserImpl;

/**
 * Servlet implementation class SignInController
 */
public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    this.getServletContext().getRequestDispatcher("/WEB-INF/sigIn.jsp").forward(request,response);

	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     String mail =request.getParameter("mail");
	     String password =request.getParameter("password");

	     Factory factory = new Factory();
	    
	    boolean resultat= factory.getUser().logIn(mail,password);
	     
         request.setAttribute("resultat",resultat );

	    this.getServletContext().getRequestDispatcher("/WEB-INF/sigIn.jsp").forward(request,response);
 
	}

}
