package Inner_Class;

class AA{
	
	public void disPlay(){
		System.out.println("Hulululu....");
	}
	
}

public class IC_3{

	public static void main(String[] args) {
		AA aa = new AA() {
			public void disPlay(){
				System.out.println("Halalala...");
			}
		};
		
		aa.disPlay();

	}

}
