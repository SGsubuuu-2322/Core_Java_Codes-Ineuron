package Exception_Handling;

import java.util.Scanner;

class DataInvalidException extends Exception{
	public DataInvalidException(String msg) {
		super(msg);
	}
}

class Atm{
	
	Integer customerId = 232214;
	Integer accountPwd = 2322;
	
	int  cId;
	int aPwd;
	
	public void dataInput(){
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Dear Sir/Madam please enter your customer-Id : ");
		cId = ip.nextInt();
		
		System.out.println();
		
		System.out.println("Now, enter your password for your account : ");
		aPwd = ip.nextInt();
	}
	
	public void dataVerify() throws DataInvalidException
	{
		if((customerId == cId) && (accountPwd == aPwd)) {
			System.out.println("Now, you can access your account...");
		}else {
			
			DataInvalidException die = new DataInvalidException("Your entered data is Incorrect, So please try again...");
			System.out.println(die.getMessage());
			
			throw die;
			
		}
	}
	
}



class Bank{
	
	public void initiate(){
		
		Atm a = new Atm();
		
		try {
			a.dataInput();
			a.dataVerify();
		}catch(DataInvalidException die){
			
			try{
				a.dataInput();
				a.dataVerify();
			}catch(DataInvalidException diee) {
				
				try{
					a.dataInput();
					a.dataVerify();
				}catch(DataInvalidException dieee){
					System.out.println("Aree Chor Dude!!! We'hv caught you and the card has been blocked...");
					System.exit(0);
				}
				
			}
			
		}
		
	}
	
}

public class Eh16 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();

	}

}
