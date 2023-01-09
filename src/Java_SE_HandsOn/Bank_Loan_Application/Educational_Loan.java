package Java_SE_HandsOn.Bank_Loan_Application;
import java.math.*;

public class Educational_Loan extends Loan_App{

	private static int perc10;
	private static int perc12;
	private static char ch;
	private static long distance;
	private static long sanctionAmt;

	public boolean checkEligibility(int age){
		boolean res = false;
		System.out.println("Enter your 10th percentage :- ");
		float perc = ip.nextFloat();
		int perc10 = Math.round(perc);
		System.out.println("Enter your 12th percentage :- ");
		float per = ip.nextFloat();
		int perc12 = Math.round(per);
		System.out.println("Now, enter your College type - 'G' for Government and 'P' for Private :- ");
		ch = ip.next().charAt(0);
		System.out.println("Now,enter the distance(in KMs) between this bank and your home :- ");
		double dis = ip.nextDouble();
		distance = Math.round(dis);
		if((age >= 19 && age <= 25) && (ch == 'G' || ch == 'g') && distance <= 25 && (perc10 >= 70) && (perc12 >= 60)){
			res = true;
		}
		else if((age >= 19 && age <= 25) && (ch == 'P' || ch == 'p') && distance <= 15 && (perc10 >= 75) && (perc12 >= 65)){
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	public void checkSancetionedAmount(){
		
		if(ch == 'G' || ch == 'g'){
			System.out.println("So, you can be sanctioned money of about RS - " + forGovtStd() + "-/");
		}
		else {
			System.out.println("So, you can be sanctioned money of about RS - " + forPrivtStd() + "-/");
		}
	}
	
	public long forGovtStd(){
		if((ch == 'G' || ch == 'g') && (perc10 <= 80 && perc12 <= 70) && (distance <= 25) ){
			sanctionAmt = 1000000;
		}
		else if((ch == 'G' || ch == 'g') && (perc10 > 90 && perc12 <= 80) && (distance <= 25) ){
			sanctionAmt = 2000000;
		}
		else{
			sanctionAmt = 30000000;
		}
		return sanctionAmt;
	}
	
	public long forPrivtStd(){
		if((ch == 'P' || ch == 'p') && (perc10 <= 85 && perc12 <= 75) && (distance <= 25) ){
			sanctionAmt = 2000000;
		}
		else if((ch == 'P' || ch == 'P') && (perc10 > 95 && perc12 <= 85) && (distance <= 25) ){
			sanctionAmt = 4000000;
		}
		else{
			sanctionAmt = 60000000;
		}
		return sanctionAmt;
	}
	
}
