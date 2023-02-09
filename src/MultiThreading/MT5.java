package MultiThreading;

class MyrunnableI extends Thread{
	@Override
	public void run(){
		for(int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("Hii This is Child Thread...");
		}
	}
}

public class MT5 {

	public static void main(String[] args) {
		MyrunnableI mr = new MyrunnableI();
		mr.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Hii This is Main Thread...");
		}

	}

}
