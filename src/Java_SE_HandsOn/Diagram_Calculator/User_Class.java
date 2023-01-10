package Java_SE_HandsOn.Diagram_Calculator;
import java.util.*;

public class User_Class {
	
	

	public static void main(String[] args) {
		int choice = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Hii and Hello to every bachaa loggggg to our 2d-diagram measurement calculator Application :):):)");
		System.out.println("Here we provide the calculations for 2D diagrams like - Square, Rectangle, Circle, Equilateral Triangle, Normal Triangle...");
		while(true){
			System.out.println("So, its time to enter your choice for figure measurement assistance :- ");
			System.out.println("PRESS - '1' for calculations of area and perimeter of a Square...");
			System.out.println("PRESS - '2' for calculations of area and perimeter of a Rectangle...");
			System.out.println("PRESS - '3' for calculations of area and perimeter of a Circle...");
			System.out.println("PRESS - '4' for calculations of area and perimeter of a Equilateral Triangle...");
			System.out.println("PRESS - '5' for calculations of area and perimeter of a Normal Triangle...");
			System.out.println("PRESS - any key to quit this app...");
			choice = ip.nextInt();
			
			Square_Class sc = new Square_Class();
			Rectangle_Class rc = new Rectangle_Class();
			Circle_Class cc = new Circle_Class();
			Equi_Lat_Triangle_Class eltc = new Equi_Lat_Triangle_Class();
			Norm_Triangle_Class ntc = new Norm_Triangle_Class();
			
			Runnable_Class rC = new Runnable_Class();
			
			if(choice == 1){
				rC.runnble(sc);
				System.out.println();
				System.out.println("Now, PRESS-'1' to run this application again orelse, PRESS - any key to stop and quit :-   ");
				choice = ip.nextInt();
				if(choice == 1){
					continue;
				}
				else {
					break;
				}
			}
			else if(choice == 2){
				rC.runnble(rc);
				System.out.println();
				System.out.println("Now, PRESS-'1' to run this application again orelse, PRESS - any key to stop and quit :-   ");
				choice = ip.nextInt();
				if(choice == 1){
					continue;
				}
				else {
					break;
				}
			}
			else if(choice == 3){
				rC.runnble(cc);
				System.out.println();
				System.out.println("Now, PRESS-'1' to run this application again orelse, PRESS - any key to stop and quit :-   ");
				choice = ip.nextInt();
				if(choice == 1){
					continue;
				}
				else {
					break;
				}
			}
			else if(choice == 4){
				rC.runnble(eltc);
				System.out.println();
				System.out.println("Now, PRESS-'1' to run this application again orelse, PRESS - any key to stop and quit :-   ");
				choice = ip.nextInt();
				if(choice == 1){
					continue;
				}
				else {
					break;
				}
			}
			else if(choice == 5){
				rC.runnble(ntc);
				System.out.println();
				System.out.println("Now, PRESS-'1' to run this application again orelse, PRESS - any key to stop and quit :-   ");
				choice = ip.nextInt();
				if(choice == 1){
					continue;
				}
				else {
					break;
				}
			}
			else {
				break;
			}
		}
		System.out.println("Thanks and Use Me again :):):) ");
	}

}
