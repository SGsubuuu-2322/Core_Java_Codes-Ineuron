package VAR_ARG;

public class VA2 {
	
	public void add(int... in){
		int sum = 0;
		System.out.println("Vatiable_Argument approach");
		for(int vin : in){
				sum += vin;
		}
		System.out.println(sum);
		System.out.println();
	}

	public static void main(String[] args) {
		
		VA2 va2 = new VA2();
		va2.add(12, 32);
		va2.add(12, 21, 23, 32);
		

	}

}
