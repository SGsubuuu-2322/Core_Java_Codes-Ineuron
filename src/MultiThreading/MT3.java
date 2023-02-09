package MultiThreading;

class MyyRunnable implements Runnable{
	@Override
	public void run() {
//		for(int i = 0; i < 10; i++)
//			System.out.println("User-Defined Thread's run() Method...");
		
		Thread.currentThread().setName("GSgituuu");
		
		System.out.println(Thread.currentThread().getName());
	}
}

public class MT3 {

	public static void main(String[] args) {
		MyyRunnable myr = new MyyRunnable();
		Thread tr = new Thread(myr);
		tr.start();
		
//		for(int i = 0; i < 10; i++)
//			System.out.println("Main Thread's main() Method...");
		
		Thread.currentThread().setName("SGsubuuu");
		
		System.out.println(Thread.currentThread().getName());

	}

}
