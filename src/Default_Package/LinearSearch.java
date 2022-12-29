package Default_Package;
import java.util.*;

public class LinearSearch {
	
	public static void linearSearch(int[] arr, int num){
		
		int flag = -1;
		int index = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(num == arr[i]){
				flag = 1;
				index = i;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("Yes, its present in your array at " + index + "th index...");
		else
			System.out.println("No, its not present in your array...");
	}
	
	public static int[] inputArray(Scanner ip){
		System.out.println("So, enter the length of the array you want to create :- ");
		int len = ip.nextInt();
		int[] arr = new int[len];
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, enter the element for index-" + i + "th :- ");
			arr[i] = ip.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner  ip = new Scanner(System.in);
		System.out.println("This is the program for searching your desired number in your entered array through linear search...");
		int[] arr = inputArray(ip);
		printArray(arr);
		
		System.out.println("Now, enter the number you want to search in your entered array :- ");
		int num = ip.nextInt();
		linearSearch(arr, num);
		

	}

}
