package Default_Package;

class Parentt{
	public void disPlay(){
		System.out.println("Hello I'm the parent class...");
	}
}

class Childd{
	Parentt pt;
	public Childd(Parentt pt){
		this.pt = pt;
	}
	
	public void run(){
		pt.disPlay();
	}
	
	
}

public class RandomClass {

	public static void main(String[] args) {
		Parentt pt = new Parentt();
		Childd cd = new Childd(pt);
		
		cd.run();

	}

}
