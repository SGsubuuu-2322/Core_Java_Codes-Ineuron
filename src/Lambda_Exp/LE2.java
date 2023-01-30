package Lambda_Exp;

@FunctionalInterface
interface SamplI{
	void disPlay();
}

public class LE2 {

	public static void main(String[] args) {
		
		SamplI sa = ()->
		{
			System.out.println("Hello All Java Geeks....");
		};
		
		sa.disPlay();

	}

}
