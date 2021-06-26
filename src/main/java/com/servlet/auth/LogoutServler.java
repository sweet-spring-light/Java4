package com.servlet.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.buoi3.entity.User;
import com.dao.UserDAO;

/**
 * Servlet implementation class LogoutServler
 */
@WebServlet("/LogoutServler")
public class LogoutServler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
   
    public LogoutServler() {
        super();
        this.userDAO = new UserDAO();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
    	request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
//		String email = request.getParameter("email"),
//				password = request.getParameter("password");
//		
//		User entity = this.userDAO.login(email, password);
		HttpSession session = request.getSession();
//		session.setAttribute("user", entity);
		session.removeAttribute("user");
		request.getRequestDispatcher("/view/auth/login.jsp").forward(request, response);
	}

	
	

}
