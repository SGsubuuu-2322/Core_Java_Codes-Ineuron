package Lambda_Exp;

interface Sample1I{
	void add(int...arr1);
	void sub(int...arr2);
}

interface Sample2I{
	void div(int...arr1);
	void mul(int...arr2);
}

public class LE6 {

	public static void main(String[] args) {
		
		Sample1I sli = new Sample1I(){
			public void add(int...arr1){
				int sum = 0;
				for(int elem : arr1)
					sum += elem;
				
				System.out.println("So, Total Addition is : " + sum);
			}
			
			public void sub(int...arr2){
				int sub = arr2[0];
				for(int i = 1; i < arr2.length; i++)
					sub -=arr2[i];
//				for(int elem : arr2)
//					sub -= elem;
				
				System.out.println("So, Total Substraction is : " + sub);
			}
		};
		
		
		Sample2I slii = new Sample2I(){
			public void mul(int...arr1){
				int mul = 1;
				for(int elem : arr1)
					mul *= elem;
				
				System.out.println("So, Total Multiplication value is : " + mul);
			}
			
			public void div(int...arr2){
				int div = arr2[0];
				for(int i = 1; i < arr2.length; i++)
					div /= arr2[i];
				
				
				System.out.println("So, Total division is : " + div);
			}
		};
		
		sli.add(10,20,30,40,50);
		sli.sub(150,40,30,20,10);
		
		System.out.println();
		
		slii.mul(10,20,30);
		slii.div(100,10,2);
		
		

	}

}
