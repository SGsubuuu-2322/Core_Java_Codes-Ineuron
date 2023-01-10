package Java_SE_HandsOn.Diagram_Calculator;

public class Square_Class extends Diagram_Class{
	private static double sides;
	private static double areaSol;
	private static double periSol;

	@Override
	public void inputData() {
		System.out.println("Now, enter the value for each sides of your square :- ");
		sides = ip.nextDouble();
	}
	
	@Override
	public void computeAreaSolution() {
		areaSol = sides*sides;
		
	}

	@Override
	public void computeParameterSolution() {
		periSol = 4*sides;
		
	}

	@Override
	public void displayAreaSolution() {
		System.out.println("So, the area of your square is : " + areaSol);
		
	}
	
	@Override
	public void displayPeriSolution() {
		System.out.println("So, the perimeter of your square is : " + periSol);
		
	}

	

}
