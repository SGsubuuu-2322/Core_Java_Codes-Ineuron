package Interface;

interface IInt1{
	void disPlay_1();
}

interface IInt2 extends IInt1{
	void disPlay_2();
}

abstract class Int2Impl implements IInt2{
	@Override
	public void disPlay_1() {
		System.out.println("This is method from Int2Impl class....");
	}
}

class Int2 extends Int2Impl{
	
	@Override
	public void disPlay_2(){
		System.out.println("This  is method from Int2 class...");
	}
	
}

public class IF_2 {

	public static void main(String[] args) {
		Int2 it2 = new Int2();
		
		it2.disPlay_1();
		it2.disPlay_2();

	}

}
