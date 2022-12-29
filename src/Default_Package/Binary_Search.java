package Default_Package;
import java.util.*;

public class Binary_Search {
	
	public static void binarySearch(int[] arr, int num){
		int si = 0, ei = arr.length-1;
		int mid = 0;
		
		int flag = -1, index = 0;
		
		while(si <= ei) {
			mid = (si+ei)/2;
			if(arr[mid] < num){
				si = mid+1;
			}
			else if(arr[mid] > num){
				ei = mid-1;
			}
			else if(arr[mid] == num){
				flag = 1;
				index = mid;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("Yes, your desired number is present in your entered array at " + index + "th index...");
		else
			System.out.println("No, your desired number isn't present in your entered array...");
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
		System.out.println("This is the program for finding your desired number in your entered array through binary search...");
		int[] arr = inputArray(ip);
		printArray(arr);
		System.out.println("Now, enter the number you want to search in your entered array :- ");
		int num = ip.nextInt();
		binarySearch(arr, num);

	}

}
