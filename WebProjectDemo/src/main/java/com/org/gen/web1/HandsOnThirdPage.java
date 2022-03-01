package com.org.gen.web1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandsOn3rdPage
 */
@WebServlet("/HandsOnThirdPage")
public class HandsOnThirdPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String uname = request.getParameter("uname");

		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String id = "";
			Cookie cookie[] = request.getCookies();

			for (Cookie c : cookie) {
				if (c.getName().equals("uid"))
					id = c.getValue();
			}

			// creating submit button
			out.println("<style type=\"text/css\">\r\n" + ".body{\r\n" + "	margin-top:150px; \r\n"
					+ "	margin-left:40%;\r\n" + "	font-size: xx-large;\r\n" + "	line-height: 40px;\r\n"
					+ "	align-content: center;\r\n" + "}\r\n" + "\r\n" + "</style>");

			out.print("<div class=\"body\">\r\n" + "<h1>Hello </h1>\r\n" + "Name: " + uname + "<br>\n" + "Id: " + id
					+ "\n"
					+ "<br><img src=\"https://cdn.iconscout.com/icon/free/png-256/smile-2689437-2232238.png\">\r\n"
					+ " </div>");

			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
