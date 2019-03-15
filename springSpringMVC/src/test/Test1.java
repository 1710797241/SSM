package test;

import java.sql.Connection;

import org.junit.Test;

import util.JdbcUtil;

public class Test1 {

	@Test
	public void testF() {
		Connection connection = JdbcUtil.getConnection();
		System.out.println(connection);
	}
}
