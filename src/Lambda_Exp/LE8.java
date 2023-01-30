package Lambda_Exp;

interface StringPassI{
	String str(String s);
}

public class LE8 {

	public static void main(String[] args) {
		
		StringPassI spi1 = (s1)-> s1 + " SGsubu";
		StringPassI spi2 = (s2)-> s2 + " GSgituuu";
		
		perFormance("Hello", spi1);
		perFormance("Hii", spi2);

	}
	
	public static void perFormance(String stng, StringPassI spi){
		String result = spi.str(stng);
		System.out.println(result);
	}
	
	

}
