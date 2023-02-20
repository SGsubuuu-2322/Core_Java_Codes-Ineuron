package Default_Package;

class BThread{
	
	public void bThread(String name){
		System.out.println("Mr./Mrs." + name + " gets running...");
		
		synchronized(this){
			for(int i = 0; i < 5; i++){
				System.out.println("Mr./Mrs." + name + " gets hold of the lock of this synchronized block...");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie){
					System.out.println("OOPSSS!!! I got interrupted...");
				}
			}
		}
	}
}

class EThread extends Thread{
	String name;
	BThread bt;
	
	public EThread(String name, BThread bt){
		this.name = name;
		this.bt = bt;
	}
	
	public void run(){
		bt.bThread(name);
	}
}

public class SyncBlock1 {

	public static void main(String[] args) {
		BThread bt = new BThread();
		
		EThread et1 = new EThread("SGsubuuu", bt);
		EThread et2 = new EThread("GSgituuu", bt);
		
		et1.start();
		et2.start();
		
		System.out.println("I'm the damm hell Main Thread...");

	}

}
