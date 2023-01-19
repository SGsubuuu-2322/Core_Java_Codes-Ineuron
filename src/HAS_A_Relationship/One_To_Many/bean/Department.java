package HAS_A_Relationship.One_To_Many.bean;

public class Department {
// Target Class.
	
	private String deptName;
	private String deptId;
	
	Employee[] employee;

	public Department(String deptName, String deptId, Employee[] employee) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
		this.employee = employee;
	}
	
	public void getDeptDetails(){
		System.out.println("Department details are as follows : ");
		System.out.println("Department name is : " + deptName);
		System.out.println("Department Id is : " + deptId);
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		
		int i = 1;
		
		for(Employee employe : employee){
			System.out.println("Employee-" + i + " details are :- ");
			i++;
			System.out.println("Employee name is : " + employe.eName);
			System.out.println("Employee Id is : " + employe.eId);
			System.out.println("Employee Address is : " + employe.eADD);
			System.out.println();
		}
	}
}
