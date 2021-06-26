package com.servlet.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import com.dao.VideoDAO;

/**
 * Servlet implementation class FavoriteList
 */
@WebServlet("/HomeUser/favorite/list")
public class FavoriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private FavariteDAO favariteDAO ;
       private VideoDAO videoDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FavoriteServlet() {
        super();
       this.favariteDAO = new FavariteDAO();
       this.videoDAO = new VideoDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Favorites> listfavorites = new ArrayList<Favorites>();
		HttpSession session = request.getSession();
		User user  = new User();
		user = (User) session.getAttribute("user");
		listfavorites = favariteDAO.getAllFavorites(user.getId());
		String view = "/view/user/viewlike.jsp";
		request.setAttribute("view", view);
		List<Favorites> listVideoId = favariteDAO.getAllFavorites(user.getId());
		List<Post> listVideo = new ArrayList<Post>();
		for(int i = 0; i < listVideoId.size(); i++) {
			listVideo.add(videoDAO.findById(listVideoId.get(i).getVideoId()));
		}
		request.setAttribute("listVideo", listVideo);
//		request.setAttribute("listVideo", listfavorites);
		request.getRequestDispatcher("/view/layout.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
