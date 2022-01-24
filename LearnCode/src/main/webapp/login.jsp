<%@page import="com.learncode.helper.Message"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<%@include file="component/all-css.jsp"%>
<style type="text/css">
.banner{
clip-path: polygon(50% 0%, 82% 4%, 100% 35%, 100% 70%, 88% 94%, 50% 100%, 12% 94%, 0% 70%, 0% 35%, 13% 6%);
}
</style>
</head>
<body >
	<%@include file="component/navbar.jsp"%>
	<%
	Message failedMsg = (Message) session.getAttribute("failedMsg");
	if (failedMsg != null) {
	%>
	<div class="alert alert-danger" role="alert"><%=failedMsg.getContent()%>
	</div>
	<%
	session.removeAttribute("failedMsg");
	}
	%>
	<div class="container banner" style="background-color: #f6f1f0">
		<div class="row p-4">
			<div class="col-md-4 offset-md-4">
				<div class="card">
				
					<div class="card-header text-center">
						<h3>Login</h3>
					</div>
					<div class="card-body"></div>
					<form action="LoginServlet" method="post">
						<div class="form-group col-md-10">
							<label for="exampleInputEmail1">Email address</label> <input
								type="email" name="email" required class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="Enter email">

						</div>
						<div class="form-group col-md-10">
							<label for="exampleInputPassword1">Password</label> <input
								type="password" name="password" required class="form-control" id="exampleInputPassword1"
								placeholder="Password">
						</div>
						<div class="text-center p-2">
							<button type="submit" class="btn btn-primary">Submit</button>
							<a href="register.jsp" type="submit" class="btn btn-info">Register</a>
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>