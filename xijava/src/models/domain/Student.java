package models.domain;

public class Student {
    private Integer sId;

    private String sName;

    private Integer classId;

    public Student(Integer sId, String sName, Integer classId) {
        this.sId = sId;
        this.sName = sName;
        this.classId = classId;
    }

    public Student() {
        super();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", classId=" + classId + "]";
	}
    
    

}