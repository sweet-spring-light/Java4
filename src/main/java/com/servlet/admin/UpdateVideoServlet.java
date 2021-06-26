package com.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.buoi3.entity.Post;
import com.buoi3.entity.User;
import com.dao.VideoDAO;

@WebServlet("/admin/updatevideos")
public class UpdateVideoServlet extends HttpServlet {
	private VideoDAO videoDAO;
    public UpdateVideoServlet() {
        super();
        this.videoDAO= new VideoDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		Post entity = this.videoDAO.findById(id);
		request.setAttribute("post", entity);
		request.getRequestDispatcher("/view/admin/update_post.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		Post entity = new Post();
		try {
			BeanUtils.populate(entity, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		entity.setActive(1);
		this.videoDAO.update(entity);
		System.out.println("-----" + request.getContextPath());
		response.sendRedirect(request.getContextPath() + "/admin/videos");
	}

}
