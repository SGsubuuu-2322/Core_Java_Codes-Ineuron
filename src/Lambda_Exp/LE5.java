package Lambda_Exp;

interface SLI{
	void add(int...arr1);
	void sub(int...arr2);
}

public class LE5 {

	public static void main(String[] args) {
		SLI sli = new SLI(){
			public void add(int...arr1){
				int sum = 0;
				for(int elem : arr1)
					sum += elem;
				
				System.out.println("So, Total Sum is : " + sum);
			}
			
			public void sub(int...arr2){
				int sub = arr2[0];
				for(int i = 1; i < arr2.length; i++)
					sub -=arr2[i];
//				for(int elem : arr2)
//					sub -= elem;
				
				System.out.println("So, Total sub is : " + sub);
			}
		};
		
		sli.add(25, 50, 35, 50);
		sli.sub(50, 25, 5, 10);

	}

}
