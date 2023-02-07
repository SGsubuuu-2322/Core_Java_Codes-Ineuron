package Exception_Handling;

class AlphA{
	
	public void metalpha(){
		
		System.out.println("Statement-I");
		try {
			System.out.println("Statement-II");
			System.out.println("Statement-III");
			System.out.println("Statement-IV");
			try {
				System.out.println("Statement-V");
				System.out.println("Statement-VI");
				System.out.println("Statement-VII");
			}catch(ArithmeticException ae){
				System.out.println(10/0);
				System.out.println("Inside Inner catch...");
			}
			finally {
				System.out.println("Inside Inner finally...");
			}
			System.out.println("Outside Inner  try catch & finally...");
		}catch(Exception e) {
			System.out.println("Inside Outer Catch block...");
		}
		finally {
			System.out.println("Inside Outer Finally block...");
		}
		System.out.println("Outside outer try catch & finally block...");
		
	}
	
}

public class EH14 {

	public static void main(String[] args) {
		AlphA aa = new AlphA();
		aa.metalpha();

	}

}
