package web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

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
		try {
		String originalFilename = file.getOriginalFilename();
		String extName = originalFilename.substring(originalFilename.indexOf("."));
		String newFileName = UUID.randomUUID().toString().replaceAll("-", "").concat(extName);
		String path = req.getServletContext().getRealPath("/resources/upload");
		
			file.transferTo(new File(path, newFileName));
		} catch (Exception e) {
			return "redirect:/toRegister.action";
		}
		return "redirect:/toLogin.action";
	}
}
