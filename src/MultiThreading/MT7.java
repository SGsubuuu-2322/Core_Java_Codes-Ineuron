package MultiThreading;


class ThreadClass123 extends Thread{
	static Thread th;
	
	@Override
	public void run() {
		
		try {
			th.join(1000);
		}catch(InterruptedException ie){
			
		}
		
		for(int i = 0; i < 6; i++){
			System.out.println("Child Thread...");
		}
	}
}

public class MT7 {

	public static void main(String[] args) throws InterruptedException  {
		ThreadClass123.th = Thread.currentThread();
		
		ThreadClass123 tci = new ThreadClass123();
		tci.start();
//		tci.join();
		
		for(int i = 0; i < 6; i++){
			System.out.println("Main Thread...");
			Thread.sleep(2000);
		}

	}

}
