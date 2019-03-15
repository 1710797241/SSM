package web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import domain.User;

@Controller
public class RegisterCtrl {
	@RequestMapping("/toRegister.action")
	public String toRegister() {
		
		return "register";
	}
	@RequestMapping(value="/register.action",method=RequestMethod.POST)
	public String register(HttpServletRequest req, User user,MultipartFile file) {
		String originalFilename = file.getOriginalFilename();
		String path = "C:\\Users\\17107\\Pictures\\upload";
		try {
			file.transferTo(new File(path, originalFilename));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/toLogin.action";
	}
}
