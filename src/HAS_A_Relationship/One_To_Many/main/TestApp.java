package HAS_A_Relationship.One_To_Many.main;

import HAS_A_Relationship.One_To_Many.bean.Department;
import HAS_A_Relationship.One_To_Many.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		Employee[] employee = new Employee[5];
		
		Employee emp1 = new Employee("Laxman", "63677", "manitara");
		Employee emp2 = new Employee("Satyajit", "2143", "Nagar");
		Employee emp3 = new Employee("Susant", "122121", "Badhrak");
		Employee emp4 = new Employee("Subhra", "433232", "Baleswar");
		Employee emp5 = new Employee("Anil", "34212", "Pirahata");
		
		employee[0] = emp1;
		employee[1] = emp2;
		employee[2] = emp3;
		employee[3] = emp4;
		employee[4] = emp5;
		
		
		Department dept = new Department("SGsubuu", "232214", employee);
		dept.getDeptDetails();

	}

}
