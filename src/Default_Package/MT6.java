package Default_Package;

class Join extends Thread{
	
	@Override 
	public void run(){
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Hello SGsubuuu...");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println("OOPsss!!!! I'got interrupted...");
			}
		}
	}
}

public class MT6 {

	public static void main(String[] args) throws InterruptedException {
		Join jn = new Join();
		jn.start();
		
		for(int i = 0; i < 5; i++){
			jn.join(2000);
			System.out.println("GSgituuu:):):)");
		}

	}

}
