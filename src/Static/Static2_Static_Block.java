package Static;
import java.util.*;

class Static{
	static{
		System.out.println("Now, i'm in the static block");
	}
	
	public Static(){
		System.out.println("This is constructor running due to its class instantiation...");
	}
}

public class Static2_Static_Block {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for illustrating the static block feature in java...");
		Static st = new Static();
	}

}
