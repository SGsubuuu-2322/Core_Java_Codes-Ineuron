package String;
import java.util.*;

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for checking your entered string is palindrome or not...");
		System.out.println("So, enter a string :- ");
		String str = ip.nextLine();
		String temp = str;
		int flag = 1;
		for(int i = 0, j = temp.length()-1; i < str.length(); i++, j--){
			if(str.charAt(i) != temp.charAt(j)){
				flag = -1;
				break;
			}
		}
		if(flag == 1)
			System.out.println("Yes, your entered string is palindrome string...");
		else
			System.out.println("No, your entered String isn't palindrome string...");

	}

}
