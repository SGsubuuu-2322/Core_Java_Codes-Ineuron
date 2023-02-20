package MultiThreading;

class BThreaD1{
	
	public void bThread(String name){
		
		synchronized(BThreaD1.class){
			System.out.println(Thread.currentThread().getName() + " AKA " + name +  " Gets the lock of this synchronized block...");
			
			for(int i = 0; i < 5; i++){
				System.out.println(name + " gets running...");
				try{
					Thread.sleep(2000);
				}catch(InterruptedException ie){
					System.out.println("OOPS!!! I got interrupted...");
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + " AKA " + name +  " released the lock of this synchronized block...");
		
	}
	
}

class EThreaD1 extends Thread{
	String name;
	BThreaD1 bt;
	public EThreaD1(String name, BThreaD1 bt){
		this.name = name;
		this.bt = bt;
	}
	
	@Override
	public void run() {
		bt.bThread(name);
	}
}


public class MT22 {

	
	public static void main(String[] args) {
		BThreaD1 bt1 = new BThreaD1();
		BThreaD1 bt2 = new BThreaD1();
		
		EThreaD1 et1 = new EThreaD1("SGsubuuu", bt1);
		EThreaD1 et2 = new EThreaD1("GSgituuu", bt2);
		
		et1.start();
		et2.start();
		
		System.out.println("Hey All!!! I'm the good damm Main Method....");

	}
	
}
