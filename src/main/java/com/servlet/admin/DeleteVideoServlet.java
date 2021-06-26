package com.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buoi3.entity.Post;
import com.buoi3.entity.User;
import com.dao.VideoDAO;

@WebServlet("/admin/deletevideos")
public class DeleteVideoServlet extends HttpServlet {
	private VideoDAO videoDAO;
       
    public DeleteVideoServlet() {
        super();
        this.videoDAO= new VideoDAO();
    }

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response
			) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		
		if (idStr == null) {
			// 400 Bad Request
		}

		int id = Integer.parseInt(idStr);
		Post entity = new Post();
		entity.setId(id);
		
		 this.videoDAO.delete(entity);
		
		response.sendRedirect(request.getContextPath() + "/admin/videos");
	}

}
