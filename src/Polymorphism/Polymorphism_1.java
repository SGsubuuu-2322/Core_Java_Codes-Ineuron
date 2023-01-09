package Polymorphism;


class Parent{
	public void cry(){
		System.out.println("Parent cries...");
	}
}

class Child1 extends Parent{
	public void cry(){
		System.out.println("Child1 cries at low voice...");
	}
}

class Child2 extends Parent{
	public void cry(){
		System.out.println("Child2 cries at high voice...");
	}
}

public class Polymorphism_1 {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		c1.cry();
		c2.cry();
		
		System.out.println();
		
		Parent ref;
		ref = c1;
		ref.cry();
		
		ref = c2;
		ref.cry();
		

	}

}
