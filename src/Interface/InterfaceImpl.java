package Interface;


interface IInterface{
	void disPlay();
}

public class InterfaceImpl  implements IInterface{
	
	public void disPlay(){
		System.out.println("Hellooo World!!!");
	}

	public static void main(String[] args) {
		
		
		InterfaceImpl int1 = new InterfaceImpl();
		int1.disPlay();
		
	}
}
