package String;
import java.util.*;

public class Reverse_A_String {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program will reverse your entered string...");
		System.out.println("So, enter a string :- ");
		String str = ip.nextLine();
		String str1 = "";
		for(int i = str.length()-1; i >= 0; i--){
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		for(int i = str.length()-1; i >= 0; i--){
			str1 += str.charAt(i);
		}
		System.out.println(str1);

	}

}
