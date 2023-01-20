package HAS_A_Relationship.Many_To_Many.main;

import HAS_A_Relationship.Many_To_Many.bean.Course;
import HAS_A_Relationship.Many_To_Many.bean.Student;

public class TestApp {

	public static void main(String[] args) {
		Course cr1 = new Course("Java", "2322", "12000");
		Course cr2 = new Course("Python", "2223", "10000");
		Course cr3 = new Course("C++", "232214", "9000");
		
		Course[] course = new Course[3];
		course[0] = cr1;
		course[1] = cr2;
		course[2] = cr3;
		
		Student std1 = new Student("Laxman", "061", "Ganjam", course);
		Student std2 = new Student("Satyajit", "071", "Puri", course);
		Student std3 = new Student("S.Panda", "035", "Nayagad", course);
		Student std4 = new Student("Sushant", "021", "Bhadrak", course);
		
		
		System.out.println("Student-1 Details are :- ");
		System.out.println("======================");
		System.out.println("Student Name : " + std1.getStdName());
		System.out.println("Student Id : " + std1.getStdId());
		System.out.println("Student Address : " + std1.getStdAddr());
		System.out.println();
		std1.getCourse();
		
		System.out.println();
		
		System.out.println("Student-2 Details are :- ");
		System.out.println("======================");
		System.out.println("Student Name : " + std2.getStdName());
		System.out.println("Student Id : " + std2.getStdId());
		System.out.println("Student Address : " + std2.getStdAddr());
		System.out.println();
		std2.getCourse();
		
        System.out.println();
		
		System.out.println("Student-3 Details are :- ");
		System.out.println("======================");
		System.out.println("Student Name : " + std3.getStdName());
		System.out.println("Student Id : " + std3.getStdId());
		System.out.println("Student Address : " + std3.getStdAddr());
		System.out.println();
		std3.getCourse();
		
        System.out.println();
		
		System.out.println("Student-4 Details are :- ");
		System.out.println("======================");
		System.out.println("Student Name : " + std4.getStdName());
		System.out.println("Student Id : " + std4.getStdId());
		System.out.println("Student Address : " + std4.getStdAddr());
		System.out.println();
		std4.getCourse();

	}

}
