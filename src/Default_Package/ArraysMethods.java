package Default_Package;
import java.util.*;

public class ArraysMethods {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program to play arround some of the cool methods of Arrays class...");
		System.out.println("So, enter the length of the array you want to create :- ");
		int len = ip.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter the number you want to store in every index of your array :- ");
		int num = ip.nextInt();
		
		Arrays.fill(arr, num);
		
		System.out.println("So, your array is as follows :- ");
		for(int elem:arr)
			System.out.print(elem + " ");
		
		System.out.println();
		
		Arrays.fill(arr, 1, 4, 6);
		for(int elem:arr)
			System.out.print(elem + " ");
		
		System.out.println();
		
		int[] arr1 = {0,10,3,9,6,4,2,1};
		System.out.println("Your array before sorting...");
		for(int elem:arr1)
			System.out.print(elem + " ");
		System.out.println();
		
		
		
		System.out.println("Your array after Sorting...");
		Arrays.sort(arr1);
		for(int elem:arr1)
			System.out.print(elem + " ");
		
		System.out.println();
		
		int res = Arrays.binarySearch(arr1, 11);
		System.out.println(res);
		
		

	}

}
