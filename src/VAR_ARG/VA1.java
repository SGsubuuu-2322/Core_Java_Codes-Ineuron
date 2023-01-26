package VAR_ARG;

public class VA1 {
	
	public void met1(int... arg){
		System.out.println("Var-Args Approach...");
	}
	
	public static void main(String[] args){
		
		VA1 va = new VA1();
		va.met1(12);
		va.met1(12,32);
		va.met1(32, 32, 43);
		
	}

}
