package com.servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buoi3.entity.Post;
import com.buoi3.entity.User;
import com.dao.VideoDAO;
import com.untils.HibernateUtils;


@WebServlet("/admin/videos")
public class VideoServlet extends HttpServlet {
	private VideoDAO videoDAO;
    public VideoServlet() {
        super();
      this.videoDAO= new VideoDAO();
    }

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response
			) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
//			TypedQuery<Post> query = HibernateUtils.getSession()
//				.createNamedQuery("Post.getListActive", Post.class);	
//				List<User> listUser = this.userDAO.paginate(offset, limit);
//				List<Post> listPost = query.getResultList();	
			List<Post> listPost = this.videoDAO.getAllPost();
				request.setAttribute("listPost", listPost);
				System.out.println("aaa: " + listPost.toString());
				request.getRequestDispatcher("/view/admin/post.jsp")
				.forward(request, response);
	}

	
	

}
