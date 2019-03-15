package service;

import java.util.HashMap;
import java.util.Map;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;

public class UserService {

	private UserDao userDao = new UserDaoImpl();
	
	public Map<String,Object> selectForLogin(User user){
		Map<String,Object> map = new HashMap<String,Object>();
		String username = userDao.selectForLogin(user);
		
		
		map.put("username", username);
		
		
		return map;
		
		
	}
}
