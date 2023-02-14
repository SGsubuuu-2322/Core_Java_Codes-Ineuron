package Default_Package;

interface InterClassI{
	void disPlayI();
	void disPlayII();
}

class Adap_Cls implements InterClassI{
	@Override 
	public void disPlayI(){};
	
	@Override 
	public void disPlayII(){};
}

class ClsI extends Adap_Cls{
	@Override 
	public void disPlayI(){
		System.out.println("I'm the 1st method from Cls-I class...");
	}
}

class ClsII extends Adap_Cls{
	@Override
	public void disPlayII(){
		System.out.println("I'm the 2nd method from Cls-II class...");
	}
}

public class Adapter_Class {

	public static void main(String[] args) {
		ClsI clsi = new ClsI();
		ClsII clsii = new ClsII();
		
		clsi.disPlayI();
		clsii.disPlayII();

	}

}
