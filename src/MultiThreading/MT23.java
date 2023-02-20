package MultiThreading;

class ExcecThreadClass extends Thread{
	int total = 0;
	 
	@Override 
	public void run(){
		synchronized(this){
			System.out.println("Child Thread gets the call from main method...");
			for(int i = 0; i < 100; i++){
				total += i;
			}
			
			
			System.out.println("Child Thread released the notification after the updation...");
			this.notify();
		}
	}
}

public class MT23 {

	public static void main(String[] args) throws InterruptedException {
		
		ExcecThreadClass etc = new ExcecThreadClass();
		etc.start();
		
		synchronized(etc){
			System.out.println("Main Thread called the Child Thread and is Waiting fot the updation...");
			etc.wait();
			
			System.out.println("Main Thread got the notification...");
			System.out.println(etc.total);
			
		}

	}

}
