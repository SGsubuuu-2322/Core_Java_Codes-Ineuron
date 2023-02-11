package Default_Package;

class Parent{
	public void parentDisp(){
		System.out.println("Hello there!!! I'm parent...");
	}
}

class Child extends Parent{
	public void childDisp(){
		System.out.println("Hello there!!! I'm child...");
	}
}

class A{
	public Parent pa(){
		Parent p = new Parent();
		System.out.println("Hello !!! This is Overriden method...");
		return p;
		
	}
}

class B extends A{
	public Child pa(){
		Child c = new Child();
		System.out.println("Hello !!! This is Overriden method with Co_Variant return type...");
		return c;
	}
}



public class Prac_CoVar_Ret {

	public static void main(String[] args) {
		A a = new A();
		a.pa();
		B b = new B();
		b.pa();

	}

}
