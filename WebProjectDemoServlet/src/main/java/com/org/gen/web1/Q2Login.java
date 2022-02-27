package com.org.gen.web1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q2Login
 */
@WebServlet("/Q2Login")
public class Q2Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Q2Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			int userid = Integer.parseInt(request.getParameter("id"));
			String pass = request.getParameter("pass");

			pw.println("<style type=\"text/css\">\r\n" + ".body{\r\n" + "	margin-top:150px; \r\n"
					+ "	margin-left:40%;\r\n" + "	font-size: xx-large;\r\n" + "	line-height: 20px;\r\n"
					+ "	align-content: center;\r\n" + "}\r\n" + "\r\n" + "</style>");

			pw.println("<div class=\"body\">");

			if (age >= 18 && pass.length() >= 8) {
				pw.println("Great! YOU CAN REGISTER");
				pw.println("<h1>" + "Welcome" + "</hr>");
				pw.println(name);

			} else {
				pw.println(
						"SORRY!! age must be  greater than 18 and password must be atleast\r\n" + "8 characters long ");
			}

			pw.println("</div>");

			pw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
