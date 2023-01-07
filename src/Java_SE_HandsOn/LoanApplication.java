package Java_SE_HandsOn;
import java.util.*;

class Farmer{
	private String name;
	private long pA;
	private double dR;
	private final double rI = 3.5;
	Scanner ip = new Scanner(System.in);
	double sI;
	
	
	
	public void inputData(){
		System.out.println("So, kindly enter your name :- ");
		name = ip.nextLine();
		System.out.println("Now, enter the Amount for your loan :- ");
		pA = ip.nextInt();
		System.out.println("Now, enter the duration till which you want to take the loan :- ");
		dR = ip.nextDouble();
	}
	
	public void computeLoan(){
		sI = (pA*dR*rI)/100;
	}
	
	public void displayData(){
		System.out.println("So, Mr." + name + " your total interest will be :-" + sI);
	}
}

public class LoanApplication {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Welcome to the Goverment Loan Application :):):)");
		System.out.println("So, enter 1 for applying this Loan, otherwise -1 to exit :- ");
		int ch = ip.nextInt();
		if(ch == 1){
			System.out.println("Now, kindly enter your age :- ");
			int age = ip.nextInt();
			if(age >= 20){
				System.out.println("You're perfectly eligible for this scheme...");
				System.out.println("So, enter 1 for further proceedings if you want otherwise -1 to exit...");
				int choice = ip.nextInt();
				while(choice == 1){
					Farmer farm = new Farmer();
					farm.inputData();
					farm.computeLoan();
					farm.displayData();
					
					System.out.println("So, if you want to use this application again then enter 1.Otherwise, enter -1 :- ");
					choice = ip.nextInt();
					if(choice == 1){
						System.out.println("Now, kindly enter your age :- ");
						age = ip.nextInt();
						if(age >= 20)
						    continue;
						else{
							System.out.println("Sorry, you're not eligible for this scheme...BETTER LUCK NEXT TIME :):(");
							break;
						}
					}
					else
						break;
				}
			}
			else {
				System.out.println("Sorry, you're not eligible for this scheme...BETTER LUCK NEXT TIME :):(");
			}
		}
		System.out.println("Thanks!!!! and visit us again :):):)");
	}

}
