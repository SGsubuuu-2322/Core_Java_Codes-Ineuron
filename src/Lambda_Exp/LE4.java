package Lambda_Exp;

interface SPI{
	void add(int...arr);
}

public class LE4 {

	public static void main(String[] args) {
		
		SPI spi = (int...narr)->
		{
			int sum = 0;
			for(int elem : narr)
				sum += elem;
			
			System.out.println(sum);
		};
		
		spi.add(25,25,25,25);

	}

}
