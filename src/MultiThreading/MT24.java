package MultiThreading;

class ETClass extends Thread{
	int total = 0;
	
	@Override
	public void run(){
		synchronized(this){
			for(int i = 0; i < 15; i++){
				total += i;
//				try{
//					Thread.sleep(2000);
//				}catch(InterruptedException ie){
//					System.out.println("OOPS!!! I got interrupted...");
//				}
			}
			this.notifyAll();
		}
	}
}

class TrialThreadClass{
	
	public void disPlay(int num, int no){
		System.out.println("This is the object no." + no);
		System.out.println(num + "is the answer...");
	}
}

public class MT24 {

	public static void main(String[] args) throws InterruptedException {
		
		ETClass etc = new ETClass();
		TrialThreadClass tt1 = new TrialThreadClass();
		TrialThreadClass tt2 = new TrialThreadClass();
		
		etc.start();
		
		synchronized(etc){
			System.out.println("Before Updation the value of the sum is : " + etc.total);
			etc.wait();
			tt1.disPlay(etc.total, 1);
			
		}
		
		synchronized(etc){
			System.out.println("Before Updation the value of the sum is : " + etc.total);
			etc.wait();
			tt2.disPlay(etc.total, 2);
			
		}
		

	}

}
