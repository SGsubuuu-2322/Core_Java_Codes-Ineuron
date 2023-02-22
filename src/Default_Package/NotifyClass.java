package Default_Package;

class TrialThreads{
	
	public void disPlay(int num){
		System.out.println("So, the number after the updation is : " + num);
	}
}

class EThreads extends Thread{
	int total = 0;
	
	@Override 
	public void run(){
		synchronized(this){
			for(int i = 0; i < 5; i++){
				total += i;
			}
			
			this.notify();
		}
	}
}

public class NotifyClass {

	public static void main(String[] args) throws InterruptedException {
		
		TrialThreads tts1 = new TrialThreads();
		TrialThreads tts2 = new TrialThreads();
		
		EThreads et = new EThreads();
		
		et.start();
		
		synchronized(et){
			System.out.println("The value of the number before the updation is : " + et.total);
			
			et.wait();
			
			tts1.disPlay(et.total);
		}
		
		synchronized(et){
			System.out.println("The value of the number before the updation is : " + et.total);
			
			et.wait();
			
			tts2.disPlay(et.total);
		}

	}

}
