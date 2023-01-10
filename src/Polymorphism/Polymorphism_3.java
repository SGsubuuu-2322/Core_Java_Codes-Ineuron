package Polymorphism;

class Parent1{
	public void cry(){
		System.out.println("Parent cries...");
	}
}

class Child1122 extends Parent1{
	public void cry(){
		System.out.println("Child1 cries at low voice...");
	}
	public void laugh(){
		System.out.println("Child1 laughs at low voice...");
	}
}

class Child2211 extends Parent1{
	public void cry(){
		System.out.println("Child2 cries at high voice...");
	}
	public void laugh(){
		System.out.println("Child1 laughs at high voice...");
	}
}

class ParentChild{
	public void access(Parent1 parent){
		parent.cry();
//		parent.laugh();
//		((Child1122) parent).laugh();
	}
}


public class Polymorphism_3 {

	public static void main(String[] args) {
		
		ParentChild pc = new ParentChild();
		Child1122 c1 = new Child1122();
		Child2211 c2 = new Child2211();
		
		pc.access(c1);
		pc.access(c2);

	}

}
