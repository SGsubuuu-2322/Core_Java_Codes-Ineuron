package Abstraction;
import java.util.*;

abstract class Plane1{
//	abstract private int a;
	abstract public void takeOff();
	abstract public void fly();
	abstract public void landing();
	public void emergencyLanding(){
		System.out.println("Your plane is emergency landed...");
	}
}

class PassangerPlane1 extends Plane1{
	public void takeOff(){
		System.out.println("passanger-Plane is taking off....");
	}
	public void fly(){
		System.out.println("Passanger-Plane is flying...");
	}
	public void landing(){
		System.out.println("Passanger-Plane is landing...");
	}
}

class CargoPlane1 extends Plane1{
	public void takeOff(){
		System.out.println("Cargo-Plane is taking off....");
	}
	public void fly(){
		System.out.println("Cargo-Plane is flying...");
	}
	public void landing(){
		System.out.println("Cargo-Plane is landing...");
	}
}

class FighterPlane1 extends Plane1{
	public void takeOff(){
		System.out.println("Cargo-Plane is taking off....");
	}
	public void fly(){
		System.out.println("Cargo-Plane is flying...");
	}
	public void landing(){
		System.out.println("Cargo-Plane is landing...");
	}
}

class Airport{
	public void permitPlanes(Plane1 plane){
		plane.takeOff();
		plane.fly();
		plane.landing();
	}
}

public class Abstraction_1 {

	public static void main(String[] args) {
		
		Airport ap = new Airport();
		PassangerPlane1 pp1 = new PassangerPlane1();
		CargoPlane1 cp1 = new CargoPlane1();
		FighterPlane1 fp1 = new FighterPlane1();
		
		ap.permitPlanes(pp1);
		System.out.println();
		ap.permitPlanes(cp1);
		System.out.println();
		ap.permitPlanes(fp1);

	}

}
