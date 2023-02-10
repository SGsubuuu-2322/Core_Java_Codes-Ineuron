package MultiThreading;

public class MT12 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override 
			public void run() {
				for(int i = 0; i < 5; i++)
					System.out.println("This is Child Thread...");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		System.out.println("IN the main Thread...");

	}

}
