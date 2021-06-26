<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> -->
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<!--========== BOX ICONS ==========-->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">

<!--========== CSS ==========-->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/view/assets/css/styles.css"
	type="text/css">

	<link rel="stylesheet" href="<%=request.getContextPath()%>/view/assets/css/home.css" type="text/css">


<title>Wins</title>
</head>

<body>
		<div class="container">


	<!--========== HEADER ==========-->
	<header class="header">
		<div class="header__container">
			<img src="<%=request.getContextPath()%>/view/assets/img/mullet.jpg"
				alt="" class="header__img"> <a href="#" class="header__logo">Hello</a>

			<div class="header__search">
				<input type="search" placeholder="Search" class="header__input">
				<i class='bx bx-search header__icon'></i>
			</div>

			<div class="header__toggle">
				<i class='bx bx-menu' id="header-toggle"></i>
			</div>
		</div>
	</header>


	<!--========== NAV ==========-->
	<div class="navtest" id="navbar">
		<nav class="nav__container">
			<div>
				<a href="#" class="nav__link nav__logo">
				<i class='bx bxs-movie-play nav__icon'></i> <span class="nav__logo-name">Hello</span>
				</a>

				<div class="nav__list">
					<div class="nav__items">
						<h3 class="nav__subtitle">Profile</h3>

						<a href="<%=request.getContextPath()%>/HomeUser" class="nav__link active"> <i
							class='bx bx-home nav__icon'></i> <span class="nav__name">Home</span>
						</a>

						<div class="nav__dropdown">
							<a href="#" class="nav__link"> <i
								class='bx bx-user nav__icon'></i> <span class="nav__name">Profile</span>
								<i class='bx bx-chevron-down nav__icon nav__dropdown-icon'></i>
							</a>

							<div class="nav__dropdown-collapse">
								<div class="nav__dropdown-content">
									<a href="#" class="nav__dropdown-item">Passwords</a> <a
										href="#" class="nav__dropdown-item">Mail</a> <a href="#"
										class="nav__dropdown-item">Accounts</a>
								</div>
							</div>
						</div>

					</div>

					<div class="nav__items">
						<h3 class="nav__subtitle">Menu</h3>


						<a href="#" class="nav__link"> <i class='bx bx-bell nav__icon'></i> <span class="nav__name">Notification</span>
						</a> <a href="<%=request.getContextPath()%>/HomeUser/favorite/list" class="nav__link"> <i class='bx bx-heart nav__icon'></i> <span class="nav__name">Like</span>
						</a>
					</div>
				</div>
			</div>

			<a href="/PT15302-UD/LogoutServler" class="nav__link nav__logout"> <i
				class='bx bx-log-out nav__icon'></i> <span class="nav__name">Log
					Out</span>
			</a>
		</nav>
	</div>
</div>
	<!--========== CONTENTS ==========-->

	<div >
		<jsp:include page="${ view }" />
	</div>



	<!--========== MAIN JS ==========-->
	>
	<script src="<%=request.getContextPath()%>/view/assets/js/main.js"></script>
</body>

</html>