package gui;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLogin extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    public CheckLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// not used in example
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean result = false;
		String un = "admin";
		String pw = "admin";
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals(un) && password.equals(pw)) {
			result = true;
		}
		
		if(result == true) {
			response.sendRedirect("success.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}
	}
}