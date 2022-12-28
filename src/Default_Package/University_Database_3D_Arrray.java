package Default_Package;

import java.util.Scanner;

public class University_Database_3D_Arrray {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Hello and Welcome Sir/Madam! to our program of Maintaining the University Database!!!!...");
		System.out.println("Now, enter the number of colleges that are under your Technical University :-");
		int num_col = ip.nextInt();
		int [][][]arr = new int[num_col][][];
		System.out.println("Now, Enter the number of technical branches, each college have :- ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter the number of technical branches for college." + (i+1) + " : ");
			int num_bran = ip.nextInt();
			arr[i] = new int[num_bran][];
			System.out.println("And, now enter the number of students for each technical branch  have:- ");
			for(int j = 0; j < arr[i].length; j++){
				System.out.print("Enter the number of students for technical branch." + (j+1) + " :- ");
				int num_st = ip.nextInt();
				arr[i][j] = new int[num_st];
				System.out.println("And, now just enter the total marks that each student has secured from each branch :- ");
				for(int k = 0; k < arr[i][j].length; k++){
					System.out.print("Now, enter the marks for student." + (k+1) + " from branch_no." + (j+1) + " :- ");
					arr[i][j][k] = ip.nextInt();
					System.out.println();
				}
				
			}
			
		}
		System.out.println("Okay! now you'hv entered all the data, so now just have a look upon all your entered details :-");
		System.out.println("So, there are total " + num_col + " colleges having irregular number of branches...");
		for(int i = 0; i < arr.length; i++){
			System.out.println("So, the technical branches for college." + (i+1) + " is :- " + arr[i].length );
			for(int j = 0; j < arr[i].length; j++){
				System.out.println("And, now for college." + (i+1) + " and branch." + (j+1) + " the no. of students are - " + arr[i][j].length);
				System.out.println("And, the marks of the students are as follows...");
				for(int k = 0; k < arr[i][j].length; k++){
					System.out.println("The marks for the student_no." + (k+1) + " is :- " + arr[i][j][k]);
				}
			}
		}

	}

}