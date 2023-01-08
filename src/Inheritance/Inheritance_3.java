package Inheritance;

class Demo111{
	 
    String name = "Kalia";
    int age = 23;
	public Demo111() {
		System.out.println("Parent-1 or Superrrr class");
	}
}

class Demo112 extends Demo111{
	String name = "Laxman";
	int age = 21;
	public Demo112(){
//		System.out.println("name : " + super.name + " age : " + super.age);
//		System.out.println("name : " + name + " age : " + age);
		
	}
	
}

class Demo113 extends Demo112{
	String name;
	int age;
	public Demo113(String name, int age){
		System.out.println("This is child class");
		System.out.println("name : " + name + " age : " + age);
		System.out.println("name : " + this.name + " age : " + this.age);
		System.out.println("name : " + super.name + " age : " + super.age);
	}
}

public class Inheritance_3 {

	public static void main(String[] args) {
		Demo113 demo = new Demo113("Ganduuu", 20);

	}

}
