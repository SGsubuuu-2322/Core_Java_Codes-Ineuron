package Default_Package;

abstract class Test_i{
	public abstract void voidDisplay();
}

public class Test_2 {

	public static void main(String[] args) {
		
		Test_i ti = new Test_i()
		{
			public void voidDisplay(){
				System.out.println("Hello Man....");
			}
		};
		
		
		ti.voidDisplay();

	}

}
