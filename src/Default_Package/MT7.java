package Default_Package;

class Joins extends Thread{
	static Thread mt;
	
	@Override
	public void run(){
		
		for(int i = 0; i < 5; i++){
			try {
				mt.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("SGsubuuu...");
		}
	}
}

public class MT7 {

	public static void main(String[] args) {
		Joins.mt = Thread.currentThread();
		
		Joins jn = new Joins();
		
		jn.start();
		
		for(int i = 0; i < 5; i++){
			Thread.yield();
			System.out.println("GSgituuu:):):)");
		}

	}

}
