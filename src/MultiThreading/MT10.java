package MultiThreading;

class ThreadClass10 extends Thread{
	
	@Override
	public void run(){
		for(int i = 0; i < 5; i++)
			System.out.println("In Child Thread...");
		System.out.println("Hello Guys!!! I'm going into sleeping state...");
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("OOPS!!! I got interrupted...");
		}
	}
}

public class MT10 {

	public static void main(String[] args) {
		ThreadClass10 tc1 = new ThreadClass10();
		tc1.start();
		
		tc1.interrupt();
		
		System.out.println("Main in the end...");

	}

}
