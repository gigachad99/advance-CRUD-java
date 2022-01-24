<%@page import="com.learncode.helper.DBConnection"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/all-css.jsp"%>
<style>
.banner-background {
	clip-path: polygon(50% 0%, 100% 0, 100% 95%, 80% 99%, 57% 96%, 39% 98%, 20% 93%, 0
		100%, 0 0);
}
</style>
</head>
<body style="background-color: #f6f1f0">
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
	<div class="container-fluid p-0 m-0">
		<div class="jumbotron bg-dark text-white banner-background">
			<div class="container ">
				<h3 class="display-3">Welcome to ABC Learn Code</h3>
				<p>Nam scelerisque posuere molestie. Praesent pellentesque
					faucibus aliquet. Sed euismod lacinia lacus, in aliquam ex luctus
					mollis. Vestibulum tincidunt, massa id tristique pulvinar, lacus
					neque dapibus libero, nec aliquet turpis ex a libero. Nunc auctor,
					nibh non semper dignissim, diam lacus tempus tortor, vitae dapibus
					ipsum libero at eros.</p>

				<button type="button" class="btn btn-outline-primary">Let's
					start! It's free</button>
				<a href="login.jsp" type="button" class="btn btn-outline-primary">Log
					in</a>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row mb-3">
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Core</h5>
						<p class="card-text">Aliquam viverra, mauris imperdiet sodales
							aliquet, nisi massa tempus dui, eu viverra libero nunc id risus.
							Donec tellus elit, rhoncus aliquam sapien ut, cursus rutrum
							lorem. Suspendisse eget varius nulla. Sed mattis lorem est, sed
							mollis metus consequat sed. Vestibulum erat enim, placerat quis
							libero a, sollicitudin elementum augue.</p>
						<a href="#" class="btn btn-outline-primary">Read More</a>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Core</h5>
						<p class="card-text">Cras tempor non tellus eu vehicula.
							Suspendisse potenti. Maecenas sagittis nulla id quam faucibus, et
							vehicula metus luctus. Donec a finibus tellus, nec commodo eros.
							Fusce id pharetra mauris, eget hendrerit urna. Donec mattis sed
							orci vel laoreet. Nullam et erat ut velit rhoncus mattis non sed
							erat.</p>
						<a href="#" class="btn btn-outline-primary">Read More</a>
					</div>
				</div>
			</div>

		</div>

		<div class="row mb-3">
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Core</h5>
						<p class="card-text">Aliquam viverra, mauris imperdiet sodales
							aliquet, nisi massa tempus dui, eu viverra libero nunc id risus.
							Donec tellus elit, rhoncus aliquam sapien ut, cursus rutrum
							lorem. Suspendisse eget varius nulla. Sed mattis lorem est, sed
							mollis metus consequat sed. Vestibulum erat enim, placerat quis
							libero a, sollicitudin elementum augue.</p>
						<a href="#" class="btn btn-outline-primary">Read More</a>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Core</h5>
						<p class="card-text">Etiam hendrerit neque at tempor
							ultricies. Fusce nec lorem lectus. Nullam nec neque scelerisque,
							venenatis lectus at, ultrices arcu. Pellentesque quis tempor
							ante, non gravida lacus. Nam ut elit vel velit vehicula varius.
							Sed fringilla ornare elit. Donec in purus sem.</p>
						<a href="#" class="btn btn-outline-primary">Read More</a>
					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>