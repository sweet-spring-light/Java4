package com.servlet.user;

import java.io.IOException;
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
 * Servlet implementation class DeleteFavorite
 */
@WebServlet("/HomeUser/unlike")
public class DeleteFavoriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private FavariteDAO favariteDAO;   
    
    public DeleteFavoriteServlet() {
        super();
       this.favariteDAO = new FavariteDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = new User();
		String idStr = request.getParameter("videoId");
		user = (User) session.getAttribute("user");
		Favorites favorites = new Favorites();
		Post post = new Post();
		post.setId(Integer.parseInt(idStr));
		boolean status = favariteDAO.delete(favorites);
		if (status) {
			response.sendRedirect(request.getContextPath() + "/HomeUser/favorite/list");
//		 response.sendRedirect(request.getContextPath() + "/view/user/viewlike.jsp");
		} else {
			response.sendRedirect(request.getContextPath() + "/HomeUser");
		}
		
//		response.sendRedirect(request.getContextPath() + "/HomeUser/favorite/list");
	}

}
