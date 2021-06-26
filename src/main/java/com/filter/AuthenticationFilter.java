package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buoi3.entity.User;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/admin/*")
public class AuthenticationFilter implements Filter {

    public AuthenticationFilter() {

    }

	public void destroy() {
		
	}

	public void doFilter(
			ServletRequest request, 
			ServletResponse response, 
			FilterChain chain ) 
			throws IOException, ServletException {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			User user = (User) httpRequest.getSession().getAttribute("user");
			
			if(user != null && user.getRoler() == 0) {
				chain.doFilter(request, response);
				return;
			} else {
				HttpServletResponse httpResponse = (HttpServletResponse) response;
				httpResponse.sendRedirect("/PT15302-UD/login");
				
			}
			
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
