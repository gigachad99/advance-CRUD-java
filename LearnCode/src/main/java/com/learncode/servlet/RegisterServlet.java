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

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		boolean check = req.getParameter("check") != null;
		HttpSession session = req.getSession();
		if (check == false) {
			session.setAttribute("failedMsg", "Unchecked");
			resp.sendRedirect("register.jsp");
		} else {
			String name = req.getParameter("username");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String repassword = req.getParameter("repassword");
			boolean f1 = password.equals(repassword);
			if (f1) {
				User user = new User(name, email, password);
				UserDao dao = new UserDao(DBConnection.getConn());
				boolean f3 = dao.checkEmail(email);
				if (f3) {
					session.setAttribute("failedMsg", "Email has been used");
					resp.sendRedirect("register.jsp");
				} else {
					boolean f2 = dao.saveUser(user);
					if (f2) {
						session.setAttribute("sucMsg", "Registeration Sucessfully");
						resp.sendRedirect("index.jsp");
					} else {
						session.setAttribute("failedMsg", "Registeration Unsucessfully");
						resp.sendRedirect("register.jsp");
					}
				}

			} else {
				session.setAttribute("failedMsg", "Password were not the same");
				resp.sendRedirect("register.jsp");
			}

		}
	}

}
