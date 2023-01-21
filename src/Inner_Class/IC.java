package Inner_Class;

public class IC {
	
    I i = new I();
//    i.disPlay(); --Method Calling(Action) can't be done direclty in a class...
    
    public void dis() {
    	System.out.println("In Dis...");
    }
	
	class I{
		public void disPlayI() {
			System.out.println("Hello!!! This is I from class-I");
//			disPlayI();
		}
	}

	public static void main(String[] args) {
		
		IC ic = new IC();
		ic.i.disPlayI();
//		
//		System.out.println(ici.disPlayI());

	}

}
