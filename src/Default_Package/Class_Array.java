package Default_Package;

import java.util.Scanner;

class Fan{
	public int num;
	public char code;
	public Float real_num;
}


public class Class_Array {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Fan [] arr = new Fan[3];
		arr[0] = new Fan();
		arr[1] = new Fan();
		arr[2] = new Fan();
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter the details for Objects :- ");
			System.out.println("Enter the number for Object-No." + (i+1) + " : ");
			arr[i].num = ip.nextInt();
			System.out.println("Enter the Character code for Object-No." + (i+1) + " : ");
			arr[i].code = ip.next().charAt(0);
			System.out.println("Enter the Decimal number for Object-No." + (i+1) + " : ");
			arr[i].real_num = ip.nextFloat();
		}
		System.out.println("So, as you'hv entered all the data for each object \n So, the time has came to have a look upon it...");
		for(int i = 0; i < arr.length; i++){
			System.out.println("The details of Object_No." + (i+1) + " are as follows :-");
			System.out.println("The Integer number in Object_No." + (i+1) + " is : " + arr[i].num);
			System.out.println("The Character Code in Object_No." + (i+1) + " is : " + arr[i].code);
			System.out.println("The Floating point Decimal number in Object_No." + (i+1) + " is : " + arr[i].real_num);
		}

	}

}