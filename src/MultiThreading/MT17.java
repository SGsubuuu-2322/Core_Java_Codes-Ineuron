package MultiThreading;

class TRIALCLASS12{
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


class THREADCLASSI extends Thread{
	TRIALCLASS12 tc;
	String name;
	public THREADCLASSI(TRIALCLASS12 tc, String name){
		this.tc = tc;
		this.name = name;
	}
	
	public void run(){
		tc.disPLAYI(name);
	}
}

class THREADCLASSII extends Thread{
	TRIALCLASS12 tc;
	String name;
	public THREADCLASSII(TRIALCLASS12 tc, String name){
		this.tc = tc;
		this.name = name;
	}
	
	public void run(){
		tc.disPLAYII(name);
	}
}

class THREADCLASSIII extends Thread{
	TRIALCLASS12 tc;
	String name;
	public THREADCLASSIII(TRIALCLASS12 tc, String name){
		this.tc = tc;
		this.name = name;
	}
	
	public void run(){
		tc.display(name);
	}
}

public class MT17 {

	public static void main(String[] args) {
		TRIALCLASS12 tc = new TRIALCLASS12();
		
		THREADCLASSI thci = new THREADCLASSI(tc, "SGsubuuu");
		THREADCLASSII thcii = new THREADCLASSII(tc, "GSgituuu");
		THREADCLASSIII thciii = new THREADCLASSIII(tc, "SGshreyans");
		
		thci.start();
		thcii.start();
		thciii.start();
		
		System.out.println("Hello there, I'm Main THread...");

	}

}
