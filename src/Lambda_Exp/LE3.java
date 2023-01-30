package Lambda_Exp;

interface SmpI{
	void disPlayy();
}

public class LE3 {

	public static void main(String[] args) {
		SmpI smp = new SmpI(){
			public void disPlayy(){
				System.out.println("Hello All Java Learners...");
			}
		};
		
		smp.disPlayy();

	}

}
