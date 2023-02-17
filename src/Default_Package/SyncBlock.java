package Default_Package;

class SyncBlockClass{
	
	public void syncBlockMet(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello MR.SGshreyansss Good Morning dear sir...");
		}
		
		synchronized(this){
			for(int i = 0; i < 5; i++){
				System.out.println("Hello Mr./Mrs. " + name + " Good AfterNoon dear sir/ma'am....");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie){
					System.out.println("Hello there I got interrrupted...");
				}
			}
		}
		
		for(int i = 0; i < 5; i++){
			System.out.println("Hello Mr.GSshreyansss Good Night dear sir...");
		}
	}
	
}

class MyThreadClass extends Thread{
	SyncBlockClass sbc;
	String name;
	
	public MyThreadClass(SyncBlockClass sbc, String name){
		this.sbc = sbc;
		this.name = name;
	}
	
	@Override
	public void run(){
		sbc.syncBlockMet(name);
	}
}

public class SyncBlock {

	public static void main(String[] args) {
		SyncBlockClass sbc = new SyncBlockClass();
		
		MyThreadClass mtc1 = new MyThreadClass(sbc, "SGgituuu");
		MyThreadClass mtc2 = new MyThreadClass(sbc, "GSsubuuu");
		
		mtc1.start();
		mtc2.start();
		
		System.out.println("Hello there I'm main method...");

	}

}
