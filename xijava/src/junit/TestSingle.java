package junit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import models.dao.StudentDao;
import models.domain.Student;
import util.SqlSessionUtil;

public class TestSingle {
	
	@Test
	public void TestSelect() {
		SqlSession session = SqlSessionUtil.getSession();
		
		StudentDao stuDao = session.getMapper(StudentDao.class);
		List<Student> list = stuDao.selectAll();
		session.commit(true);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("data", list);
		map.put("total", list.size());
		System.out.println(map);
	}
	@Test
	public void TestInsert() {
		SqlSession session = SqlSessionUtil.getSession();
		
		StudentDao stuDao = session.getMapper(StudentDao.class);
		Student stu = new Student();
		stu.setsName("心");
		stu.setClassId(3);
		Integer count = stuDao.insertStu(stu);
		session.commit(true);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("count", count);
		System.out.println(map);
	}
	@Test
	public void TestUpdate() {
		SqlSession session = SqlSessionUtil.getSession();
		
		StudentDao stuDao = session.getMapper(StudentDao.class);
		Student stu = new Student();
		stu.setsId(11);
		stu.setsName("心");
		stu.setClassId(3);
		Integer count = stuDao.updateStu(stu);
		session.commit(true);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("count", count);
		System.out.println(map);
	}
	@Test
	public void TestDelete() {
		SqlSession session = SqlSessionUtil.getSession();
		
		StudentDao stuDao = session.getMapper(StudentDao.class);
		Student stu = new Student();
		stu.setsId(11);
		Integer count = stuDao.deleteStu(stu.getsId());
		session.commit(true);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("count", count);
		System.out.println(map);
	}

}
