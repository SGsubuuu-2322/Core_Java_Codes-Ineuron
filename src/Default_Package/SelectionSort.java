package Default_Package;
import java.util.*;

public class SelectionSort {
	
	public static void selectionSort(int[] arr){
		for(int i = 0; i < )
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
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for sorting your entered array through Selection-Sort technique...");
		int[] arr = inputArray(ip);
		System.out.println("This is your array as you'hv entered in unsorted manner :- ");
		printArray(arr);
		System.out.println("This is your array after using Bubble Sort technique on your array :- ");
		selectionSort(arr);
		printArray(arr);

	}

}
