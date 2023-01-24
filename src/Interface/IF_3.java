package Interface;

interface I_Int1{
	void playDis1();
}

interface I_Int2{
	void playDis2();
}
interface I_Int3{
	void playDis3();
}

interface I_Int4 extends I_Int1, I_Int2, I_Int3{
	void playDis4();
}

class Int4 implements I_Int4{
	public void playDis1(){
		System.out.println("This is playDis1 method...");
	}
	
	public void playDis2(){
		System.out.println("This is playDis2 method...");
	}
	
	public void playDis3(){
		System.out.println("This is playDis3 method...");
	}
	
	public void playDis4(){
		System.out.println("This is playDis4 method...");
	}
}

public class IF_3{

	public static void main(String[] args) {
		Int4 it4 = new Int4();
		it4.playDis1();
		it4.playDis2();
		it4.playDis3();
		it4.playDis4();

	}

}
