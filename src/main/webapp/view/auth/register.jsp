<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AAAAAA</title>
<!--========== CSS BOOTSTRAP ==========-->
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
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Users</a></li>
					<li class="nav-item"><a class="nav-link " href="#">Videos</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="dropdown03"
						data-bs-toggle="dropdown" aria-expanded="false">Reports</a>
						<ul class="dropdown-menu" aria-labelledby="dropdown03">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>


	<!--========== CONTENTS ==========-->
	<div class="row">

		<div class="col-12">

			<div class="col-6 offset-3">

				<form method="POST" action="/PT15302-UD/register">

					<div class="mt-3">

						<label for="name" class="form-label">Name</label> <input
							type="text" class="form-control" id="name" name="name" />

					</div>

					<div class="mt-3">

						<label for="number" class="form-label">Number</label> <input
							type="number" class="form-control" id="number" name="number" />

					</div>

					<div class="mt-3">

						<label for="email" class="form-label">Email</label> <input
							type="email" class="form-control" id="email" name="email" />

					</div>

					<div class="mt-3">

						<label for="password" class="form-label">Password</label> <input
							type="password" class="form-control" id="password"
							name="password" />

					</div>

					<div class="mt-3">

						<label for="gender" class="form-label">Gender</label> <select
							class="form-select" name="gender">

							<option selected value="1">Male</option>

							<option value="0">Female</option>

						</select>

					</div>
					<div class="form-check mt-3">

						<input class="form-check-input" type="checkbox" value=""
							id="flexCheckChecked" checked name="notification"> <label
							class="form-check-label" for="flexCheckChecked"> Receive
							email? </label>

					</div>

					<div class="mt-3">

						<button type="submit" class="btn btn-primary mb-3">

							Submit</button>

					</div>
				</form>
			</div>
		</div>
	</div>
							<!--========== JS BOOTSTRAP ==========-->
			<script src="/docs/5.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>				
</body>
</html>