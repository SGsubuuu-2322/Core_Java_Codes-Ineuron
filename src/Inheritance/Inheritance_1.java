package Inheritance;
import java.util.*;

class Demo1{
	private String name = "SGsubuu";
	public void disPlay(){
		System.out.println("This is a parent class method from demo1");
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
