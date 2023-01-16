package HAS_A_Relationship.One_To_One.bean;

//Target Code...
public class Employee {

	
	private String eId;
	private String eName;
	private String eaddr;
	
//	Has-A RelationShip
	Account account;

    public Employee(String eId, String eName, String eaddr, Account account) {
    	
	    super();
	    this.eId = eId;
	    this.eName = eName;
	    this.eaddr = eaddr;
	    this.account = account;
    }
    
    public void getEmployDetails(){
    	System.out.println("Employee details are : ");
    	System.out.println("EmployId : " + eId);
    	System.out.println("EmployName : " + eName);
    	System.out.println("EmployAddr : " + eaddr);
    	System.out.println("==================================");
    	System.out.println("Account No. is: " + account.accNo);
    	System.out.println("Account name is: " + account.accName);
    	System.out.println("Account type is: " + account.accType);
//    	System.out.println("EmployAccountDetails are: ");
    	
    }
	
	
 
}
