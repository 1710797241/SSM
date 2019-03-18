package dao;

import org.springframework.stereotype.Repository;

import domain.User;

@Repository
public interface UserDao {

	public String selectForLogin(User user);
}
