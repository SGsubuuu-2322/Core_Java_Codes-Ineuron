package Static;
import java.util.*;


class Object{
	public static int count;
	
	public Object() {
		count++;
	}
}

public class Static1_Object_Count {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for saying you the exactly number of times the object will be created...");
		System.out.println("So, enter the number of times you want to create the object  of class Object :- ");
		int num = ip.nextInt();
		Object[] obj = new Object[num];
		for(int i = 0; i < num; i++)
			obj[i] = new Object();
		
		System.out.println("So, without accessing the user data, the total number of object can be said as :- " + Object.count);

	}

}
