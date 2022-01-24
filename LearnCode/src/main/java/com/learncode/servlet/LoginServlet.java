package com.learncode.servlet;

import java.io.IOException;
import java.net.ResponseCache;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learncode.dao.UserDao;
import com.learncode.entities.User;
import com.learncode.helper.DBConnection;
import com.learncode.helper.Message;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userEmail = req.getParameter("email");
		String userPassword = req.getParameter("password");
		
		UserDao dao = new UserDao(DBConnection.getConn());
		User u=dao.getUserByEmailAndPassword(userEmail, userPassword);
		
		if(u==null) {
			HttpSession session = req.getSession();
			Message msg = new Message("Invalid Details !!! Try Again","error","alert-danger");
			session.setAttribute("failedMsg", msg);
			resp.sendRedirect("login.jsp");
			
			
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("currentUser", u);
			resp.sendRedirect("profile.jsp");
		}
	}

}
