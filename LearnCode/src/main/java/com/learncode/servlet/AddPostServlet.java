package com.learncode.servlet;

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.mozilla.javascript.v8dtoa.DoubleHelper;

import com.learncode.dao.PostDao;
import com.learncode.entities.Post;
import com.learncode.entities.User;
import com.learncode.helper.DBConnection;
import com.learncode.helper.Helper;

@MultipartConfig
@WebServlet("/AddPostServlet")
public class AddPostServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cid = Integer.parseInt(req.getParameter("cid"));
		String pContent = req.getParameter("pContent");
		String pCode = req.getParameter("pCode");
		Part part =req.getPart("pic");
		String pTitle = req.getParameter("pTitle");
		
		HttpSession session = req.getSession();
		User user  = (User)session.getAttribute("currentUser");
		
//		System.out.println("your title: " + pTitle);
//		System.out.println(part.getSubmittedFileName());
		
		Post p = new Post(pTitle, pContent, pCode, part.getSubmittedFileName(), cid, user.getId());
		PostDao dao = new PostDao(DBConnection.getConn());
		if(dao.savePost(p)) {
			
			String path = req.getRealPath("/")+ "blog_pics" +File.separator + part.getSubmittedFileName();
			Helper.saveFile(part.getInputStream(), path); 
			out.println("done");
		}else {
			out.println("error");
		}
		 
	}

	
}
