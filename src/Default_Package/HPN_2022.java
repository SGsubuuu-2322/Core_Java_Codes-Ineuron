package Default_Package;

public class HPN_2022 {

	public static void main(String[] args) {
		int n = 7;
//		H
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(j == 0 || j == (3*n)/4 || i == (n-1)/2 && j <= (3*n)/4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == 0){
					if(j == 0 || j == (n-1))
						System.out.print("  ");
					else
						System.out.print("* ");
				}
				else if(i == (n/2) || j == 0 || j == (n-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			 System.out.println();
		}
		
//		E
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == 0 || i == (n/2) || i == (n-1) || j == 0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
