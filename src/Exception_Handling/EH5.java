package Exception_Handling;

import java.util.Scanner;

public class EH5 {
	
	public void divison(){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		Integer num1 = ip.nextInt();
		System.out.println("Enter the second number : ");
		Integer num2 = ip.nextInt();
		Integer result = num1/num2;
		System.out.println("So, the result for your division :- " + result);
		
	}

	public static void main(String[] args) {
		System.out.println("Program Starts Normally...");
		EH5 eh = new EH5();
		eh.divison();
		System.out.println("Program Ends Normally...");

	}

}
