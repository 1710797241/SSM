package junit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import models.dao.ClassMapper;
import models.dao.StudentMapper;
import models.domain.Class;
import models.domain.Student;
import models.dto.ClassDto;
import models.dto.StudentDto;
import util.SqlSessionUtil;
import vo.StudentVo;

public class TestFun {
	
	///根据指定的学生编号进行增删改查操作。(注：查询结果包含老师和班级信息)

	@Test
	public void testSelectAll() {
		SqlSession session = SqlSessionUtil.getSession();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
	
		List<StudentVo> list = studentMapper.selectAll(null);
		session.commit(true);
		System.out.println(list.toString());
	}
	@Test
	public void testInsertMany() {
		SqlSession session = SqlSessionUtil.getSession();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student>studentList = new ArrayList<>();
		Student stu = new Student();
		stu.setClassId(2);
		stu.setsName("无影d");
		studentList.add(stu);
		StudentDto studentDto = new StudentDto();
		studentDto.setStudentList(studentList);
		Integer count = studentMapper.insertMany(studentDto);
		session.commit(true);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", count);
		System.out.println(map);
	}
	
	@Test
	public void testUpdateMany() {
		SqlSession session = SqlSessionUtil.getSession();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student>studentList = new ArrayList<>();
		Student stu = new Student();
		stu.setClassId(3);
		stu.setsName("无影1");
		stu.setsId(4);
		studentList.add(stu);
		StudentDto studentDto = new StudentDto();
		studentDto.setStudentList(studentList);
		Integer count = studentMapper.updateMany(studentDto);
		session.commit(true);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", count);
		System.out.println(map);
	}
	
	@Test
	public void testDeleteMany() {
		SqlSession session = SqlSessionUtil.getSession();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student>studentList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(5);
		Integer count = studentMapper.deleteMany(list);
		session.commit(true);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", count);
		System.out.println(map);
	}
	
	//根据classId查询对应的班级信息,包括学生,老师。(分步查询和嵌套查询两种方式)
	
	//分步
	@Test
	public void testSeleteClassId() {
		SqlSession session = SqlSessionUtil.getSession();
		ClassMapper classMapper = session.getMapper(ClassMapper.class);
		 List<Class> classStu = classMapper.selectByClassId(2);
		session.commit(true);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", classStu.size());
		map.put("data", classStu);
		System.out.println(map);
	}
	
	//嵌套
	@Test
	public void testSelectClasId() {
		SqlSession session = SqlSessionUtil.getSession();
		ClassMapper classMapper = session.getMapper(ClassMapper.class);
		List<StudentVo> list = classMapper.selectByClaId(2);
		session.commit(true);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", list.size());
		map.put("data", list);
		System.out.println(map);
	}
	//C.查询学生姓名中包含“d”且班级编号为2的所有学生信息。
	@Test
	public void testSeleteByPara() {
		SqlSession session = SqlSessionUtil.getSession();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student>studentList = new ArrayList<>();
		String name = "d";
		Integer classId = 2;
		StudentDto studentDto = new StudentDto();
		studentDto.setClassId(classId);
		studentDto.setsName(name);
		List<StudentVo> list = studentMapper.selectAll(studentDto);
		session.commit(true);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", list.size());
		map.put("data", list);
		System.out.println(map);
	}
	
}
