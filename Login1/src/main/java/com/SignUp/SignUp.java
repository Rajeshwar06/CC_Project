package com.SignUp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SignUp.Dao.SignUpDao;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("Eid");
		String pass = request.getParameter("password");
		String lname = request.getParameter("Lname");
		String fname = request.getParameter("Fname");
		String dob = request.getParameter("date");
		String email = request.getParameter("contact");
		System.out.println("In S1");
		SignUpDao obj = new SignUpDao();
		System.out.println("In S");
		obj.check(username, pass, fname, lname, dob, email);
		response.sendRedirect("Login_S.jsp");
	}

}
