package com.wipro.frs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wipro.frs.service.*;
/**
 * Servlet implementation class PassengerLoginServlet
 */
@WebServlet("/PassengerLoginServlet")
public class PassengerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email_id = request.getParameter("email");
		String password = request.getParameter("password");
		ValidationClass vc = new ValidationClass();
		try {
				if(vc.validatePassenger(email_id, password))
				{
					response.sendRedirect("");
				}
				response.sendRedirect("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error @ passenger login servlet");
			
		}
		
	}

}
