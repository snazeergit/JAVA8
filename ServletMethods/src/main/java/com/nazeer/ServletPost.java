package com.nazeer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPost
 */
@WebServlet("/ServletPost")
public class ServletPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		writer.println("From doGET");
		myOwnService(request, response);
	}

	protected void doPost(HttpServletRequest requ, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.println("From doPOST");
		myOwnService(requ, resp);
	}

	protected void myOwnService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		writer.println("from myOwnService");
		writer.close();
	}

}
