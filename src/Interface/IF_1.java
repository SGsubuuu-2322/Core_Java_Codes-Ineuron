package Interface;

interface ISample{
	void metHod1();
	void metHod2();
}

abstract class SampleImpl implements ISample{
	
	@Override
	public void metHod1(){
		System.out.println("This is 1st method from Interface ISample...");
	}
	
}

class AnSampleImpl extends SampleImpl{
	
	@Override
	public void metHod2(){
		System.out.println("This is 2nd method from Interface ISample...");
	}
}

public class IF_1 {

	public static void main(String[] args) {
		ISample as = new AnSampleImpl();
		as.metHod1();
		as.metHod2();

	}

}
