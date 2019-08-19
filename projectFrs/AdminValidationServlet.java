package com.wipro.frs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wipro.frs.service.*;
/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			String name= request.getParameter("name");
			String password= request.getParameter("password");
			ValidationClass vc= new ValidationClass();
			if(vc.validateAdmin(name, password))
			{
				response.sendRedirect("");
			}
			else
			{
				response.sendRedirect("");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Mistake @ AdminControllerServlet");
			
		}
	}

}
