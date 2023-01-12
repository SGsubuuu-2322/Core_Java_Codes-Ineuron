package HAS_A_Relationship;

class Address{
	public void disPlay(){
		System.out.println("This is a address from a dependent object for a student target object...");
	}
}

class Student{
	public Address address;
	public Student(){
		address = new Address();
	}
}

public class Has_A2 {

	public static void main(String[] args) {
		Student std = new Student();
		std.address.disPlay();

	}

}
