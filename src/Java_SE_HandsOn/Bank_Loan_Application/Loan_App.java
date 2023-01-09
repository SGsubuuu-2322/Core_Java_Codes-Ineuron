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
			System.out.println("Mr/Mrs." + name + "Congratulaions!!! You're perfectly eligible for this loan service :):):) ");
		}
		else {
			System.out.println("Mr/Mrs." + name + " Sorry!!! you're not eligible for this service(:(:(:Better Luck Next Time(:(:(:");
		}
	}
    public void checkSancetionedAmount(){
		
		System.out.println("You can sanctioned amount of about ......");
	}
	
 
	
	
}
