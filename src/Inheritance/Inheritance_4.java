package Inheritance;
import java.util.*;

class Parentt{
	int a, b;
	
	public Parentt() {
		a = 10;
		b = 20;
		System.out.println("This is a parent class zero parametrized constructor...");
	}
	
	public Parentt(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("This is a parametrized constructor");
	}
}

class Childd extends Parentt{
	
	int x, y;
	
	public Childd(){
		x = 100;
		y = 200;
		System.out.println("This is a child class zero paramterized constructor...");
	}
	
	public Childd(int x, int y){
		super(100,200);
		this.x = x;
		this.y = y;
		System.out.println("This is a child class parametrized constructor...");
	}
	
	public void disPlay(){
		System.out.println("Inherited parent class a: " + a);
		System.out.println("Inherited parent class b: " + b);
		System.out.println("This class x: " + x);
		System.out.println("This class y: " + y);
	}
}

public class Inheritance_4 {

	public static void main(String[] args) {
		Childd ch = new Childd();
		ch.disPlay();
		System.out.println();
		ch = new Childd(1000, 2000);
		ch.disPlay();

	}

}
