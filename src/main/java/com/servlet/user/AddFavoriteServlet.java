package com.servlet.user;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.buoi3.entity.Favorites;
import com.buoi3.entity.Post;
import com.buoi3.entity.User;
import com.dao.FavariteDAO;

/**
 * Servlet implementation class FavoriteServlet
 */
@WebServlet("/HomeUser/like")
public class AddFavoriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FavariteDAO favariteDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFavoriteServlet() {
		super();
		this.favariteDAO = new FavariteDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		User user = new User();
		Post post = new Post();
		Date date = new Date();
		post.setId(Integer.parseInt(id));
		user = (User) session.getAttribute("user");
		Favorites favorites = new Favorites();
		favorites.setUserId(user.getId());
		favorites.setVideoId(post.getId());
		favorites.setLikeDate(date);

		Favorites check = favariteDAO.checkDuplicateVideoByUser(user.getId(), Integer.valueOf(id));
		System.out.println(user.getEmail() + "\n" + id);
		if (check == null) {
			System.out.println("true");
			boolean status = favariteDAO.store(favorites);
			if (status) {
				response.sendRedirect(request.getContextPath() + "/HomeUser/favorite/list");
//			 response.sendRedirect(request.getContextPath() + "/view/user/viewlike.jsp");
			} else {
				response.sendRedirect(request.getContextPath() + "/HomeUser");
			}
		} else {
			System.out.println("false");
			response.sendRedirect(request.getContextPath() + "/HomeUser/favorite/list");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
