package HAS_A_Relationship.One_To_One.main;

import HAS_A_Relationship.One_To_One.bean.*;

public class Test_1 {

	public static void main(String[] args) {
		Account account = new Account("ABC123", "SGsubu", "Savings");
		
		Employee employe = new Employee("SGsubu2322", "SGsubham", "BBsr", account);
		
		employe.getEmployDetails();

	}

}
