package Java_SE_HandsOn.Bank_Loan_Application;
import java.util.*;

public class Customer {
	
	public  static Scanner ip = new Scanner(System.in);
	private static String firstName;
	private static String middleName;
	private static String lastName;
	private static String fullName;
	private static int age;
	private static int choice;
	
	public static void inputData(){
		System.out.println("Enter your First-Name :- ");
		firstName = ip.next();
		System.out.println("If present enter your Middle-Name or else enter 'N' :- ");
		middleName = ip.next();
		System.out.println("Enter your Sur/Last-name :- ");
		lastName = ip.next();
		if(middleName.charAt(0) == 'N' || middleName.charAt(0) == 'n'){
			fullName = firstName.concat(lastName);
		}else {
			fullName = firstName.concat(middleName).concat(lastName);
		}
		System.out.println("Enter your age :- ");
		age = ip.nextInt();
		System.out.println("Now,enter '1' for Personal Loan, '2' for Educational Loan, '3' Home Loan, '4' Car Loan:- ");
		choice = ip.nextInt(); 
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome!!! Dear Sir/Madam to our Bank Loan-Application :):):)");

		System.out.println("We the XYZ Bankers, provide you the best and premium quality assured loan services...");
		
		System.out.println("So, you can comfortably rely on us :):):)");
		
		System.out.println("Now, PRESS - '1' for further proceedings, otherwise '-1' to exit from here...");
		int ch = ip.nextInt();
		
		do {
			if(ch == 1){
				System.out.println("So,now you'hv to enter your personal details for checking your eligibility criteria and for further proceedings...");
				
				boolean check = true;
				
				a:
				while(check == true)
				{
					inputData();
					if(choice == 1){
						Personal_Loan pl = new Personal_Loan();
						boolean chec = pl.checkEligibility(age);
						if(chec == true){
							pl.disPlay(chec, fullName);
						}
						else{
							pl.disPlay(chec, fullName);
							break;
						}
						pl.checkSancetionedAmount();
						break;
					}
					else if(choice == 2){
						Educational_Loan el = new Educational_Loan();
					}
					else if(choice == 3){
						Home_Loan hl = new Home_Loan();
					}
					else if(choice == 4){
						Car_Loan cl = new Car_Loan();
					}
					else{
						System.out.println("You'hv entered Invalid input for choices...");
						System.out.println("So, enter 1 for entering details once again orelse, any digit to stop :- ");
						int c = ip.nextInt();
						if(c == 1){
							continue a;
						}
						else{
							break a;
						}
					}
				}
				break;
				
			}
			else if(ch == -1){
				break;
			}
			else {
				System.out.println("Its, a invalid input, PRESS - '1' for further proceedings, otherwise '-1' to quit...");
				ch = ip.nextInt();
				continue;
			}
		}while(true);
		
		System.out.println("Thanks and Visit Us Again :):):)");
		
	}

}
