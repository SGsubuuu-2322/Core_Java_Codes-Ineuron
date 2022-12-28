package Default_Package;

import java.util.Scanner;
public class Array_Input {

	public static void main(String[] args) {

				Scanner ip = new Scanner(System.in);
				System.out.println("Enter the number of students you'hv in your classrooms :- ");
				int num = ip.nextInt();
				int arr[] = new int[num];
				for(int i = 0; i < arr.length; i++) {
					System.out.println("Enter the marks for the student having rollno." +  (i+1) + " :- ");
					arr[i] = ip.nextInt();
				}
				System.out.println("According to your entered data , all the details are as follows :- ");
				for(int i = 0; i < arr.length; i++){
					System.out.print("the marks for the student having roll-no." + (i+1) + " : ");
					System.out.println(arr[i]);

		        }

	}

}
