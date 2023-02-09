package MultiThreading;


class ThreadClassI extends Thread{
	static Thread th;
	
	@Override
	public void run(){
		
		try {
			th.join();
		}catch(InterruptedException ie){
			
		}
		
		for(int i = 0; i < 6; i++){
			System.out.println("Child Thread...");
		}
	}
}

public class MT7 {

	public static void main(String[] args) throws InterruptedException {
		ThreadClassI.th = Thread.currentThread();
		
		ThreadClassI tci = new ThreadClassI();
		tci.start();
		
		for(int i = 0; i < 6; i++){
			Thread.sleep(2000);
			System.out.println("Main Thread...");
		}

	}

}
