package Default_Package;
import java.util.*;

public class Addition_Array_Elements {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for adding all the elements of your entered array :- ");
		System.out.println("So, enter the length of your array :- ");
		int len = ip.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, enter the element for index-" + i + "th :- ");
			arr[i] = ip.nextInt();
		}
		
		int sum = 0;
		for(int elem: arr)
			sum += elem;
		System.out.println("So, the total sum for your entered array is :- " + sum);

	}

}
