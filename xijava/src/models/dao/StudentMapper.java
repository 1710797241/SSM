package models.dao;

import vo.StudentVo;

import java.util.List;

import models.domain.Student;
import models.dto.ClassDto;
import models.dto.StudentDto;

public interface StudentMapper {
	public List<StudentVo>selectAll(StudentDto studentDto);
	
	public Integer insertMany(StudentDto studentDto);
	
	public Integer updateMany(StudentDto studentDto);
	
	public Integer deleteMany(List<Integer> idList);
	
	public List<Student> selectAllByClassId(Integer cId );
}