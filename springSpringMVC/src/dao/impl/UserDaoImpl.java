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
			String sql = "select * from user where name=? and psw=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				username = rs.getString(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return username;
	}

}
