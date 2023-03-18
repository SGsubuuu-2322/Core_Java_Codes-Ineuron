package Default_Package;

class Join extends Thread{
	
	@Override 
	public void run(){
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Hello SGsubuuu...");
		}
	}
}

public class MT6 {

	public static void main(String[] args) throws InterruptedException {
		Join jn = new Join();
		jn.start();
		
		for(int i = 0; i < 5; i++){
			jn.join();
			System.out.println("GSgituuu:):):)");
		}

	}

}
