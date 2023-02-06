package Exception_Handling;

class Demo{
	
	public int met(){
		try{
			System.out.println("Program Starts...");
			return 10;
		}
		finally{
			System.out.println("Program Ends...");
		}
	}
	
}

public class EH12 {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.met();

	}

}
