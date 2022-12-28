package Default_Package;
import java.util.*;

public class MinandMax_Value {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for finding the minimum and maximum value in your entered array...");
		System.out.println("So, enter the length of your array :- ");
		int len = ip.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, enter the element for index-" + i + "th :- ");
			arr[i] = ip.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int elem:arr){
			if(max < elem)
				max = elem;
			else if(min > elem)
				min = elem;
		}
		
		System.out.println("So, the minimum value in your entered array is : " + max);
		System.out.println("And, the maximum value in your entered array is : " + min);

	}

}
