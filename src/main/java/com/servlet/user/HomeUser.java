package com.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buoi3.entity.Post;
import com.dao.VideoDAO;

/**
 * Servlet implementation class HomeUser
 */
@WebServlet("/HomeUser")
public class HomeUser extends HttpServlet {
	private VideoDAO videoDAO;
    public HomeUser() {
        super();
        this.videoDAO= new VideoDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/view/user/home.jsp";
		request.setAttribute("view", view);
		
		List<Post> listPost = this.videoDAO.getAllPost();
		request.setAttribute("listPost", listPost);
		request.getRequestDispatcher("/view/layout.jsp")
		.forward(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
