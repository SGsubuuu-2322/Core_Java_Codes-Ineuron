package Sorting;
import java.util.*;

public class Merge_Sort {
	
	public static void mergeArrays(int[] arr, int[] arr1, int[] arr2){
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] <= arr2[j]){
				arr[k] = arr1[i];
				k++;
				i++;
			}
			else{
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i < arr1.length){
			arr[k] = arr1[i];
			k++;
			i++;
		}
		while(j < arr2.length){
			arr[k] = arr2[j];
			k++;
			j++;
		}
		
		
	}
	
	public static void mergeSort(int[] arr){
		
		if(arr.length <= 1)
			return;
		
		int len1 = arr.length/2;
		int len2 = arr.length - len1;
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		for(int i = 0; i < len1; i++){
			arr1[i] = arr[i];
		}
		for(int j = len1, i = 0; j < arr.length; j++, i++){
			arr2[i] = arr[j];
		}
		
		mergeSort(arr1);
		mergeSort(arr2);
		
		mergeArrays(arr, arr1, arr2);
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
		System.out.println("This is your array after using Merge Sort technique on your array :- ");
		mergeSort(arr);
		printArray(arr);

	}

}
