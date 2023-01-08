package Inheritance;
import java.util.*;

class Plane{
	
	public void takeOff(){
		System.out.println("Your Plane is taking-off....");
	}
	public void fly(){
		System.out.println("Your Plane is flying....");
	}
	public void landing(){
		System.out.println("Your Plane is landing....");
	}
}

class CargoPlane extends Plane{
	public void fly(){
		System.out.println("Your CargoPlane is flying at lower height....");
	}
	public void carryCargo(){
		System.out.println("Your plane is carrying cargos...");
	}
}

class PassangerPlane extends Plane{
	public void fly(){
		System.out.println("Your PassangerPlane is flying at medium height....");
	}
	public void carryPassanger(){
		System.out.println("Your plane is carrying passangers...");
	}
}

public class Inheritance_5 {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		PassangerPlane pp = new PassangerPlane();
		
		cp.takeOff();
		cp.fly();
		cp.landing();
		cp.carryCargo();
		
		System.out.println();
		
		pp.takeOff();
		pp.fly();
		pp.landing();
		pp.carryPassanger();

	}

}
