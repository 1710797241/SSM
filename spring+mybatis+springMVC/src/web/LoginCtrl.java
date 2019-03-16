package web;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import domain.User;

@Controller
public class LoginCtrl {
	
	@RequestMapping(value="/toLogin.action")
	public ModelAndView toLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping(value="/login.action",method=RequestMethod.POST)
	public ModelAndView toLogin(User user,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		session.setAttribute("username", user.getUsername());
		mv.setViewName("redirect:/index.action");
		return mv;
	}
}
