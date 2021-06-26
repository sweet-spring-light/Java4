<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Winx</title>
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

				<form method="POST" enctype="multipart/form-data" action="/PT15302-UD/AddPost">
				
					<div class="mt-3">
					<label for="picture" class="form-label">Picture</label>
					
					<input type="file" id="picture" name="image" >
					
					</div>
					<div class="mt-3">

						<label for="tittle" class="form-label">Tittle</label> <input
							type="text" class="form-control" id="tittle" name="tittle" />

					</div>

					<div class="mt-3">

						<label for="content" class="form-label">Content</label> <input
							type="text" class="form-control" id="content" name="content" />

					</div>

					<div class="mt-3">

						<label for="link" class="form-label">Link</label> <input
							type="text" class="form-control" id="link" name="link" />

					</div>

					<div class="mt-3">

						<label for="views" class="form-label">View</label> <input
							type="number" class="form-control" id="views"
							name="views" />
					</div>

					<div class="mt-3">

						<button type="submit" class="btn btn-primary mb-3">

							Submit</button>

					</div>
				</form>
			</div>
		</div>
	</div>
							<!--========== JS ==========-->
			<script src="/docs/5.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js" integrity="sha512-bLT0Qm9VnAYZDflyKcBaQ2gg0hSYNQrJ8RilYldYQ1FxQYoCLtUjuuRuZo+fjqhx/qtq/1itJ0C2ejDxltZVFg==" crossorigin="anonymous"></script>	
			<script type="text/javascript">
			 function readURL(input) {
		            if (input.files && input.files[0]) {
		                var reader = new FileReader();

		                reader.onload = function (e) {
		                    $('#blah')
		                        .attr('src', e.target.result);
		                };

		                reader.readAsDataURL(input.files[0]);
		            }
		        }
			</script>			
</body>
</html>