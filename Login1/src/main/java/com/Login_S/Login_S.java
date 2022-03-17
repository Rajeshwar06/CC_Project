package com.Login_S;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Display.Dao.DisplayDao;
import com.Login_S.Dao.Login_SDao;
import com.login.dao.LoginDao;

/**
 * Servlet implementation class Login_S
 */
@WebServlet("/Login_S")
public class Login_S extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Eid = request.getParameter("Eid");
		String pass = request.getParameter("password");
		ArrayList<String> dis = new ArrayList<>();
		Login_SDao Dao = new Login_SDao();
		DisplayDao Ddao = new DisplayDao();
		System.out.println("Heloo");
		if(Dao.check(Eid, pass)) {
			dis = Ddao.Check(Eid, pass);
			for(String s : dis) {
			System.out.println(dis);
			}
			HttpSession session = request.getSession();
			session.setAttribute("username", Eid);
			request.setAttribute("Display",dis);
			RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
			rd.forward(request, response);
			
			
			
		}
		else {
			response.sendRedirect("Login_S.jsp");
		}

	}

}
