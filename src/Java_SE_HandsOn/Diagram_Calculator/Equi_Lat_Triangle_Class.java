package Java_SE_HandsOn.Diagram_Calculator;

public class Equi_Lat_Triangle_Class extends Diagram_Class{
	
	private static double sides;
	private static double areaSol;
	private static double periSol;

	@Override
	public void inputData() {
		System.out.println("Now, enter the value for the sides of your triangle :- ");
		sides = ip.nextDouble();
		
	}

	@Override
	public void computeAreaSolution() {
		areaSol = (1.73/4)*(sides*sides);
		
	}

	@Override
	public void computeParameterSolution() {
		periSol = 3*sides;
		
	}

	@Override
	public void displayAreaSolution() {
		System.out.println("So, the area of your equilateral triangle is : " + areaSol);
		
	}

	@Override
	public void displayPeriSolution() {
		System.out.println("So, the perimeter of your equilateral triangle is : " + periSol);
		
	}

}
