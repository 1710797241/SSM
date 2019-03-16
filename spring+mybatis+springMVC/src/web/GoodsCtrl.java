package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/goods")
public class GoodsCtrl {

	@RequestMapping("/showGoods.action")
	public ModelAndView showGoods() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("goods/myMall");
	
		return mv;
	}
}
