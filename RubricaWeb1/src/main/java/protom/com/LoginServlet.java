package protom.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
  
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/*	User user = new User()
				.setPassword(request.getParameter("password"))
				.setUsername(request.getParameter("username")); */
		
    	final String username = "Anna";
	    final String password = "anna";
		
		String paramUsername = request.getParameter("username");
		String paramPassword = request.getParameter("password");

		if(username.equals(paramUsername) && password.equals(paramPassword)) {
			//se l'autenticazione va a buon fine
			
			HttpSession oldSession = request.getSession(false);
			if(oldSession != null) {
				oldSession.invalidate();
			}
			
			HttpSession currentSession = request.getSession();
			currentSession.setAttribute("username", paramUsername);
			
			response.sendRedirect("success.jsp");
			
		}
		else {
			response.sendRedirect("login.jsp");
			
		}
    
    
    
    }
	
	
	
	/*
		
		if( user.getUsername() != null && user.getUsername().equals("annamaria") ) {
			HttpSession session = request.getSession();
			session.setAttribute("USER", user);
		}
		
		String action = request.getParameter("action");
		if(action != null && action.equals("logout") ) {
			HttpSession session = request.getSession();
			session.invalidate();
		} 
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

