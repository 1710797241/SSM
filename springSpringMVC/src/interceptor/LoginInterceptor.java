package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle");
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object e) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		System.out.println(session+"  session +inter");
		System.out.println(session.getAttribute("username"));
		if(session.getAttribute("username")==null) {
			resp.sendRedirect(req.getContextPath()+"/toLogin.action");
		}else {
			return true;
		}
		
		
		return false;
	}

}
