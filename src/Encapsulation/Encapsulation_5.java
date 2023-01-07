package Encapsulation;
import java.util.*;

class Student2{
	
	private String name;
	private int age;
	private int std;
	private char sec;
	private int rollNo;
	public Student2(){
		this("SG", 23, 15, 'A', 2322);
	}
	
	public Student2(String name, int age, int std, char sec, int rollNo){
		
		this(name, age);
		
//		this(sec, rollNo);
//		
//		this(std);
		
	}
	
	public Student2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Student2(char sec, int rollNo){
		this.sec = sec;
		this.rollNo = rollNo;
	}
	
	public Student2(int std){
		this.std = std;
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

public class Encapsulation_5 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for illustrating the concept of Constructor chaining...");
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
		
		System.out.println("Now, its time to play with the topic Constructor Chaining...");
		Student2 st1 = new Student2();
		System.out.println("Now, its time to access those datas that you'hv entered just before :- ");
		System.out.println("So, your name must be " + st1.getName());
		System.out.println("And, your age must be " + st1.getAge());
		System.out.println("And, your std must be " + st1.getStd());
		System.out.println("And, your section must be " + st1.getSec());
		System.out.println("And, your rollNo. must be " + st1.getRollNo());
		
	}

}
