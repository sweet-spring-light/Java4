<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Update</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
</head>
<body>
	<!--========== NAV-BAR ==========-->
	<nav class="navbar navbar-expand-sm navbar-dark bg-dark"
		aria-label="Third navbar example">
		<div class="container-fluid">
			<h2 class="navbar-brand" href="#">Quản lí</h2>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarsExample03"
				aria-controls="navbarsExample03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarsExample03">
				<ul class="navbar-nav me-auto mb-2 mb-sm-0">
					<li class="nav-item"><a class="nav-link" href="/PT15302-UD/admin/user">Users</a></li>
					<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/admin/videos">Videos</a></li>
					<li class="nav-item"><a class="nav-link " href="#">Reports</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="dropdown03"
						data-bs-toggle="dropdown" aria-expanded="false">Account</a>
						<ul class="dropdown-menu" aria-labelledby="dropdown03">
							<li><a class="dropdown-item" href="#">Change Password</a></li>
							<li><a class="dropdown-item" href="#">Change Information</a></li>
							<li><a class="dropdown-item" href="#">Logout</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
		

		<!--========== CONTENTS ==========-->

	<div class="row">

		<div class="col-12">

			<div class="col-6 offset-3">

				<form method="POST"
					action="/PT15302-UD/admin/updateuser?id=${user.id }">

					<div class="mt-3">

						<label for="name" class="form-label">Name</label> <input
							type="text" class="form-control" value="${user.name }" id="name"
							name="name" />

					</div>

					<div class="mt-3">

						<label for="number" class="form-label">Number</label> <input
							type="number" class="form-control" value="${user.number }"
							id="number" name="number" />

					</div>

					<div class="mt-3">

						<label for="email" class="form-label">Email</label> <input
							type="email" class="form-control" value="${user.email }"
							id="email" name="email" />

					</div>

					<div class="mt-3">

						<label for="password" class="form-label">Password</label> <input
							type="password" class="form-control" value="${user.password }"
							id="password" name="password" />

					</div>

					<div class="mt-3">

						<label for="gender" class="form-label">Gender</label> <select
							class="form-select" name="gender">

							<option ${user.gender == "Nam" ? "selected" : "" } value="Nam">Male</option>

							<option ${user.gender == "Nữ" ? "selected" : "" } value="Nữ">Female</option>

						</select>

					</div>


					<div class="mt-3">

						<label for="roler" class="form-label">Role</label> <select
							class="form-select" name="roler">

							<option ${user.roler == 1 ? "selected" : "" } value="1">User</option>

							<option ${user.roler == 0 ? "selected" : "" } value="0">Admin</option>

						</select>

					</div>

					<div class="mt-3">

						<button type="submit" class="btn btn-primary mb-3">

							Submit</button>

					</div>

				</form>

			</div>

		</div>

	</div>
</body>
</html>