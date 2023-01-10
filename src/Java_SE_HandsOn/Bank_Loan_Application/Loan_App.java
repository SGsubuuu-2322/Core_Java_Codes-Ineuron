package Java_SE_HandsOn.Bank_Loan_Application;
import java.util.*;

public class Loan_App {
	
	public static Scanner ip = new Scanner(System.in);

	public boolean checkEligibility(int age){
		boolean res = false;
		if(age >= 20){
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	public void disPlay(boolean res, String name){
		if(res == true){
			System.out.println("Congratulaions!!!" + " Mr/Mrs." + name + " You're perfectly eligible for this loan :):):) ");
		}
		else {
			System.out.println("Sorry!!!" + " Mr/Mrs." + name + " You're not eligible for this loan :):):) ");
		}
	}
    public void checkSancetionedAmount(){
		
		System.out.println("You can sanctioned amount of about ......");
	}
    
    public void loanCalculator(long dA, int choice){
    	System.out.println("Now, enter the time period for which you want to take this amount :- ");
    	float tP = ip.nextFloat();
    	if(choice == 1){
    		double sI = (dA*tP*6.1)/100;
    		System.out.println("So, according to your data your annual interest for this 'Personal-Loan' will be RS - " + sI + "-/");
    	}
    	else if(choice == 2){
    		double sI = (double)(dA*tP*2.5)/100;
    		System.out.println("So, according to your data your annual interest for this 'Educational-Loan' will be RS - " + sI + "-/");
    	}
    	else if(choice == 3){
    		double sI = (double)(dA*tP*6.5)/100;
    		System.out.println("So, according to your data your annual interest for this 'Home-Loan' will be RS - " + sI + "-/");
    	}
    	else {
    		double sI = (double)(dA*tP*6.9)/100;
    		System.out.println("So, according to your data your annual interest for this 'Car-Loan' will be RS - " + sI + "-/");
    	}
    }
	
 
	
	
}
