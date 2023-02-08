package MultiThreading;

class MyThread extends Thread{
	
//	UserDefined Thread...
	@Override
	public void run() {
		for(int n = 0; n < 5; n++)
			System.out.println("Hello This is Child Thread...");
	}
	
}

public class MT1 {

//	Main Thread...
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int n = 0; n < 5; n++)
			System.out.println("Hello This is Main Thread...");

	}

}
