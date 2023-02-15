package MultiThreading;

class TrialClass{

	public synchronized void disPLAY(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello and Good-Morning Mr./Mrs. " + name + " :):):)");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("OOPS!!! I got interrupted...");
			}
		}
		
	}
}

class TrialThread extends Thread{
	TrialClass tc;
	String name;
	public TrialThread(TrialClass tc, String name){
		this.tc = tc;
		this.name = name;
	}
	
	public void run(){
		tc.disPLAY(name);
	}
}

public class MT16 {

	public static void main(String[] args) {
		
		TrialClass tc = new TrialClass();
		
		TrialThread tt1 = new TrialThread(tc, "SGsubuuu");
		TrialThread tt2 = new TrialThread(tc, "GSgituuu");
		
		tt1.start();
		tt2.start();
		
		System.out.println("Hello I'm main Thread....");
 
	}

}
