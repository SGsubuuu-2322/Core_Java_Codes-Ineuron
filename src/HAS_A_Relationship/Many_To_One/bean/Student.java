package HAS_A_Relationship.Many_To_One.bean;

public class Student {

	private String stdName;
	private String stdId;
	private String stdAddr;
	
//	Has-A Variable...
	public Branch branch;
	
//	public void getBranch() {
//		System.out.println("Branch Name : " + branch.getbName());
//		System.out.println("Branch Id : " + branch.getbId());
//	}
	public Branch getBranch(){
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdAddr() {
		return stdAddr;
	}
	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}
	
	
	
	
	
}
