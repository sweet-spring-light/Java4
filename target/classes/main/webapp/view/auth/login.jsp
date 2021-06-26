<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<!-- Created By CodingNepal -->
	<html lang="en" dir="ltr">

	<head>
	
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
	
		
		<meta charset="UTF-8">
		 <title>Login & Signup </title> 
		
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<link rel="stylesheet" href="<%=request.getContextPath()%>/view/assets/css/login.css">
		
	</head>

	<body>
		<div class="wrapper">
			<div class="title-text">
				<div class="title login">
					Login Form</div>
				<div class="title signup">
					Signup Form</div>
			</div>
			<div class="form-container">
				<div class="slide-controls">
					<input type="radio" name="slide" id="login" checked>
					<input type="radio" name="slide" id="signup">
					<label for="login" class="slide login">Login</label>
					<label for="signup" class="slide signup">Signup</label>
					<div class="slider-tab">
					</div>
				</div>
				<div class="form-inner">
					<form action="/PT15302-UD/login" method="POST" class="login">
						<div class="field">
							<input type="email" name="email" placeholder="Email Address" required>
						</div>
						<div class="field">
							<input type="password" name="password" placeholder="Password" required>
						</div>
						<div class="pass-link">
							<a href="#">Forgot password?</a>
						</div>
						<div class="field btn">
							<div class="btn-layer">
							</div>
							<input type="submit" value="Login">
						</div>
						<div class="signup-link">
							Not a member? <a href="">Signup now</a></div>
					</form>
					<form action="/PT15302-UD/register" class="signup" method="POST">
						<div class="field">
							<input type="text" placeholder="Name" id="name" name="name" required>
						</div>
						<div class="field">
							<input type="email" placeholder="Email Address" id="email" name="email" required>
						</div>
						<div class="field">
							<select name="gender">
								<option value="gender">Giới tính</option>
								<option value="Nam">Nam</option>
								<option value="Nữ">Nữ</option>
							</select>
						</div>
						<div class="field">
							<input type="password" id="password" name="password" placeholder="Password" required>
						</div>
						<div class="field">
							<input type="password" placeholder="Confirm password" required>
						</div>
						<div class="field btn">
							<div class="btn-layer">
							</div>
							<input type="submit" value="Signup">
						</div>
					</form>
				</div>
			</div>
		</div>

		<script>
			const loginText = document.querySelector(".title-text .login");
			const loginForm = document.querySelector("form.login");
			const loginBtn = document.querySelector("label.login");
			const signupBtn = document.querySelector("label.signup");
			const signupLink = document.querySelector("form .signup-link a");
			signupBtn.onclick = (() => {
				loginForm.style.marginLeft = "-50%";
				loginText.style.marginLeft = "-50%";
			});
			loginBtn.onclick = (() => {
				loginForm.style.marginLeft = "0%";
				loginText.style.marginLeft = "0%";
			});
			signupLink.onclick = (() => {
				signupBtn.click();
				return false;
			});
		</script>

	</body>

	</html>