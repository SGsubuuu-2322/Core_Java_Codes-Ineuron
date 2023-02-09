package MultiThreading;
//import java.sql.*;

class MyyThread extends Thread{
	@Override 
	public void run() {
		
		System.out.println("Priority of the Child Thread :: " + Thread.currentThread().getPriority());
//		System.out.println(Thread.currentThread().getPriority());
	}
}

public class MT4 {

	public static void main(String[] args) {
		
		MyyThread myt = new MyyThread();
		myt.setPriority(10);
		myt.start();
		
		System.out.println("Priority of the Main Thread :: " + Thread.currentThread().getPriority());

	}

}
