package Exception_Handling;

class Demoo{
	
	public void met(){
		try{
			System.out.println("Program Starts...");
			System.exit(0);
		}
		finally{
			System.out.println("Program Ends...");
		}
	}
	
}

public class EH13 {

	public static void main(String[] args) {
		Demoo d = new Demoo();
		d.met();

	}

}
