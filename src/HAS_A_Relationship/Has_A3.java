package HAS_A_Relationship;


class Carr{
	public void disPlay(){
		System.out.println("This is the display method from a dependent object for a bmw targeted object...");
	}
}

class BMW{
	public Carr carr;
	
	public void setter(){
		carr = new Carr();
	}
	
}

public class Has_A3 {

	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.setter();
		bmw.carr.disPlay();

	}

}
