package web;


import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import domain.User;
import service.UserService;

@Controller
public class LoginCtrl {
	@Autowired
	private UserService userService;
	@RequestMapping(value="/toLogin.action")
	public ModelAndView toLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping(value="/login.action",method=RequestMethod.POST)
	public ModelAndView toLogin(User user,HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		Cookie cookie = new Cookie("sessionId", session.getId());
		cookie.setMaxAge(5*60);
		resp.addCookie(cookie);
		Integer count = (Integer) session.getAttribute("count");
		Map<String, Object> map = userService.selectForLogin(user);
		if(map.get("username")==null) {
			
			if(count==null) {
				session.setAttribute("count", 1);
				mv.setViewName("redirect:/toLogin.action");
				return mv;
			}else {
				session.setAttribute("count", ++count);
				
				if(count==3) {
					mv.setViewName("redirect:/toRegister.action");
					return mv;
				}
				mv.setViewName("redirect:/toLogin.action");
				return mv;

				
			}
			
			
		}
		
		session.setAttribute("username", map.get("username"));
		mv.setViewName("redirect:/index.action");
		return mv;
	}
}
