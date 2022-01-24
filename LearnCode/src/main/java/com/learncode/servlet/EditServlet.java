package com.learncode.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learncode.dao.UserDao;
import com.learncode.entities.User;
import com.learncode.helper.DBConnection;
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userEmail=req.getParameter("email");
		String userName = req.getParameter("username");
		String newPassword =req.getParameter("password");

		
		HttpSession session = req.getSession();
		User user = new User();
		user=(User)session.getAttribute("currentUser");
		user.setEmail(userEmail);
		user.setName(userName);
		user.setPassword(newPassword);
		
		
		//update database
		UserDao dao = new UserDao(DBConnection.getConn());
			boolean ans=dao.updateUser(user);
			if(ans==true) {
				System.out.println("ok");
			}else {
				System.out.println("fail");
			}
		
		
	}
	
}
