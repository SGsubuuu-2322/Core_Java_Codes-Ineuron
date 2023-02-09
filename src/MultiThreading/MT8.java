package MultiThreading;

class THREAD extends Thread{
	
	@Override
	public void run() {
		
		try{
			
			for(int i = 0; i < 5; i++){
				System.out.println("In the child thread...");
				Thread.sleep(2000);
			}
		}catch(InterruptedException ie) {
			System.out.println("OOPSSS!!!! I Got Interrupted...");
		}
		
	}
}

public class MT8 {

	public static void main(String[] args) {
		THREAD th = new THREAD();
		th.start();
		
		th.interrupt();
		
		System.out.println("In the end of main...");

	}

}
