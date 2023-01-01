package Sorting;
import java.util.*;

public class Quick_Sort {
	
	public static int partition(int[] arr, int si, int ei){
		int pivotElement = arr[si];
		
		int count = 0;
		for(int i = si+1; i <= ei; i++){
			if(pivotElement >= arr[i])
				count++;
		}
		int pivotIndex = count+si;
		
		int pivot = arr[pivotIndex];
		arr[pivotIndex] = pivotElement;
		arr[si] = pivot;
		
		int i = si;
		int j = ei;
		
		while(i < pivot && j > pivot){
			while(arr[i] < arr[pivotIndex]){
				i++;
			}
			while(arr[j] > arr[pivotIndex]){
				j--;
			}
			
			if(i < pivotIndex && j > pivotIndex){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
		
	}
	
	
	public static void quickSort(int[] arr, int si, int ei){
		if(si >= ei)
			return;
		
		int pivotIndex = partition(arr, si, ei);
		
		quickSort(arr, si, pivotIndex-1);
		quickSort(arr, pivotIndex+1, ei);
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
		System.out.println("This is the program for sorting your entered array through Merge-Sort technique...");
		int[] arr = inputArray(ip);
		System.out.println("This is your array as you'hv entered in unsorted manner :- ");
		printArray(arr);
		System.out.println("This is your array after using Quick-Sort technique on your array :- ");
		quickSort(arr, 0, arr.length-1);
		printArray(arr);

	}

}
