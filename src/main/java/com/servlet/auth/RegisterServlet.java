	package com.servlet.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.buoi3.entity.User;
import com.dao.UserDAO;
import com.untils.HibernateUtils;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
        this.userDAO = new UserDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.getRequestDispatcher("/view/auth/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User entity = new User();
		try {
			BeanUtils.populate(
					entity,
					request.getParameterMap()
					);
			
			entity.setRoler(1);
			entity.setStatus(1);
			entity.setNumber("0");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
//		Session session = HibernateUtils.getSession();
//		session.beginTransaction();
//		session.save(entity);
//		session.getTransaction().commit();
		
		this.userDAO.store(entity);
		
		doGet(request, response);
	}
	
}
