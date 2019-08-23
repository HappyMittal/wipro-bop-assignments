package com.wipro.frs.controller;

import java.io.IOException;
import java.util.ArrayList;
import com.wipro.frs.bean.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println(request.getParameter("flightId"));
		HttpSession session=request.getSession();
		System.out.println(session.getAttribute("bookings"));
		System.out.println(request.getParameter("color"));
		System.out.println("Pass_id: "+session.getAttribute("pass_id"));
		
	}

}
