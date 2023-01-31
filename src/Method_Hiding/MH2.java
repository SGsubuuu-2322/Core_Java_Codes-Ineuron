package Method_Hiding;

class Parentt{
	public static  void disp(){
		System.out.println("Hello parent...");
	}
}

class Childd extends Parentt{
	public static void disp(){
		System.out.println("Hello Child...");
	}
}


public class MH2 {
	public static void main(String[] args) {
		
		Parentt pr = new Childd();
		pr.disp();

	}

}
