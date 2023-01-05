package String;
import java.util.*;

public class Panagram_String {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for checking your entered string is panagram or not...");
		System.out.println("So, kindly enter a string :- ");
		String str = ip.nextLine();
		str = str.toLowerCase();
		str = str.replace(" ", "");
		int flag1 = -1;
		for(int i = 97; i < 123; i++){
			char temp = (char)i;
			int flag = -1;
			for(int j = 0; j < str.length(); j++){
				if(temp == str.charAt(j)){
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				flag1 = 1;
				continue;
			}
			else {
				flag1 = -1;
				break;
			}
		}
		if(flag1 == 1)
			System.out.println("Yes, your entered string is a panagram...");
		else
			System.out.println("No, your entered string isn't a panagram...");

	}

}
