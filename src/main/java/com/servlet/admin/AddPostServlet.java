package com.servlet.admin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;

import com.buoi3.entity.Post;
import com.buoi3.entity.User;
import com.dao.VideoDAO;

@MultipartConfig
@WebServlet("/AddPost")
public class AddPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VideoDAO videoDAO;

	public AddPostServlet() {
		super();
		this.videoDAO = new VideoDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("view/admin/add_post.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		Post post = new Post();
		try {
			Part part = request.getPart("image");
			
			String realPath = request.getServletContext().getRealPath("/uploads");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}
			part.write(realPath + "/" + fileName);
			BeanUtils.populate(post, request.getParameterMap());
			post.setImage(fileName);
			post.setActive(1);
			System.out.println(post.toString());
			this.videoDAO.store(post);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		doGet(request, response);
	}
}
