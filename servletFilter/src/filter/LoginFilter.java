package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
public class LoginFilter implements Filter {

    public LoginFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp =(HttpServletResponse) response;
			String username = (String) req.getSession().getAttribute("username");
			if(username == null ||"".equals(username)) {
				resp.sendRedirect(request.getServletContext().getContextPath()+"/jsp/login.jsp");
				
			}
			else {
				chain.doFilter(request, response);
			}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
