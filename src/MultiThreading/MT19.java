package MultiThreading;


class TRIALCLASS1212{
	public static synchronized void disPLAYI(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello Mr. " + name + " Good_Morning...");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("Oops!!! I got interrupted...");
			}
		}
	}
	public static synchronized void disPLAYII(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello Mrs. " + name + " Good_Evening...");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("Oops!!! I got interrupted...");
			}
		}
	}
	
	public static void display(String name){
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


class THREADCLASS111 extends Thread{
//	TRIALCLASS1212 tc;
	String name;
	public THREADCLASS111(String name){
//		this.tc = tc;
		this.name = name;
	}
	
	public void run(){
		TRIALCLASS1212.disPLAYI(name);
	}
}

class THREADCLASS222 extends Thread{
//	TRIALCLASS1212 tc;
	String name;
	public THREADCLASS222(String name){
//		this.tc = tc;
		this.name = name;
	}
	
	public void run(){
		TRIALCLASS1212.disPLAYII(name);
	}
}

class THREADCLASS333 extends Thread{
//	TRIALCLASS1212 tc;
	String name;
	public THREADCLASS333(String name){
//		this.tc = tc;
		this.name = name;
	}
	
	public void run(){
		TRIALCLASS1212.display(name);
	}
}

public class MT19 {

	public static void main(String[] args) {
//        TRIALCLASS1212 tc = new TRIALCLASS1212();
		
		THREADCLASS111 thci = new THREADCLASS111("SGsubuuu");
		THREADCLASS222 thcii = new THREADCLASS222("GSgituuu");
		THREADCLASS333 thciii = new THREADCLASS333("SGshreyans");
		
		thci.start();
		thcii.start();
		thciii.start();
		
		System.out.println("Hello there, I'm Main THread...");

	}

}
