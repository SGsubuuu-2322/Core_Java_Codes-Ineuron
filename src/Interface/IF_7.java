package Interface;


interface ISIF1{
	void metHod1();
}

interface ISIF2{
	void metHod1(int i);
}

class SIFImpl implements ISIF1, ISIF2{
	
	public void metHod1(){
		System.out.println("This is first method from first interfce ...");
	}
	
	public void metHod1(int i){
		System.out.println("This is second method from second interface...");
	}
	
}

public class IF_7 {

	public static void main(String[] args) {
		
		SIFImpl sif = new SIFImpl();
		sif.metHod1();
		sif.metHod1(12);

	}

}
