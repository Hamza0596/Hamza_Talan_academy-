
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.thp.project.vintud.entity.impl.Factory;
import com.thp.project.vintud.entity.impl.UserImpl;


public class signUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public signUp() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    this.getServletContext().getRequestDispatcher("/WEB-INF/signUp.jsp").forward(request,response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		
		 String firstname =request.getParameter("first name");
	     String lastname =request.getParameter("last name");
		 String pseudo =request.getParameter("pseudo");
	     String mail =request.getParameter("mail");
	     String password =request.getParameter("password");
	     String phone =request.getParameter("phone");

	     Factory factory = new Factory();
	     UserImpl u = new UserImpl( mail , lastname ,firstname, pseudo,password,phone,"Bk",1) ;
	     boolean resultat= factory.getUser().creatUserAcount(u);
         request.setAttribute("resultat",resultat );
         
         


	     this.getServletContext().getRequestDispatcher("/WEB-INF/signUp.jsp").forward(request,response);

	}

}
