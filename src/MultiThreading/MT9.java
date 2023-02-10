package MultiThreading;

class Threadssss extends Thread{
	
	@Override 
	public void run(){
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("IN the child Thread...");
//				Thread.sleep(2000);
			}
		}catch(Exception ie){
			System.out.println("OOpsss!!! I Got Interrupted...");
		}
	}
}

public class MT9 {

	public static void main(String[] args) {
		Threadssss thc = new Threadssss();
		thc.start();
		
		thc.interrupt();
		System.out.println("In the end of main...");

	}

}
