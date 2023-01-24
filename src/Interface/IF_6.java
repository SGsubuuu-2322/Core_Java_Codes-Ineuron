package Interface;

interface ISI1{
	void sampMethod();
}

interface ISI2{
	void sampMethod();
}

class SIImpl implements ISI1, ISI2{
	public void sampMethod(){
		System.out.println("This is a method-1...");
	}
	
//	public void sampMethod(){
//		System.out.println("This is method-2");
//	}
}

public class IF_6 {

	public static void main(String[] args) {
		SIImpl si = new SIImpl();
		si.sampMethod();

	}

}
