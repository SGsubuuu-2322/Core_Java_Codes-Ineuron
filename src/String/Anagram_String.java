package String;
import java.util.*;

public class Anagram_String {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for checking your entered two strings are anagram or not...");
		System.out.println("So, enter your 1st string :- ");
		String str1 = ip.nextLine();
		System.out.println("Now, enter your 2nd string :- ");
		String str2 = ip.nextLine();
		int check1 = 1;
		for(int i = 0; i < str1.length(); i++){
			char temp = str1.charAt(i);
			int check2 = -1;
			for(int j = 0; j < str2.length(); j++){
				if(str2.charAt(j) == temp){
					check2 = 1;
					break;
				}
			}
			if(check2 == 1){
				continue;
			}
			else{
				check1 = -1;
				break;
			}
		}
		if(check1 == 1)
			System.out.println("Yes, your both the entered strings are anagrams...");
		else
			System.out.println("No, your both the entered strings aren't anagrams...");

	}

}
