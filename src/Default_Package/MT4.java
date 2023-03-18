package Default_Package;

class MyThreads extends Thread{
	@Override
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello SGsubuuu...");
		}
	}
}

public class MT4 {

	public static void main(String[] args) {
		
		MyThreads mt = new MyThreads();
		mt.setPriority(8);
		
		mt.start();
		
		for(int i = 0; i < 5; i++){
			System.out.println("Hiii GSgituuu");
		}

	}

}
