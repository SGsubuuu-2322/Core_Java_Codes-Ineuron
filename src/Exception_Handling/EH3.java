package Exception_Handling;

import java.util.Scanner;

public class EH3 {

	public static void main(String[] args) {
		System.out.println("Welcome!!! sir/ma'am to our program...");
		Scanner sc = new Scanner(System.in);
		
		try{
			
			System.out.println("Enter the 1st number for the integral division :- ");
			int num1 = sc.nextInt();
			System.out.println("Enter the 2nd number for the integral division :- ");
			int num2 = sc.nextInt();
			
			System.out.println();
			
			int result = num1/num2;
			
			System.out.println();
			System.out.println("Enter the length of your array :- ");
			int len = sc.nextInt();
			int[] arr = new int[len];
			System.out.println("Enter the element you want to push in your array :- ");
			int elem = sc.nextInt();
			System.out.println("Enter the position or the index in you want to push it :- ");
			int pos = sc.nextInt();
			
			arr[pos] = elem;
			
			System.out.println("So the element in your array position is : " + arr[pos]);
			System.out.println("And, the result for integral dvision is : " + num1 + "/" + num2 + " : " + result);
			
			
			
		}catch(ArithmeticException ae){
			System.out.println("Please enter a non-zero number...");
			
		}catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("You're accessing the out of the bound of your array...");
		}
		catch(NegativeArraySizeException ng){
			System.out.println("You've entered the negative size  for your array...");
		}
		catch(Exception e){
			System.out.println("You've entered a wrong input...");
		}
		System.out.println("Program has ended normally...");

	}

}
