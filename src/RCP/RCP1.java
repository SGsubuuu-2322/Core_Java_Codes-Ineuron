package RCP;


class Student{
	static {
		System.out.println("static block is running after class loading...");
	}
	
	public void metHod(){
		System.out.println("fsdgf");
	}
}

public class RCP1 {

	public static void main(String[] args)throws Exception {
		
		String className = args[0];
		Class c = Class.forName(className);

	}

}
