package Inheritance;
import java.util.*;

class Demo1{
	private String name = "SGsubuu";
	private int age = 23;
	public void disPlay(){
		System.out.println("This is a parent class method from demo1");
		System.out.println("Whose data are as follows :- " + name);
	}
	
}

class Demo2 extends Demo1{
	
}

public class Inheritance_1 {

	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		demo.disPlay();

	}

}
