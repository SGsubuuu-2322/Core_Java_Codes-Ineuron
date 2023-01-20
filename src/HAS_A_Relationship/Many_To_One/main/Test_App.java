package HAS_A_Relationship.Many_To_One.main;

import HAS_A_Relationship.Many_To_One.bean.Branch;
import HAS_A_Relationship.Many_To_One.bean.Student;

public class Test_App {

	public static void main(String[] args) {
		Branch br = new Branch();
		br.setbName("CSE");
		br.setbId("232214");
		
		
		Student std1 = new Student();
		std1.setBranch(br);
		std1.setStdName("Laxman");
		std1.setStdId("061");
		std1.setStdAddr("Ganjam");
		
		
		Student std2 = new Student();
		std2.setBranch(br);
		std2.setStdName("Satyajit");
		std2.setStdId("071");
		std2.setStdAddr("Kakatpur");
		
		System.out.println("Student details are :- ");
		System.out.println("=====================================");
		
		
		System.out.println("Student-1 details are as follows : ");
		System.out.println("Student Name : " + std1.getStdName());
		System.out.println("Student Id : " + std1.getStdId());
//		std1.getBranch();
		System.out.println("Student Branch Name : " + std1.getBranch().getbName());
		System.out.println("Student Branch Id : " + std1.getBranch().getbId());
		System.out.println("Student Address : " + std1.getStdAddr());
		
		System.out.println();
		
		System.out.println("Student-2 details are as follows : ");
		System.out.println("Student Name : " + std2.getStdName());
		System.out.println("Student Id : " + std2.getStdId());
//		std2.getBranch();
		System.out.println("Student Branch Name : " + std1.getBranch().getbName());
		System.out.println("Student Branch Id : " + std1.getBranch().getbId());
		System.out.println("Student Address : " + std2.getStdAddr());
		
		

	}

}
