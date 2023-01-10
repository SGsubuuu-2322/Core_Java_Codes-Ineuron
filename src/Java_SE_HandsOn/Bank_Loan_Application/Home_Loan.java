package Java_SE_HandsOn.Bank_Loan_Application;

public class Home_Loan extends Loan_App{

	private static char ch;
	private static long salary;
	private static long distance;
	private static long homeArea;
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
		System.out.println("Enter your home area to be constructed in squareft. :- ");
		double ar = ip.nextDouble();
		homeArea = Math.round(ar);
		if((age >= 25) && (ch == 'G' || ch == 'g') && (homeArea >= 2000) && (salary >= 400000) && (distance <= 25)){
			res = true;
		}
		else if(age >= 25 && (ch == 'P' || ch == 'p')&& (homeArea >= 2000) && salary >= 500000 && distance <= 15){
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
		if((ch == 'G' || ch == 'g') && (homeArea >= 2000 || homeArea <= 3000) && (salary >= 400000 && salary <= 700000) && (distance <= 25) ){
			sanctionAmt = 4000000;
		}
		else if((ch == 'G' || ch == 'g')&& (homeArea > 3000 || homeArea <= 5000) && (salary > 700000 && salary <= 1200000) && (distance <= 25) ){
			sanctionAmt = 8000000;
		}
		else{
			sanctionAmt = 12000000;
		}
		return sanctionAmt;
	}
	
	public long forPrivtEmp(){
		if((ch == 'P' || ch == 'p') && (homeArea >= 2000 || homeArea <= 3500) && (salary >= 500000 && salary <= 1000000) && (distance <= 15) ){
			sanctionAmt = 5000000;
		}
		else if((ch == 'P' || ch == 'p') && (homeArea > 3500 || homeArea <= 5000) && (salary > 1000000 && salary <= 2500000) && (distance <= 15) ){
			sanctionAmt = 10000000;
		}
		else{
			sanctionAmt = 25000000;
		}
		return sanctionAmt;
	}
	
}
