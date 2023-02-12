package MultiThreading;

class DisPlay{
	public void disPlay(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Good Morning" + " " + name);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println(name + "Got Interrupted...");
			}
		}
	}
}

class ThreadClass11 extends Thread{
	DisPlay dp;
	String name;
	
	ThreadClass11(DisPlay dp, String name){
		this.dp = dp;
		this.name = name;
	}
	
	@Override
	public void run(){
		dp.disPlay(name);
	}
}

public class MT14 {

	public static void main(String[] args) {
		DisPlay dp = new DisPlay();
		ThreadClass11 tc11 = new ThreadClass11(dp, "SGsubu");
		tc11.start();
		
		System.out.println("This is a main thread...");

	}

}
