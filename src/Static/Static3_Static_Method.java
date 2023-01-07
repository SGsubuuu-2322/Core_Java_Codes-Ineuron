package Static;
import java.util.*;

class Static1{
	
	static {
		System.out.println("This is 1st static block...");
	}
	static {
		System.out.println("This is the 2nd static block...");
	}
	public static void disp(){
		System.out.println("This is a static method in Static1 class...");
	}
}

public class Static3_Static_Method {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for illustrating the static method concept...");
		System.out.println("This is the main method block.");
		Static1.disp();

	}

}
