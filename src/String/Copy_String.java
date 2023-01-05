package String;
import java.util.*;

public class Copy_String {

	public static void main(String[] args) {
		String str1 = new String("SGsubuu");
		String str2 = "";

		for(int i = 0; i < str1.length(); i++){
			str2 += str1.charAt(i);
		}
//		str2 += str1;
		
		System.out.println("Your first string is " + str1);
		System.out.println("And, your second string is " + str2);

	}

}
