package MultiThreading;



public class MT11 {

	public static void main(String[] args) {
		
		Runnable r = ()->{
			for(int i = 0; i < 5; i++)
				System.out.println("This is Child Thread...");
		};
		
		Thread t = new Thread(r);
		t.start();
		
		System.out.println("Main Thread...");
		
		
		

	}

}
