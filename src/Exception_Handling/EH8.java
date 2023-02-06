package Exception_Handling;

import java.util.Scanner;

class Alpha{
	
	public void alpha() {
		try
		{
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter the first number : ");
			Integer num1 = ip.nextInt();
			System.out.println("Enter the second number : ");
			Integer num2 = ip.nextInt();
			Integer result = num1/num2;
			System.out.println("So, the result for your division :- " + result);
		}catch(ArithmeticException ae){
			System.out.println("Exception handeled by alpha method...");
		}
		System.out.println("A[pha method ends normally...");
	}
}

public class EH8 {

	public static void main(String[] args) {
		System.out.println("Program Starts Normally...");
		try {
			Alpha eh = new Alpha();
			eh.alpha();
		}catch(ArithmeticException ae){
			System.out.println("Exception handled by main method ...");
		}
		System.out.println("Program Ends Normally...");

	}

}
