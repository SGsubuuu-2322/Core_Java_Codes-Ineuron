package Default_Package;

@FunctionalInterface
interface IntClsI{
	void disPlay();
}

class ImplClss{
	IntClsI ici = ()->{
		for(int i = 0; i < 5; i++)
			System.out.println("Hello Guys!!! Wassup...");
	};
}

public class Lambda_Exp {

	public static void main(String[] args) {
		ImplClss ipl = new ImplClss();
		ipl.ici.disPlay();

	}

}
