<%@page import="com.learncode.entities.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.learncode.dao.PostDao"%>
<%@page import="com.learncode.helper.DBConnection"%>
<%@page import="com.learncode.entities.User"%>
<%
User user = (User) session.getAttribute("currentUser");
if (user == null) {
	response.sendRedirect("login.jsp");
}
%>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
<%@include file="component/all-css.jsp"%>
</head>
<body>
	<!-- navbar -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
		<a class="navbar-brand" href="index.jsp"><span
			class="fas fa-dice-d20"></span> ABC</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item "><a class="nav-link" href="#">Learn
						Code with ABC <span class="sr-only">(current)</span>
				</a></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Categories </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Programming Language</a> <a
							class="dropdown-item" href="#">Data structure</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Something else here</a>
					</div></li>
				<li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
				<li class="nav-item"><a class="nav-link" href="#"
					data-toggle="modal" data-target="#add-post-modal">Do Post</a></li>

			</ul>
			<ul class="navbar-nav mr-right">
				<li class="nav-item "><a class="nav-link" href="#!"
					data-toggle="modal" data-target="#profile-modal"> <span></span>Hi,
						<%=user.getName()%>
				</a></li>
				<li class="nav-item "><a class="nav-link" href="LogoutServlet">
						<span></span>Logout
				</a></li>
			</ul>
		</div>
	</nav>
	<!-- end of navbar -->


	<!-- main body -->
	<main>

		<div class="container">
			<div class="row mt-3">
				<!-- first col -->
				<div class="col-md-4">
					<div class="list-group">
						<a href="#" onclick="getPosts(0, this)" class="c-link list-group-item list-group-item-action active">
							All post </a>
						<%
						PostDao d = new PostDao(DBConnection.getConn());
						ArrayList<Category> listPost = d.getAllCategories();
						for (Category cc : listPost) {
						%>
						<a href="#" onclick="getPosts(<%=cc.getCid() %>,this)" class="c-link list-group-item list-group-item-action"><%=cc.getName()%></a>
						<%
						}
						%>


					</div>
				</div>
				<div class="col-md-8" id="post-container">
					<div class="container text-center" id="loader">
						<i class="fa fa-refresh fa-4x fa-spin"></i>
						<h3 class="mt-2">Loading...</h3>
					</div>

				</div>
				<div class="container-fluid" id="post-container"></div>
			</div>
		</div>
	</main>



	<!-- end main body -->




	<!-- --profile modal--- -->

	<!-- Modal -->
	<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header ">
					<h5 class="modal-title " id="exampleModalLabel">ABC</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container text-center">
						<h5 class="modal-title mt-3" id="exampleModalLabel"><%=user.getName()%></h5>
						<!-- -detail- -->
						<div id="profile-details">
							<table class="table">
								<thead class="thead-light">
									<tr>
										<th scope="col">ID</th>
										<th scope="col">Name</th>
										<th scope="col">Email</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<th scope="row"><%=user.getId()%></th>
										<td><%=user.getName()%></td>
										<td><%=user.getEmail()%></td>

									</tr>

								</tbody>
							</table>
						</div>
						<!-- -profile edit- -->
						<div id="profile-edit" style="display: none;">
							<h3 class="mt-3">Please Edit Carefully</h3>
							<form action="EditServlet" method="post">
								<table class="table">
									<tr>
										<td>ID:</td>
										<td><%=user.getId()%></td>
									</tr>
									<tr>
										<td>Email:</td>
										<td><input type="email" class="form-control" name="email"
											value="<%=user.getEmail()%>"></td>
									</tr>
									<tr>
										<td>Name:</td>
										<td><input type="text" class="form-control"
											name="username" value="<%=user.getName()%>"></td>
									</tr>

									<tr>
										<td>New Password:</td>
										<td><input type="password" class="form-control"
											name="password" value="<%=user.getPassword()%>"></td>
									</tr>
								</table>
								<div class="container">
									<button type="submit" class="btn btn-primary">Save</button>
								</div>

							</form>
						</div>
					</div>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button id="edit-profile-button" type="button"
						class="btn btn-primary">Edit</button>
				</div>
			</div>
		</div>
	</div>
	<!-- --end of profile modal--- -->

	<!-- -add post modal- -->

	<!-- Modal -->
	<div class="modal fade" id="add-post-modal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">Provide the
						post details...</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="add-post-form" action="AddPostServlet" method="post">
						<div class="form-group">
							<select class="form-control" name="cid">
								<option selected disabled="disabled">Select Category</option>
								<%
								PostDao postd = new PostDao(DBConnection.getConn());
								ArrayList<Category> list = postd.getAllCategories();
								for (Category c : list) {
								%>
								<option value="<%=c.getCid()%>"><%=c.getName()%></option>
								<%
								}
								%>
							</select>
						</div>
						<div class="form-group">
							<input name="pTitle" type="text" placeholder="Enter post title"
								class="form-control" />
						</div>
						<div class="form-group">
							<textarea name="pContent" class="form-control"
								style="height: 180px;" placeholder="Enter your content"></textarea>
						</div>
						<div class="form-group">
							<textarea name="pCode" class="form-control"
								style="height: 180px;" placeholder="Enter your program (if any)"></textarea>
						</div>
						<div class="form-group">
							<label>Select your picture: </label> <br> <input name="pic"
								type="file" />
						</div>
						<div class="container text-center">

							<button type="submit" class="btn btn-primary">Post</button>

						</div>
					</form>



				</div>

			</div>
		</div>
	</div>

	<!-- -end add post modal- -->
	<!-- -JS- -->
	<script type="text/javascript">
		$(document).ready(function() {
			let editStatus = false;
			$('#edit-profile-button').click(function() {
				if (editStatus == false) {
					$("#profile-details").hide();
					$("#profile-edit").show();
					editStatus = true;
					$(this).text("Back");
				} else {
					$("#profile-details").show();
					$("#profile-edit").hide();
					editStatus = false;
					$(this).text("Edit");
				}

			})
		});
	</script>
	<!-- now add post js -->
	<script>
		$(document)
				.ready(
						function(e) {
							//

							$("#add-post-form")
									.on(
											"submit",
											function(event) {
												//this code get call when form ssubmited
												event.preventDefault();
												console.log("cliccked")
												let form = new FormData(this);

												$
														.ajax({
															url : "AddPostServlet",
															type : 'POST',
															data : form,
															success : function(
																	data,
																	textStatus,
																	jqXHR) {
																console
																		.log(data);
																if (data.trim() == 'error') {
																	swal(
																			"Error!",
																			"Something wrong!",
																			"error");
																} else {
																	swal(
																			"Good job!",
																			"Saved Successfully!",
																			"success");
																}
															},
															error : function(
																	jqXHR,
																	textStatus,
																	errorThrown) {
																swal(
																		"Error!",
																		"Something wrong!",
																		"error");
															},
															processData : false,
															contentType : false
														})
											})
						})
	</script>
	<!-- end add post -->
	<!-- Loadind post using ajax -->
	<script>
		function getPosts(catId, temp) {
			$("#loader").show();
			$("#post-container").hide();
			$(".c-link").removeClass('active');
			$.ajax({
				url : "load_posts.jsp",
				data: {cid: catId},
				success : function(data, textStatus, jqXHR) {
					console.log(data);
					$("#loader").hide();
					$("#post-container").show();
					$("#post-container").html(data);
					$(temp).addClass('active');
					
				}
			})
		}
		$(document).ready(function(e) {
			let allPostRef=$('.c-link')[0]
			getPosts(0, allPostRef);
		})
	</script>

</body>
</html>