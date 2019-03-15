package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterCtrl {
	@RequestMapping("toRegister.action")
	public String toRegister() {
		
		return "redirect:register.action";
	}
	@RequestMapping("register.action")
	public String register() {
		
		return "register";
	}
}
