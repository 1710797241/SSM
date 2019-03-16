package web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import service.UserService;

public class LoginServlet extends HttpServlet {
	
	private UserService userService = new UserService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println(username);
			System.out.println(password);

			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			Map<String, Object> map = userService.selectForLogin(user);
			Integer count = (Integer) request.getServletContext().getAttribute("count");
			if(map.get("username")==null) {
				if(count==null) {
					request.getServletContext().setAttribute("count", 1);
				}else {
					request.getServletContext().setAttribute("count", count+1);
					if(count==3) {
						response.sendRedirect(request.getContextPath()+"/jsp/register.jsp");
					}
				}
				
				response.sendRedirect(request.getContextPath()+"/jsp/login.jsp");
			}else {
				request.getSession().setAttribute("username", map.get("username"));
				response.sendRedirect(request.getContextPath()+"/jsp/index.jsp");
			}
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}