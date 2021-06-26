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

@WebFilter("/HomeUser/*")
public class UserFilter implements Filter {

    public UserFilter() {

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
			
			if(user == null) {
				HttpServletResponse httpResponse = (HttpServletResponse) response;
				
				httpResponse.sendRedirect("/PT15302-UD/login");
			} else {
				chain.doFilter(request, response);
			}
			
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}