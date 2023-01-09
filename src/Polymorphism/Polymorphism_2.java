package Polymorphism;

class Plane{
	
	public void fly(){
		System.out.println("Plane Prototype is flying...");
	}
	public void takeOff(){
		System.out.println("Plane Prototype is taking-off...");
	}
	public void landing(){
		System.out.println("Plane prototype is landing...");
	}
}

class PassangerPlane extends Plane{
	
	public void fly(){
		System.out.println("Passanger Plane is flying...");
	}
	
}

class CargoPlane extends Plane{
	
	public void fly(){
		System.out.println("Cargo Plane is flying...");
	}
	
}

class FighterPlane extends Plane{
	
	public void fly(){
		System.out.println("Fighter Plane is flying...");
	}
	
}

class Airport{
	public void permitPlane(Plane plane){
		plane.takeOff();
		plane.fly();
		plane.landing();
	}
}

public class Polymorphism_2 {

	public static void main(String[] args) {
		Airport ap = new Airport();
		PassangerPlane pp = new PassangerPlane();
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		
		ap.permitPlane(pp);
		System.out.println();
		ap.permitPlane(cp);
		System.out.println();
		ap.permitPlane(fp);

	}

}
