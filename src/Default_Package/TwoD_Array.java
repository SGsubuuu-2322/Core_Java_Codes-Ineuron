package Default_Package;

import java.util.*;

public class TwoD_Array {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int total_len, no_len;
		System.out.println("Hello And Welcome! Sir/Madam to our program...");
		System.out.println("Enter how many phone numbers you want to store:- ");
		total_len = ip.nextInt();
		int arr[][] = new int[total_len][];
		System.out.println("Now, enter the length for each one of your phone numbers");
		for(int i = 0; i < total_len; i++) {
			System.out.println("Enter the length for your phone-no."+(i+1)+" : ");
			no_len = ip.nextInt();
			arr[i] = new int[no_len];
		}
		System.out.println("Now, enter all your phone numbers accordingly...");
		for(int i = 0; i < total_len; i++) {
			System.out.println("Enter numbers for phone number-"+(i+1)+" :");
			for(int j = 0; j < (arr[i].length); j++) {
				System.out.println("Enter the digit no-"+ (j+1)+ " : ");
				arr[i][j] = ip.nextInt();
			}
		}
		System.out.println("Successfully you'hv entered all your phone-numbers and now just have a sneak peak into your phone directorey : ");
		for(int i = 0; i < total_len; i++) {
			System.out.println("This is your Phone_no."+(i+1)+ " : ");
			for(int j = 0; j < (arr[i].length); j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("\n");
		}
	}

}
