<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Wins</title>
  <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
	<!--========== CSS ==========-->
		<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
  <link href="<%=request.getContextPath()%>/view/assets/css/bootstrap.min.css" rel="stylesheet">
  <link href="<%=request.getContextPath()%>/view/assets/css/dataTables.bootstrap4.css" rel="stylesheet">


</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
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
							<li><a class="dropdown-item" href="<%=request.getContextPath()%>/LogoutServler">Logout</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
		

		<!--========== CONTENTS ==========-->

  <div class="content-wrapper">
    <div class="container-fluid">
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i> Data Table User</div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                  <th>Id</th>
                  <th>Name</th>
                  <th>Number</th>
                  <th>Email</th>       
                  <th>Gendel</th>
                  <th>Roler</th>
                  <th>Action</th>
                </tr>
              </thead>
               <tbody>
               <c:forEach items="${ listUser}" var="user">
                <tr>

							<td>${user.id }</td>

							<td>${user.name }</td>
							
							<td>${user.number }</td>

							<td>${user.email }</td>

							<td>${ user.gender}</td>

							<td>${user.roler}</td>
                  <td><a href="/PT15302-UD/admin/updateuser?id=${user.id }">Update</a>

                    <a style="color: red;" href="/PT15302-UD/admin/delete?id=${user.id }">Delete</a>
                  </td>
                  </c:forEach>
                   </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!--========== JS ==========-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    <script src="<%=request.getContextPath()%>/view/assets/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/view/assets/js/jquery.dataTables.js"></script>
    <script src="<%=request.getContextPath()%>/view/assets/js/dataTables.bootstrap4.js"></script>
    <script src="<%=request.getContextPath()%>/view/assets/js/sb-admin-datatables.min.js"></script>
  </div>
</body>

</html>
                  