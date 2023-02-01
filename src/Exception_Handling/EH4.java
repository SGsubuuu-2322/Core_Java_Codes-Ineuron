package Exception_Handling;

import java.util.Scanner;

public class EH4 {

	public static void main(String[] args) {
		System.out.println("Welcome!!! sir/ma'am to our program...");
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, result = 0;
		
		try{
			
			System.out.println("Enter the 1st number for the integral division :- ");
			num1 = sc.nextInt();
			System.out.println("Enter the 2nd number for the integral division :- ");
			num2 = sc.nextInt();
			
			System.out.println();
			
			result = num1/num2;
		}catch(ArithmeticException ae){
			System.out.println("Please enter a non-zero number...");
		}
		
		int[] arr = new int[0];
		
		try{
			System.out.println();
			System.out.println("Enter the length of your array :- ");
			int len = sc.nextInt();
			arr = new int[len];
		}
		catch(NegativeArraySizeException ng){
			System.out.println("You've entered the negative size  for your array...");
		}
		
		int elem = 0;
		int pos = 0;
		
		try{
			
			System.out.println("Enter the element you want to push in your array :- ");
			elem = sc.nextInt();
			System.out.println("Enter the position or the index in you want to push it :- ");
			pos = sc.nextInt();
			
			arr[pos] = elem;
			
		}
		catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("You're accessing the out of the bound of your array...");
		}
		catch(Exception e){
			System.out.println("You've entered a wrong input...");
		}
		
		
		System.out.println("So the element in your array position is : " + arr[pos]);
		System.out.println("And, the result for integral dvision is : " + num1 + "/" + num2 + " : " + result);
			
		System.out.println("Program has ended normally...");


	}

}
