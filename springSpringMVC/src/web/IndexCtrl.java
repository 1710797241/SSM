package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexCtrl {

	@RequestMapping("/index.action")
	public String index() {
		
		return "index";
	}
}
