package Polymorphism;


class Example{
	
	String name;
	int age;
	char bloodGroup;
	
	
	
	
	public Example(String name, int age, char bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}


	@Override
	public String toString(){
		
		return (name + " " + age + " " + bloodGroup);
	}
}

public class Polymorphism_01 {

	
	public static void main(String[] args){
		Example ex = new Example("SGsubu", 22, 'o');
		
		System.out.println(ex);
	}
	
	
}
