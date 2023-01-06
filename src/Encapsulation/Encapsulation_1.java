package Encapsulation;
import java.util.*;

class Business_Class{
	private int age;
	private String name;
	private String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

public class Encapsulation_1 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		Business_Class bc = new Business_Class();
		bc.setAge(23);
		System.out.println(bc.getAge());
		
		bc.setCity("Bhubaneswar");
		System.out.println(bc.getCity());
		
		bc.setName("SGsubuuu");
		System.out.println(bc.getName());		

	}

}
