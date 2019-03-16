package models.dao;

import models.domain.Class;
import models.dto.ClassDto;
import vo.StudentVo;

import java.util.List;
import java.util.Map;

public interface ClassMapper {
	public List<Class> selectAll();
	
	public List<Class> selectByClassId(Integer c_id);
	
	public List<StudentVo> selectByClaId(Integer c_id);
}