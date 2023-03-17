package Default_Package;

public class MT3 {

	public static void main(String[] args) {
		
		System.out.println("Before setting or By_default priority of main thread : " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("After setting priority of main thread : " + Thread.currentThread().getPriority());
		Thread t = new Thread();
		System.out.println("After creating the child thread its priority is : " + t.getPriority());

	}

}
