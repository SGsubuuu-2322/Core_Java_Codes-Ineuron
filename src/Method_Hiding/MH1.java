package Method_Hiding;

class Parent{
	public void metHod(){
		System.out.println("Hello Guysss!!! This is Parenttt...");
	}
}

class Child extends Parent{
	
	public void metHod1(){
		System.out.println("Hello Guysss!!! This is Childdd...");
	}
}

public class MH1 {

	public static void main(String[] args) {
		
		Parent pr = new Child();
		pr.metHod();
//		pr.metHod1();

	}

}
