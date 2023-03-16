package Default_Package;

class MyRunnable implements Runnable{
	@Override 
	public void run(){
		for(int i = 0; i < 5; i++)
			System.out.println("Hello SGsubuuu...");
	}
}

public class MT2 {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		for(int i = 0; i < 5; i++)
			System.out.println("Hii GSgituuu"); 

	}

}
