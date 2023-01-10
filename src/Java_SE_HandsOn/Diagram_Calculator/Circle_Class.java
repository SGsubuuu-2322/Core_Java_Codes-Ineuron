package Java_SE_HandsOn.Diagram_Calculator;

public class Circle_Class extends Diagram_Class{
	
	private static double radius;
	private static double areaSol;
	private static double periSol;

	@Override
	public void inputData() {
		System.out.println("Now, enter the value for the radius of your circle :- ");
		radius = ip.nextDouble();
		
	}

	@Override
	public void computeAreaSolution() {
		areaSol = pi*(radius*radius);
		
	}

	@Override
	public void computeParameterSolution() {
		periSol = 2*(pi*radius);
		
	}

	@Override
	public void displayAreaSolution() {
		System.out.println("So, the area of your circle is : " + areaSol);
		
	}

	@Override
	public void displayPeriSolution() {
		System.out.println("So, the perimeter of your circle is : " + periSol);
		
	}

}
