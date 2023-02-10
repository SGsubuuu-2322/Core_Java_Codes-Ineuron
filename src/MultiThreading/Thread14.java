package MultiThreading;

public class Thread14 {

	public static void main(String[] args) {
		new Thread(
				()->{
					for(int i = 0; i < 5; i++)
						System.out.println("Hello I'm Child Thread!!!...");
				}
				).start();
		
		
		System.out.println("Hii I'm Main Thread!!..");

	}

}
