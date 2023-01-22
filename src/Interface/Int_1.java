package Interface;


interface Interface{
	void DisPlay();
}

public class Int_1 implements Interface{
	
	public void DisPlay(){
		System.out.println("Hellooo World!!!");
	}

	public static void main(String[] args) {
		
		
		Int_1 int1 = new Int_1();
		int1.DisPlay();
		
	}
}
