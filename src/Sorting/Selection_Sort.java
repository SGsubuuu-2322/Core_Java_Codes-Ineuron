package Sorting;
import java.util.*;

public class Selection_Sort {
	
	public static void selectionSort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int small = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[small] > arr[j]){
					small = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[small];
			arr[small] = temp;
			
		}
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
		Scanner ip  = new Scanner(System.in);
		System.out.println("This is the program for sorting your entered array through Selection-Sort technique...");
		int[] arr = inputArray(ip);
		System.out.println("This is your array as you'hv entered in unsorted manner :- ");
		printArray(arr);
		System.out.println("This is your array after using Selection Sort technique on your array :- ");
		selectionSort(arr);
		printArray(arr);

	}

}
