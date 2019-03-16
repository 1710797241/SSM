package util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {

	private static SqlSessionFactory sqlSessionFactory  = null;
	private static SqlSession sqlSession = null;
	static {
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-dev.xml");
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SqlSession getSession() {
		if(sqlSession == null) {
			sqlSession = sqlSessionFactory.openSession(false);//不自动提交
		}
		return sqlSession;
	}
}
