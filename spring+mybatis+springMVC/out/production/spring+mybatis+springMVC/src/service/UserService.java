package service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import domain.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public Map<String,Object> selectForLogin(User user){
		Map<String,Object> map = new HashMap<String,Object>();
		String username = userDao.selectForLogin(user);
		
		
		map.put("username", username);
		
		
		return map;
		
		
	}
}
