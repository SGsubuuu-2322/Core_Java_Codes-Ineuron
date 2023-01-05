package String;
import java.util.*;

public class Case_Convesion {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is a case conversion program where your entered case will be converted into its alternative case...");
		System.out.println("So, enter a string as per your choice :- ");
		String str = ip.nextLine();
		String str1 = "";
//		for(int i = 0; i < str.length(); i++){
//			char temp = str.charAt(i);
//			if(temp >= 'a' && temp <= 'z'){
//				char temp2 = (char)(temp-32);
//				System.out.print(temp2);
//			}
//			else {
//				char temp3 = (char)(temp+32);
//				System.out.print(temp3);
//			}
//		}
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				str1 += (char)(str.charAt(i)-32);
			}
			else {
				str1 += (char)(str.charAt(i)-32);
			}
		}
		System.out.println(str1);
		System.out.println('a' + 32);

	}

}
