package MultiThreading;

class TRIALCLASS1234{
	public synchronized void disPLAYI(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello Mr. " + name + " Good_Morning...");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("Oops!!! I got interrupted...");
			}
		}
	}
	public synchronized void disPLAYII(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello Mrs. " + name + " Good_Evening...");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("Oops!!! I got interrupted...");
			}
		}
	}
	
	public void display(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello Mr./Mrs. " + name + " Good_Night...");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("Oops!!! I got interrupted...");
			}
		}
	}
}

class THREADCLASS1234 extends Thread{
	TRIALCLASS1234 tc;
	String name;
	public THREADCLASS1234(TRIALCLASS1234 tc, String name){
		this.tc = tc;
		this.name = name;
	}
	
	public void run(){
		tc.disPLAYI(name);
		tc.disPLAYII(name);
		tc.display(name);
	}
}

public class MT18 {

	public static void main(String[] args) {
        TRIALCLASS1234 tc = new TRIALCLASS1234();
		
		THREADCLASS1234 thci = new THREADCLASS1234(tc, "SGsubuuu");
		THREADCLASS1234 thcii = new THREADCLASS1234(tc, "GSgituuu");
		THREADCLASS1234 thciii = new THREADCLASS1234(tc, "SGshreyans");
		
		thci.start();
		thcii.start();
		thciii.start();
		
		System.out.println("Hello there, I'm Main Thread...");

	}

}
