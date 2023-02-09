package MultiThreading;

class ThreadClass extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 6; i++){
			System.out.println("Sita Thread...");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				
			}
		}
	}
}

public class MT6 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadClass tc = new ThreadClass();
		tc.start();
		
		tc.join(1000, 10);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Rama Thread...");
		}

	}

}
