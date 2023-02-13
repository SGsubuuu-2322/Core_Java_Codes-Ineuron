package MultiThreading;

class Action{
	
	public void showCase(String name){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello nd Good-Morning dear " + name + " Sir/Madam...");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("OOPS!!! I got interrupted...");
			}
		}
		
	}
	
}

class BusinesstcI extends Thread{
	Action ac;
	String name;
	
	public BusinesstcI(Action ac, String name) {
		this.ac = ac;
		this.name = name;
	}
	
	@Override 
	public void run(){
		ac.showCase(name);
	}
}

public class MT15 {

	public static void main(String[] args) {
		Action ac = new Action();
		
		BusinesstcI b1 = new BusinesstcI(ac, "SGsubuuu");
		BusinesstcI b2 = new BusinesstcI(ac, "GSgituuu");
		
		b1.start();
		
		b2.start();
		
		System.out.println("Hello there!!! I'm Main Thread...");
		
		

	}

}
