package Polymorphism;


class Person{
	public void c(){
		System.out.println("Helloooo Aliennssss.....");
	}
}

class Student extends Person{
	public int d(){
		System.out.println("Hellooooo Folksss....");
		return 9;
	}
}

class A{
	public Person disPlay(){
		Person p = new Person();
		System.out.println("Hello Guyssss!!!");
		return p;
	}
}

class B extends A{
	@Override
	public Student disPlay(){
		Student s = new Student();
		System.out.println("Hello Bachoooooo....");
		return s;
	}
}

public class Polymorphism_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
