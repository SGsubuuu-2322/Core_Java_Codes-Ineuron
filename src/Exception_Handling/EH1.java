package Exception_Handling;

import java.util.Scanner;

public class EH1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome! To our program...");
		System.out.println("So, enter your 1st number :- ");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.println("And, now enter your second number :- ");
		int num2 = sc.nextInt();
		int result = num1/num2;
		System.out.println("Now, the result is for your " + num1 + "/" + num2 + " : " + result);
		

	}

}
