<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="contain">
<div class="movies-heading">
	<h2>Movies</h2>
</div>
<section id="movies-list">
	<!-- box1-->
	<c:forEach items="${listVideo}" var="post">
	<div class="movies-box">
		<div class="movies-img">
			<img src="<%=request.getContextPath()%>/view/assets/img/${post.image }">
		</div>
		<a href="#">${post.tittle}</a>
		<div class="active"  >
		<!-- <%=request.getContextPath()%>/HomeUser/like?id=${post.id } -->
			<a href="<%=request.getContextPath()%>/HomeUser/unlike" class="love">
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
					fill="currentColor" class="bi bi-heart-fill"
					viewBox="0 0 16 16">
					  <path fill-rule="evenodd"
						d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z"></path>
				</svg>
				Unlike
			</a>
			<button type="button" class="share">
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
					fill="currentColor" class="bi bi-box-arrow-up-right"
					viewBox="0 0 16 16">
						<path fill-rule="evenodd"
						d="M8.636 3.5a.5.5 0 0 0-.5-.5H1.5A1.5 1.5 0 0 0 0 4.5v10A1.5 1.5 0 0 0 1.5 16h10a1.5 1.5 0 0 0 1.5-1.5V7.864a.5.5 0 0 0-1 0V14.5a.5.5 0 0 1-.5.5h-10a.5.5 0 0 1-.5-.5v-10a.5.5 0 0 1 .5-.5h6.636a.5.5 0 0 0 .5-.5z"></path>
						  <path fill-rule="evenodd"
						d="M16 .5a.5.5 0 0 0-.5-.5h-5a.5.5 0 0 0 0 1h3.793L6.146 9.146a.5.5 0 1 0 .708.708L15 1.707V5.5a.5.5 0 0 0 1 0v-5z"></path>
						</svg>
				Share
			</button>
		</div>
		</div>
	</c:forEach>
</section>
</div>
