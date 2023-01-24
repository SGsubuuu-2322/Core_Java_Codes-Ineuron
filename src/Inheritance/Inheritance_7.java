package Inheritance;

class Parent11{
	
	Parent11(){
		System.out.println("This is a parent class constructor...");
		System.out.println("Its object reference is : " + this.hashCode());
	}
	
}

class Child22 extends Parent11{
	
	Child22(){
		System.out.println("This is a child class constructor...");
		System.out.println("Its object reference is : " + this.hashCode());
	}
}

public class Inheritance_7 {

	public static void main(String[] args) {
		Child22 ch = new Child22();
		System.out.println("This is main class and the child class reference is : " + ch.hashCode());

	}

}
