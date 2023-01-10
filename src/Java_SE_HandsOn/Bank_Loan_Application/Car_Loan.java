package Java_SE_HandsOn.Bank_Loan_Application;

public class Car_Loan extends Loan_App{

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
		if((age >= 25) && (ch == 'G' || ch == 'g') && (salary >= 400000) && (distance <= 25)){
			res = true;
		}
		else if(age >= 25 && (ch == 'P' || ch == 'p')&& salary >= 500000 && distance <= 15){
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
		if((ch == 'G' || ch == 'g') && (salary >= 400000 && salary <= 700000) && (distance <= 25) ){
			sanctionAmt = 2000000;
		}
		else if((ch == 'G' || ch == 'g') && (salary > 700000 && salary <= 1400000) && (distance <= 25) ){
			sanctionAmt = 4000000;
		}
		else{
			sanctionAmt = 6000000;
		}
		return sanctionAmt;
	}
	
	public long forPrivtEmp(){
		if((ch == 'P' || ch == 'p') && (salary >= 500000 && salary <= 1500000) && (distance <= 15) ){
			sanctionAmt = 3000000;
		}
		else if((ch == 'P' || ch == 'p') && (salary > 1500000 && salary <= 3000000) && (distance <= 15) ){
			sanctionAmt = 6000000;
		}
		else{
			sanctionAmt = 10000000;
		}
		return sanctionAmt;
	}
	
}
