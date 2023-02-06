package Exception_Handling;

import java.util.Scanner;

public class EH6 {
	
	public void alpha() throws ArithmeticException{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		Integer num1 = ip.nextInt();
		System.out.println("Enter the second number : ");
		Integer num2 = ip.nextInt();
		Integer result = num1/num2;
		System.out.println("So, the result for your division :- " + result);
	}
	
	public void beta()throws ArithmeticException{
		alpha();
	}

	public static void main(String[] args) {
		System.out.println("Program Starts Normally...");
		try {
			EH6 eh = new EH6();
			eh.beta();
		}catch(ArithmeticException ae){
			System.out.println("Exception handled in main throw custom exception handler...");
		}
		System.out.println("Program Ends Normally...");

	}

}
