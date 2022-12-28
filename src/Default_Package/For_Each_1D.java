package Default_Package;
import java.util.*;

public class For_Each_1D {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for entering an array and then printing that array through For-Each loop concept :- ");
		System.out.println("So, enter the length for your array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter the element for index-no." + i + " : ");
			arr[i] = ip.nextInt();
		}
		
		System.out.println("So, your entered array is as follows :- ");
		System.out.print("[");
		for(int elem:arr){
			System.out.print(elem + " ");
			
		}
		System.out.print("]");
	}

}
