package models.domain;

import java.util.List;

public class Class {
    private Integer cId;

    private String cName;

    private Integer teacherId;
    
    private List<Student> studentList;

    public Class(Integer cId, String cName, Integer teacherId) {
        this.cId = cId;
        this.cName = cName;
        this.teacherId = teacherId;
    }

    public Class() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Class [cId=" + cId + ", cName=" + cName + ", teacherId=" + teacherId + "]";
	}
    
    
}