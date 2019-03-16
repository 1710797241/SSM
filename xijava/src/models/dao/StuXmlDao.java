package models.dao;

import java.util.List;


import models.domain.Student;

public interface StuXmlDao {
	public List<Student>selectAll();
	public Integer insertStu(Student stu);
	public Integer updateStu(Student stu);
	public Integer deleteStu(Integer id);
}
