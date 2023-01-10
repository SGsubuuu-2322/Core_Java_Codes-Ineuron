package Java_SE_HandsOn.Diagram_Calculator;

public class Norm_Triangle_Class extends Diagram_Class{
	
	private static double base;
	private static double height;
	
	private static double side1;
	private static double side2;
	private static double side3;
	
	private static double areaSol;
	private static double periSol;

	@Override
	public void inputData() {
		System.out.println("Now, enter the value for the height of your triangle :- ");
		height = ip.nextDouble();
		System.out.println("Now, enter the value for the base of your triangle :- ");
		base = ip.nextDouble();
		System.out.println("Now, enter the value for the 1st side of your triangle :- ");
		side1 = ip.nextDouble();
		System.out.println("Now, enter the value for the 2nd side of your triangle :- ");
		side2 = ip.nextDouble();
		System.out.println("Now, enter the value for the 3rd side of your triangle :- ");
		side3 = ip.nextDouble();
		
	}

	@Override
	public void computeAreaSolution() {
		areaSol = 1/2*(base*height);
		
	}

	@Override
	public void computeParameterSolution() {
		periSol = side1 + side2 + side3;
		
	}

	@Override
	public void displayAreaSolution() {
		System.out.println("So, the area of your triangle is : " + areaSol);
	}

	@Override
	public void displayPeriSolution() {
		System.out.println("So, the perimeter of your triangle is : " + periSol);
		
	}

}
