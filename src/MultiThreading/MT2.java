package MultiThreading;

class MyRunnable implements Runnable{
	@Override
	public void run(){
		for(int i = 0; i < 15; i++)
			System.out.println("User-Defined Thread...");
	}
}

public class MT2 {

	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		Thread t = new Thread(mr);
		t.start();
		
		for(int i = 0; i < 15; i++)
			System.out.println("Main Thread...");
		

	}

}
