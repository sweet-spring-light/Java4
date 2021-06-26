package com.servlet.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.buoi3.entity.User;
import com.dao.UserDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	public LoginServlet() {
		super();

		this.userDAO = new UserDAO();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/view/auth/login.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email"),
				password = request.getParameter("password");
		
		User entity = this.userDAO.login(email, password);
		
		if(entity == null) {
			//Day ve trang dang nhap
			response.sendRedirect("/PT15302-UD/login");
		}else
		{
			HttpSession session = request.getSession();
			session.setAttribute("user", entity);
//			User entity = new User();
		
			if(entity.getRoler() == 0) {
				response.sendRedirect(
						request.getContextPath() + "/admin/user"
						);
			} else {
				response.sendRedirect(
						request.getContextPath() + "/HomeUser"
						);
			}
			
		}
		
//		doGet(request, response);
	}

}
