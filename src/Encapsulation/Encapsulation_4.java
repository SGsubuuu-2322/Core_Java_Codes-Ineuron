package Encapsulation;
import java.util.*;

class Student1{
	
	private String name;
	private int age;
	private int std;
	private char sec;
	private int rollNo;
	
	public Student1(){
		name = "SG";
		age = 23;
		std = 15;
		sec = 'A';
		rollNo = 2322;
	}
	
	public Student1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Student1(char sec, int rollNo){
		this.sec = sec;
		this.rollNo = rollNo;
	}
	
	public Student1(int std){
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

public class Encapsulation_4 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for illustrating constructor overloading...");
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
		
		System.out.println("Now, its time to play with the topic Constructor Overloading...");
		
		System.out.println("Here nothing passed as arguments to the object constructor :- ");
		Student1 st1 = new Student1();
		System.out.println("Now, its time to access those datas that you'hv entered just before :- ");
		System.out.println("So, your name must be " + st1.getName());
		System.out.println("And, your age must be " + st1.getAge());
		System.out.println("And, your std must be " + st1.getStd());
		System.out.println("And, your section must be " + st1.getSec());
		System.out.println("And, your rollNo. must be " + st1.getRollNo());
		
		System.out.println("Here name and age passed as arguments to the object constructor :- ");
		Student1 st2 = new Student1(name, age);
		System.out.println("Now, its time to access those datas that you'hv entered just before :- ");
		System.out.println("So, your name must be " + st2.getName());
		System.out.println("And, your age must be " + st2.getAge());
		System.out.println("And, your std must be " + st2.getStd());
		System.out.println("And, your section must be " + st2.getSec());
		System.out.println("And, your rollNo. must be " + st2.getRollNo());
		
		System.out.println("Here section and rollno passed as arguments to the object constructor :- ");
		Student1 st3 = new Student1(sec, rollNo);
		System.out.println("Now, its time to access those datas that you'hv entered just before :- ");
		System.out.println("So, your name must be " + st3.getName());
		System.out.println("And, your age must be " + st3.getAge());
		System.out.println("And, your std must be " + st3.getStd());
		System.out.println("And, your section must be " + st3.getSec());
		System.out.println("And, your rollNo. must be " + st3.getRollNo());
		
		System.out.println("Here only std passed as arguments to the object constructor :- ");
		Student1 st4 = new Student1(std);
		System.out.println("Now, its time to access those datas that you'hv entered just before :- ");
		System.out.println("So, your name must be " + st4.getName());
		System.out.println("And, your age must be " + st4.getAge());
		System.out.println("And, your std must be " + st4.getStd());
		System.out.println("And, your section must be " + st4.getSec());
		System.out.println("And, your rollNo. must be " + st4.getRollNo());
		
		

	}

}
