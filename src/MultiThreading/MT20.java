package MultiThreading;

class DisPlay1122{
	public void wishDish(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("SGsubuuu...");
		}
		
		synchronized(this){
			for(int i = 0; i < 5; i++){
				System.out.println(name + ":):):)");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie) {
					System.out.println("Hello I got Interrupted...");
				}
			}
		}
		
		for(int i = 0; i < 5; i++){
			System.out.println("SGshreyansss...");
		}
	}
}

class ThreadClass extends Thread{
	
	DisPlay1122 dw;
	String name;
	
	public ThreadClass(DisPlay1122 dw, String name){
		this.dw = dw;
		this.name = name;
	}
	
	@Override 
	public void run(){
		dw.wishDish(name);
	}
}

public class MT20 {

	public static void main(String[] args) {
		DisPlay1122 dp = new DisPlay1122();
		
		ThreadClass t1 = new ThreadClass(dp, "GSgituuu");
		ThreadClass t2 = new ThreadClass(dp, "SGsubuuu");
		
		t1.start();
		t2.start();
		
		System.out.println("Hello I'm Main method...");
	}

}
