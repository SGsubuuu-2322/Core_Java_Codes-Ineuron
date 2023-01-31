package Exception_Handling;

import java.util.Scanner;

public class EH2 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		try{
			System.out.println("Hello Sir/Ma'am welcome to our program of division...");
			System.out.println("So, enter your 1st number :- ");
			int num1 = ip.nextInt();
			System.out.println();
			System.out.println("Now, enter your 2nd number :- ");
			int num2 = ip.nextInt();
			
			int result = num1/num2;
			
			System.out.println("So , the result for yuor division " + num1 + "/" + num2 + " : " + result);

		}
		catch(Exception e) {
			System.out.println("So, A arithmatic error has been occured due to your second input as 0...Better Luck Next Time...");
			
		}
		
		System.out.println("Program ends Smoothly....");
	}

}
