package HAS_A_Relationship.One_To_One.main;

import HAS_A_Relationship.One_To_One.bean.Account;
import HAS_A_Relationship.One_To_One.bean.Employee;
import HAS_A_Relationship.One_To_One.bean.Engines;
import HAS_A_Relationship.One_To_One.bean.Models;

public class Test_3 {

	public static void main(String[] args) {
        Account account = new Account("ABC123", "SGsubu", "Savings");
		Employee employe = new Employee("SGsubu2322", "SGsubham", "BBsr", account);
		employe.getEmployDetails();
		
		System.out.println();
		
		Engines engines = new Engines(1999, 1500, 6, 250);
		Models models = new Models("RollsRoyce", "Phantom-vIII", "Merdona-Purple", 120090000);
		models.setEngine(engines);
		models.showDetails();

	}

}
