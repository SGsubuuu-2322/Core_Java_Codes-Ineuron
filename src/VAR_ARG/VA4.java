package VAR_ARG;

public class VA4 {
	
	
	public void add1(int... in){
		int sum = 0;
		for(int i: in)
			sum += i;
		System.out.println("Total Sum : " + sum);
		System.out.println();
	}
	
	public void add2(int [] in){
		
		int sum = 0;
		for(int i: in)
			sum += i;
		System.out.println("Total Sum : " + sum);
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		VA4 va4 = new VA4();
		va4.add1(12);
		va4.add1(12, 21, 23, 34);
		
		System.out.println();
		
//		va4.add2(12);
//		va4.add2(12, 21, 23, 34);

	}

}
