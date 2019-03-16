package models.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import models.domain.Student;
import models.dto.StudentDto;
import vo.StudentVo;

public interface StudentDao {
	@Select("select s_id sId,s_name sName,class_id classId from student" )
	public List<Student>selectAll();
	@Insert("insert into student(s_name,class_id)values(#{sName},#{classId})")
	public Integer insertStu(Student stu);
	@Update("update student set s_name = #{sName} where s_id = #{sId}")
	public Integer updateStu(Student stu);
	@Delete("delete  from student where s_id=#{id} ")
	public Integer deleteStu(Integer id);
	
}
