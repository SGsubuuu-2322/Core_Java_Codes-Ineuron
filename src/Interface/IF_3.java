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

public class IF_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
