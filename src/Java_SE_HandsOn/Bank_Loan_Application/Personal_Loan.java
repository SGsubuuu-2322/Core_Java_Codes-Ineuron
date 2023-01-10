package Java_SE_HandsOn.Bank_Loan_Application;
import java.math.*;

public class Personal_Loan extends Loan_App{
	
	
	private static char ch;
	private static long salary;
	private static long distance;
	private static long sanctionAmt;

	public boolean checkEligibility(int age){
		boolean res = false;
		System.out.println("Now, enter your job type - 'G' for Goverment and 'P' for Private :- ");
		ch = ip.next().charAt(0);
		System.out.println("Now, enter your annual salary :- ");
		double sal = ip.nextDouble();
		salary = Math.round(sal);
		System.out.println("Now,enter the distance(in KMs) between this bank and your home :- ");
		double dis = ip.nextDouble();
		distance = Math.round(dis);
		if(age >= 22 && (ch == 'G' || ch == 'g') && salary >= 300000 && distance <= 25){
			res = true;
		}
		else if(age >= 25 && (ch == 'P' || ch == 'p') && salary >= 450000 && distance <= 15){
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	public void checkSancetionedAmount(){
		
		if(ch == 'G' || ch == 'g'){
			System.out.println("So, you can be sanctioned money of about RS - " + forGovtEmp() + "-/");
		}
		else {
			System.out.println("So, you can be sanctioned money of about RS - " + forPrivtEmp() + "-/");
		}
	}
	
	public long forGovtEmp(){
		if((ch == 'G' || ch == 'g') && (salary >= 300000 && salary <= 600000) && (distance <= 25) ){
			sanctionAmt = 2500000;
		}
		else if((ch == 'G' || ch == 'g') && (salary > 600000 && salary <= 1200000) && (distance <= 25) ){
			sanctionAmt = 5000000;
		}
		else{
			sanctionAmt = 10000000;
		}
		return sanctionAmt;
	}
	
	public long forPrivtEmp(){
		if((ch == 'P' || ch == 'p') && (salary >= 450000 && salary <= 1000000) && (distance <= 15) ){
			sanctionAmt = 2500000;
		}
		else if((ch == 'P' || ch == 'p') && (salary > 1000000 && salary <= 5000000) && (distance <= 15) ){
			sanctionAmt = 5000000;
		}
		else if((ch == 'P' || ch == 'p') && (salary > 5000000 && salary <= 10000000) && (distance <= 15) ){
			sanctionAmt = 10000000;
		}
		else{
			sanctionAmt = 50000000;
		}
		return sanctionAmt;
	}
	
}
