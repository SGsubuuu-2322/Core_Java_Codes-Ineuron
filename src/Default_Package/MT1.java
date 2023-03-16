package Default_Package;

class MThreading extends Thread{
	@Override 
	public void run(){
		for(int i = 0; i < 5; i++)
			System.out.println("SGlipuuu");
	}
}

public class MT1 {

	public static void main(String[] args) {
		MThreading mt = new MThreading();
		mt.start();
		for(int i = 0; i < 5; i++)
			System.out.println("GSsubuuuu...");

	}

}
