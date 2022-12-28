package Default_Package;

import java.util.Scanner;

public class Phone_Number_Book_2D_Array {

	public static void main(String[] args) {
		System.out.println("Hello and Welcome Sir/Madam! to our program of Phone Book!!!!!.....");
		System.out.println("Enter the number of phone numbers you want to store :- ");
		Scanner ip = new Scanner(System.in);
		int num_len1 = ip.nextInt();
		int [][] arr = new int[num_len1][];
		System.out.println("Okay! then now you have to enter the length of each of your numbers :- ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the length for your phone number."+(i+1)+" : ");
			int num_len2 = ip.nextInt();
			arr[i] = new int[num_len2];
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("And, now you have to enter the numbers for phone number." + (i+1) + " : ");
			for(int j = 0; j < arr[i].length; j++){
				System.out.println("Enter the digit-" + (j+1) + " for your phone number." + (i+1) + " : ");
                arr[i][j] = ip.nextInt();
			}
		}
		System.out.println("Okay! Now, you'hv entered all the numbers.\n And, all the numbers are given below as per your data");
		for(int i = 0; i < arr.length; i++){
			System.out.print("Phone Number." + (i+1) +  ": ");
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}