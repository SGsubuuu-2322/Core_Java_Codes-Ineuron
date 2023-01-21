package Inner_Class;

public class IC_1 {
	
	private int num = 9;
	public void show()
	{
		System.out.println("In Show in outer or parent class...");
	}
	
	Inn in = new Inn();
	 
	class Inn{
		
		public void config(){
			System.out.println("In Config in inner class or child class and parent member variable : " + num);
			show();
		}
		
	}

	public static void main(String[] args) {
		IC_1 ic1 = new IC_1();
		ic1.in.config();

	}

}
