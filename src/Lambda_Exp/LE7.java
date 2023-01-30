package Lambda_Exp;

@FunctionalInterface
interface Samplee1I{
	void add(int ... arr1);
}

@FunctionalInterface
interface Samplee2I{
	void sub(int ... arr2);
}

public class LE7 {

	public static void main(String[] args) {
		Samplee1I sl1i = (int ... arr1)->
		{
			int sum = 0;
			for(int elem : arr1)
				sum += elem;
			
			
			System.out.println("So, total sum is : " + sum);
		};
		
		Samplee2I sl2i = (int ... arr2)->
		{
			int sub = arr2[0];
			for(int i = 1; i < arr2.length; i++)
				sub -= arr2[i];
			
			
			System.out.println("So, Total sub is : " + sub);
		};
		
		
		sl1i.add(12,12,1,25);
		sl2i.sub(50,25,5,10);

	}

}
