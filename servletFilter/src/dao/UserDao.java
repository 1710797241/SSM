package dao;

import domain.User;

public interface UserDao {

	public String selectForLogin(User user);
	public Integer insertForRegister(User user);
}
