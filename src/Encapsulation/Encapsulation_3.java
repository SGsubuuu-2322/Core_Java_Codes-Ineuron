package Encapsulation;
import java.util.*;


class Student{
	
	private String name;
	private int age;
	private int std;
	private char sec;
	private int rollNo;

	public Student(String name, int age, int std, char sec, int rollNo){
	
		this.name = name;
		this.age = age;
		this.std = std;
		this.sec = sec;
		this.rollNo = rollNo;
		
	}
	
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getStd() {
		return std;
	}

	public char getSec() {
		return sec;
	}

	public int getRollNo() {
		return rollNo;
	}

	
	
	
}

public class Encapsulation_3 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for illustrating of constructors...");
		System.out.println("So, Enter your name :- ");
		String name = ip.nextLine();
		System.out.println("Now, enter your age :- ");
		int age = ip.nextInt();
		System.out.println("Now, enter your std :- ");
		int std = ip.nextInt();
		System.out.println("Now, enter your section :- ");
		char sec = ip.next().charAt(0);
		System.out.println("Now, enter your rollNo :- ");
		int rollNo = ip.nextInt();
		
		Student st = new Student(name, age, std, sec, rollNo);
		
		System.out.println("Now, its time to access those datas that you'hv entered just before :- ");
		System.out.println("So, your name must be " + st.getName());
		System.out.println("And, your age must be " + st.getAge());
		System.out.println("And, your std must be " + st.getStd());
		System.out.println("And, your section must be " + st.getSec());
		System.out.println("And, your rollNo. must be " + st.getRollNo());

	}

}
