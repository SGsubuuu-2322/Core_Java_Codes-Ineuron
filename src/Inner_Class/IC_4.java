package Inner_Class;

abstract class Parent{
	
	public abstract void disPP();
}

public class IC_4 {

	public static void main(String[] args) {
		Parent par = new Parent()
		{
			public void disPP(){
				System.out.println("Overridden abstract class method...");
			}
		};
		
		par.disPP();

	}

}
