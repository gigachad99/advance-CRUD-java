<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<%@include file="component/all-css.jsp"%>
<style type="text/css">
.banner {
	clip-path: polygon(50% 0%, 82% 4%, 100% 35%, 100% 70%, 88% 94%, 50% 100%, 12% 94%,
		0% 70%, 0% 35%, 13% 6%);
}
</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>
	<%
	String sucMsg = (String) session.getAttribute("sucMsg");
	if (sucMsg != null) {
	%>
	<div class="alert alert-success" role="alert"><%=sucMsg%>
	</div>
	<%
	session.removeAttribute("sucMsg");
	}
	%>

	<%
	String failedMsg = (String) session.getAttribute("failedMsg");
	if (failedMsg != null) {
	%>
	<div class="alert alert-danger" role="alert"><%=failedMsg%>
	</div>
	<%
	session.removeAttribute("failedMsg");
	}
	%>
	<div class="container banner" style="background-color: #f6f1f0">
		<div class="row p-4">
			<div class="col-md-6 offset-md-3">
				<div class="card ">
					
					<div class="card-header text-center">
						<h3>Register</h3>
					</div>
					<div class="card-body"></div>
					<form action="RegisterServlet" method="post">
						<div class="form-group col-md-10">
							<label for=UserName">Username</label> <input name="username"
								type="text" class="form-control" id="username"
								aria-describedby="emailHelp" placeholder="Username">

						</div>
						<div class="form-group col-md-10">
							<label for=InputEmail1">Email address</label> <input name="email"
								type="email" class="form-control" id="email1"
								aria-describedby="emailHelp" placeholder="Enter email">

						</div>
						<div class="form-group col-md-10">
							<label for="InputPassword1">Password</label> <input
								name="password" type="password" class="form-control"
								id="password" placeholder="Password">
						</div>
						<div class="form-group col-md-10">
							<label for="ReInputPassword1">Do it again</label> <input
								name="repassword" type="password" class="form-control"
								id="exampleInputPassword1" placeholder="Password">
						</div>
						<div class="form-group form-check m-4">
							<input name="check" type="checkbox" class="form-check-input"
								id="exampleCheck1"> <label class="form-check-label"
								for="exampleCheck1">I argee every thing</label>
						</div>
						<div class="text-center p-2">
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>