package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/onlyLogin")
public class PersonInfoCtrl {

	@RequestMapping("/showPersonmenu.action")
	public ModelAndView showGoods() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("onlyLogin/personmenu");
	
		return mv;
	}
	
	@RequestMapping("/showPersonInfo.action")
	public ModelAndView showPersonInfo() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("onlyLogin/personalInfo");
	
		return mv;
	}
	
	@RequestMapping("/modifyPersonInfo.action")
	public ModelAndView modifyPersonInfo() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("onlyLogin/modifyPerson");
	
		return mv;
	}
	@RequestMapping("/modifyPass.action")
	public ModelAndView modifyPass() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("onlyLogin/modifyPass");
	
		return mv;
	}
	
}
