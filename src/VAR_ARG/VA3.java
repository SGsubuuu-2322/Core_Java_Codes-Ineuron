package VAR_ARG;

public class VA3 {
	
	public void add(int ... in){
		int sum = 0;
		for(int i = 0; i < in.length; i++)
			sum += in[i];
		
		System.out.println("Total Sum : " + sum);
		System.out.println();
	}
	
	public void add(int in){
		
		System.out.println("Total Sum : " + in);
		System.out.println();
	}

	public static void main(String[] args) {
		
		VA3 va3 = new VA3();
		va3.add(12);
		va3.add(12, 21, 23, 32);

	}

}
