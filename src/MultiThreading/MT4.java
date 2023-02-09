//import java.sql.*;
package MultiThreading;

class MyyThread extends Thread{
	@Override 
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(9);
//		System.out.println(Thread.currentThread().getPriority());
	}
}

public class MT4 {

	public static void main(String[] args) {
		
		MyyThread myt = new MyyThread();
		myt.start();
		
		System.out.println(Thread.currentThread().getPriority());

	}

}
