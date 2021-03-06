
<%@page import="com.learncode.entities.Post"%>
<%@page import="java.util.List"%>
<%@page import="com.learncode.helper.DBConnection"%>
<%@page import="com.learncode.dao.PostDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loading...</title>
<%@include file="component/all-css.jsp"%>
</head>
<body>
	<%
	Thread.sleep(100);
	PostDao d = new PostDao(DBConnection.getConn());
	int cid = Integer.parseInt(request.getParameter("cid"));
	List<Post> posts = null;
	if(cid==0){
		posts = d.getAllPosts();
	}else{
		posts = d.getPostByCatId(cid);
	}
	if(posts.size()==0){
		out.println("<h5 class='display-2 textcenter'>No post in this category !!!</h5>");
		return;
	}
	
	for (Post p : posts) {
	%>
	<div class="col-md-8 mt-2">
		<div class="card">
			<img class="card-img-top" alt="Card image cap" src="blog_pics/<%=p.getpPic()%>">
			
			<div class="card-body">
				<b><%=p.getpTitle()%></b>
				<p><%=p.getpContent()%>
				
			</div>
			<div class="card-footer text-center">
			<a href="show_blog_page.jsp?post_id=<%=p.getPid() %>" class="btn btn-outline-primary btn-sm">Read more</a>
			<a href="#!" class="btn btn-outline-primary btn-sm"><i class="fa fa-thumbs-o-up"></i> <span>10</span></a>
			<a href="#!" class="btn btn-outline-primary btn-sm"><i class="fa fa-commenting-o"></i> <span>5</span></a>
			</div>
		</div>


	</div>
	<%
	}
	%>
</body>
</html>