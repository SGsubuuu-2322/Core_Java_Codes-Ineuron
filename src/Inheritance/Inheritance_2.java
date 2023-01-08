package Inheritance;

class Demo11{
	private String name = "SGshreyansss";
	private int age = 23;
	public void disPlay(){
		System.out.println("I'm 2nd parent class in this heirarchy having data : name :- " + name + " age :- " + age);
	}
}

class Demo12 extends Demo11{
	
}

class Demo13 extends Demo12{
	
}

public class Inheritance_2 {

	public static void main(String[] args) {
		Demo13 demo = new Demo13();
		demo.disPlay();

	}

}
