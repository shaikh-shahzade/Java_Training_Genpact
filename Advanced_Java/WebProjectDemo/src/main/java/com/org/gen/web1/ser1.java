package com.org.gen.web1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ser1
 */
@WebServlet("/details")
public class ser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ser1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("uname");
		int age = Integer.parseInt(request.getParameter("uage"));
		int exp = Integer.parseInt(request.getParameter("uex"));
		String skill = request.getParameter("uskill");
		int pro = Integer.parseInt(request.getParameter("upro"));

		if (age > 25 && exp > 4 && pro > 5) {
			pw.println("<h1>" + "User Details" + "</h1>");
			pw.println("Name : " + name + "<br>");
			pw.println("Age : " + age + "<br>");
			pw.println("Exp : " + exp + "<br>");
			pw.println("Skill : " + skill + "<br>");
			pw.println("Projects : " + pro + "<br>");

		} else
			pw.println("<h1>" + "Invalid" + "</h1>");

		pw.close();
	}

}
