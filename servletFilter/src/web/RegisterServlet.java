package web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.UserService;
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserService(); 
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");	
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setName(name);
		u.setEmail(email);
		u.setPhone(phone);
		Map<String, Object> map = userService.insertForRegister(u);
		if((int)map.get("total")>0) {
			response.sendRedirect(request.getContextPath()+"/jsp/login.jsp");
		}else {
			response.sendRedirect(request.getContextPath()+"/jsp/register.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
