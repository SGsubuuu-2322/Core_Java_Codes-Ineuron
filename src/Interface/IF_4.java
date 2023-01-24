package Interface;

interface I_IF1{
	void dP1();
}

interface I_IF2{
	void dP2();
}

interface I_IF3{
	void dP3();
}

interface I_IF4{
	void dP4();
}

abstract class IF1Impl implements I_IF1, I_IF2{
	public void dP1() {
		System.out.println("This is dP_1 method...");
	}
}

class IF extends IF1Impl implements I_IF3, I_IF4{
	
	public void dP2() {
		System.out.println("This is dP_2 method...");
	}
	
	public void dP3(){
		System.out.println("This is dP_3 method...");
	}
	 public void dP4(){
		 System.out.println("This is dP_4 method...");
	 }
}

public class IF_4 {

	public static void main(String[] args) {
		IF iF = new IF();
		iF.dP1();
		iF.dP2();
		iF.dP3();
		iF.dP4();

	}

}
