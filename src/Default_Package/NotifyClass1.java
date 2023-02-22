package Default_Package;

class Thread1 extends Thread{

	Thread3 t3 = new Thread3();
	
	@Override 
	public void run(){
		t3.start();
		synchronized(t3){
			try {
				System.out.println("Before updation the value of the Thread-3 number in Thread-1 is : " + t3.total);
				t3.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("After updation the value of the Thread-3 number in Thread-1 is : " + t3.total);
		}
	}
	
}
class Thread2 extends Thread{
	
    Thread3 t3 = new Thread3();
	
	@Override 
	public void run(){
		t3.start();
		synchronized(t3){
			try {
				System.out.println("Before updation the value of the Thread-3 number in Thread-2 is : " + t3.total);
				t3.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("After updation the value of the Thread-3 number in Thread-2 is : " + t3.total);
		}
	}
	
}

class Thread3 extends Thread{
	
	int total = 0;
	
	@Override 
	public void run(){
		synchronized(this){
			for(int i = 0; i < 5; i++){
				total += i;
			}
			
			this.notifyAll();
		}
	}
	
}


public class NotifyClass1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread3 t3 = new Thread3();
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
//		t3.start();
		t1.start();
		t2.start();
		
		System.out.println("Hell Yaaa!!! I'm the main thread...");
		

	}

}
