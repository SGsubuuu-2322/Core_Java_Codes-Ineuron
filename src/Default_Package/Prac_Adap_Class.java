package Default_Package;

interface AdapClassI{
	void aA();
	void bB();
}

class IParent implements AdapClassI{
	public void aA(){}
	public void bB(){}
}

class IChild1 extends IParent{
	public void aA(){
		System.out.println("Hello!!! I'm a  1st child!!!");
	}
}

class IChild2 extends IParent{
	public void bB(){
		System.out.println("Hello!!! I'm a 2nd Child...");
	}
}


public class Prac_Adap_Class {

	public static void main(String[] args) {
		IChild1 ic1 = new IChild1();
		ic1.aA();
		
		IChild2 ic2 = new IChild2();
		ic2.bB();

	}

}
