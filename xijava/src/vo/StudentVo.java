package vo;

public class StudentVo {
	private Integer sId;
	
	private String sName;
	private Integer cId;
	private String cName;
	private Integer tId;
	private String tName;
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
		this.sName = sName;
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
		this.cName = cName;
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "StudentVo [sId=" + sId + ", sName=" + sName + ", cId=" + cId + ", cName=" + cName + ", tId=" + tId
				+ ", tName=" + tName + "]";
	}
	
	
}
