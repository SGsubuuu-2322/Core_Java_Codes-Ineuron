package Exception_Handling;

import java.util.Scanner;

class OverAgeException extends Exception{
	
	public OverAgeException(String msg){
		super(msg);
	}
	
}

class UnderAgeException extends Exception{
	
	public UnderAgeException(String msg){
		super(msg);
	}
	
}

class Rto{
	
	int age;
	
	public void dataInput(){
		Scanner ip = new Scanner(System.in);
		System.out.println("Dear Sir/Madam please enter your age for eligibility verification : ");
		age = ip.nextInt();
	}
	public void dataVerify() throws UnderAgeException, OverAgeException
	{
		
		if(age <= 18){
			UnderAgeException uae = new UnderAgeException("Please calm down Buddy!!! you're below age for licence...");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age >= 60){
			OverAgeException oae = new OverAgeException("Please calm down Buddy!!! You're over age for licence...");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("So, you're perfectly eligible for the licence...");
		}
		
	}
	
	
}



class Applicant{
	
	public void apply(){
		Rto rto = new Rto();
		try{
			rto.dataInput();
			rto.dataVerify();
		}catch(UnderAgeException|OverAgeException uoae){
			try {
				rto.dataInput();
				rto.dataVerify();
			}catch(UnderAgeException|OverAgeException uoaee) {
				System.out.println("You'hv entered lot more times.So, read instructions carefully and then apply...");
				System.exit(0);
			}
		}
		
	}
	
}

public class EH17 {

	public static void main(String[] args){
		System.out.println("Welcome Dear Sir/Madam to our Rto Application program...");
		Applicant appl = new Applicant();
		appl.apply();
	}
	
}
