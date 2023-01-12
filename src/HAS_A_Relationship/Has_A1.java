package HAS_A_Relationship;

class Engine{
	
	public void display(){
		System.out.println("I'm a method from a dependent class...");
	}
	
}

class Car{
	static Engine engine = new Engine();
}

public class Has_A1 {

	public static void main(String[] args) {
//		Car car = new Car();
		Car.engine.display();

	}

}
