package Default_Package;

class Yield extends Thread{
	@Override
	public void run(){
		for(int i = 0; i < 5; i++) {
			System.out.println("Child_Thread-Hello SGsubuuu...");
						
		}
	}
}

public class MT5 {

	public static void main(String[] args) {
		Yield yd = new Yield();
		yd.start();
		
		for(int i = 0; i < 5; i++){
			System.out.println("Main_Thread-GSgituuu:):):)");
			Thread.yield();
		}

	}

}
