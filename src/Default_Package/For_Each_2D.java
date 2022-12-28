package Default_Package;

public class For_Each_2D {

	public static void main(String[] args) {
		int [][] arr1 = {{2,4,6},{12,23,34,45},{123,234,345,456,567}};
		int [][][] arr2 = {{{1,2,3},{12,23},{123,234,345,456,567}},{{1,2,3},{1,2},{10,20,30},{230,34}}};
		
		System.out.println("2D Array is as follows :- ");
		System.out.print("[");
		for(int ar[]:arr1){
			System.out.print("[");
			for(int a:ar){
				System.out.print(a + " ");
			}
			System.out.print("]");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.println("3D Array is as follows :- ");
		System.out.print("[");
		for(int ar[][]:arr2){
			System.out.print("[");
			for(int a[]:ar){
				System.out.print("[");
				for(int b:a){
					System.out.print(b + " ");
				}
				System.out.print("]");
			}
			System.out.print("]");
		}
		System.out.print("]");
		

	}

}
