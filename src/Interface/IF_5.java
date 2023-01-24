package Interface;

interface IIF5{
	void met1();
	void met2();
	void met3();
	void met4();
}

abstract class AdapterImpl implements IIF5{
	
	@Override
	public void met1() {}
	@Override
	public void met2() {}
	@Override
	public void met3() {}
	@Override
	public void met4() {}
}

class IF51 extends AdapterImpl{
	@Override
	public void met1(){
		System.out.println("This is a Met1 method...");
	}
	
	@Override
	public void met2() {
		System.out.println("This is a Met2 method...");
	}
}

class IF52 extends AdapterImpl{
	@Override 
	public void met3() {
		System.out.println("This is a met3 method...");
	}
	
	@Override 
	public void met4(){
		System.out.println("This is a met4 method...");
	}
}

public class IF_5 {

	public static void main(String[] args) {
		IF51 if5 = new IF51();
		IF52 iF5 = new IF52();
		
		if5.met1();
		if5.met2();
		
		System.out.println();
		
		iF5.met3();
		iF5.met4();

	}

}
