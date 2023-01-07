package Encapsulation;
import java.util.*;

class Dog{
	
	private int price;
	private String name;
	
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}


public class Encapsulation_2 {

	public static void main(String[] args) {
		Scanner ip =  new Scanner(System.in);
		System.out.println("This is the program to illustrate the \"Encapsulation\" principle in oops...");
		Dog dg = new Dog();
		System.out.println("So, Enter your dog's name :- ");
		String name = ip.next();
		dg.setName(name);
		System.out.println("Now, enter your dog's price :- ");
		int price = ip.nextInt();
		dg.setPrice(price);
		
		System.out.println("So, now your data has been stored in the object of dog's class(bean)...");
		System.out.println("Now, its time to access those data through ther object's reference variable :- ");
		System.out.println("So, your dog's name is : " + dg.getName());
		System.out.println("And, it costs you about : " + dg.getPrice());

	}

}
