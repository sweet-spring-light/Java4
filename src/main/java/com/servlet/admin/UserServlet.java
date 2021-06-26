	package com.servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.UserDAO;
import com.untils.HibernateUtils;
import com.buoi3.entity.User;
@WebServlet("/admin/user")
public class UserServlet extends HttpServlet {
	private UserDAO userDAO;
	public UserServlet() {
		this.userDAO = new UserDAO();
	}
	@Override
	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	)throws ServletException,IOException{
		
//		TypedQuery<User> query = HibernateUtils.getSession()
//		.createNamedQuery("User.getListActive", User.class);
		
//		List<User> listUser = this.userDAO.paginate(offset, limit);
//		List<User> listUser = query.getResultList();	
		List<User> listUser = this.userDAO.getAllUser();
		
		request.setAttribute("listUser", listUser);

		request.getRequestDispatcher("/view/admin/user.jsp")
		.forward(request, response);
}
}
