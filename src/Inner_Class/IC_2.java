package Inner_Class;


class A{
	
	public void shoW(){
		System.out.println("In Show in parent or outer class...");
	}
	
//	static
	class B{
		public void conFig(){
			System.out.println("In Config in inner or child class...");
		}
	}
	
}

public class IC_2 {

	public static void main(String[] args) {
		
		A a = new A();
		a.shoW();
		
//		A.B ab = new A.B();
//		ab.conFig();
		
		A.B ab = a.new B();
		ab.conFig();

	}

}
