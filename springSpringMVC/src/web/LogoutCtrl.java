package web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutCtrl {

	@RequestMapping("/logout.action")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		session.removeAttribute("username");
		mv.setViewName("redirect:/index.action");
		
		
		return mv;
	}
}
