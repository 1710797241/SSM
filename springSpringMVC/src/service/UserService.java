package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;
import util.JdbcUtil;

@Service
public class UserService {

	private UserDao userDao = new UserDaoImpl();
	
	public Map<String,Object> selectForLogin(User user){
		Map<String,Object> map = new HashMap<String,Object>();
		String username = userDao.selectForLogin(user);
		
		
		map.put("username", username);
		
		
		return map;
		
		
	}
	
	public Map<String,Object>  insertForRegister(User user) {
		Map<String,Object> map = new HashMap<String,Object>();
		Integer count = userDao.insertForRegister(user);
		
		
		map.put("count", count);
		
		
		return map;
	}
}
