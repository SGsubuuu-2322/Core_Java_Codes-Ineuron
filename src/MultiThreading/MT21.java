package MultiThreading;

class BThread{
	
	public void bThread(String name){
		
		synchronized(this){
			System.out.println(Thread.currentThread().getName() + "AKA " + name +  "Gets the lock of this synchronized block...");
			
			for(int i = 0; i < 5; i++){
				System.out.println(name + " gets running...");
				try{
					Thread.sleep(2000);
				}catch(InterruptedException ie){
					System.out.println("OOPS!!! I got interrupted...");
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + "AKA " + name +  " released the lock of this synchronized block...");
		
	}
	
}

class EThread extends Thread{
	String name;
	BThread bt;
	public EThread(String name, BThread bt){
		this.name = name;
		this.bt = bt;
	}
	
	@Override
	public void run() {
		bt.bThread(name);
	}
}

public class MT21 {

	public static void main(String[] args) {
		BThread bt1 = new BThread();
		BThread bt2 = new BThread();
		
		EThread et1 = new EThread("SGsubuuu", bt1);
		EThread et2 = new EThread("GSgituuu", bt1);
		
		et1.start();
		et2.start();
		
		System.out.println("Hey All!!! I'm the good damm Main Method....");

	}

}
