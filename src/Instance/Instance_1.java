package Instance;
import java.util.*;

class Parent{
	
	public Parent(){
		System.out.println("This is the Parent class constructor....");
	}
}

class Child extends Parent{
	
	public Child(){
		System.out.println("This is the Child class constructor...");
	}
	
	{
		System.out.println("This is the Instance-Initializer Block, written just below the Child class Constructor...");
	}
}

public class Instance_1 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Child ch = new Child();

	}

}
