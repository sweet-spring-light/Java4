package com.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.buoi3.entity.User;
import com.dao.UserDAO;

@WebServlet("/admin/updateuser")
public class UpdateUserSevlet extends HttpServlet {
	private UserDAO userDAO;

	public UpdateUserSevlet() {
		super();
		this.userDAO = new UserDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		User entity = this.userDAO.findById(id);
		request.setAttribute("user", entity);
		request.getRequestDispatcher("/view/admin/update.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		User entity = new User();
		try {
			BeanUtils.populate(entity, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		entity.setStatus(1);
		this.userDAO.update(entity);
		
		System.out.println("-----" + request.getContextPath());
		response.sendRedirect(request.getContextPath() + "/admin/user");
	}

}
