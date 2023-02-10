package MultiThreading;

public class MT13 {

	public static void main(String[] args) {
		
	 Thread t = new Thread(
				new Runnable(){
					@Override
					public void run(){
						for(int i = 0; i < 5; i++)
							System.out.println("Hello I'm Child Thread...");
					}
				}
				);
	 
	 t.start();
		

		
		System.out.println("Hello I'm Main Thread...");

	}

}
