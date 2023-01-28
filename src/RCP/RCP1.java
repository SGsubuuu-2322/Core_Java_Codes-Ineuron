package RCP;

class Student{

	static {
		System.out.println("static block is running after class loading...");
	}
	
	public Student(){
		System.out.println("Student class constructor is called...");
	}
	
	public void metHod(){
		System.out.println("fsdgf");
	}
	
	
}

public class RCP1 {

	public static void main(String[] args)throws ClassNotFoundException {
		
		String className = args[0];
		Class c = Class.forName(className);

	}

}
