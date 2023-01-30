package Lambda_Exp;


@FunctionalInterface
interface SampleI{
	void diSp();
}

public class LE1 {

	public static void main(String[] args) {
		
		
		SampleI si = ()-> System.out.println("Hello All Java Learnersss...");
		
		si.diSp();
		
		

	}

}
