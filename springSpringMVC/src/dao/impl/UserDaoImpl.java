package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import dao.UserDao;
import domain.User;
import util.JdbcUtil;

public class UserDaoImpl implements UserDao {

	
	@Override
	public String selectForLogin(User user) {
		Connection connection = JdbcUtil.getConnection();
		String username = null;
		try {
			connection.setAutoCommit(false);
			String sql = "select * from user where username=? and password=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			connection.commit();
			while(rs.next()) {
				username = rs.getString(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return username;
	}
	
	@Override
	public Integer insertForRegister(User user) {
		Connection connection = JdbcUtil.getConnection();
		String username = null;
		Integer count = null;
		try {
			connection.setAutoCommit(false);
			String sql = "insert into user (username,password,name,email,phone,pic)values(?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getName());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPhone());
			ps.setString(6, user.getPic());
			 count = ps.executeUpdate();
			 connection.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

}
