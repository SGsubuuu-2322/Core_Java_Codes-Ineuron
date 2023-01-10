package Java_SE_HandsOn.Diagram_Calculator;

public class Rectangle_Class extends Diagram_Class{
	
	private static double length;
	private static double breadth;
	private static double periSol;
	private static double areaSol;

	@Override
	public void inputData() {
		System.out.println("Now, you'hv to enter the value for the \"LENGTH\" of your rectangle :- ");
		length = ip.nextDouble();
		System.out.println("Now, you'hv to enter te value for the \"BREADTH\" of your rectangle :- ");
		breadth = ip.nextDouble();
		
	}

	@Override
	public void computeAreaSolution() {
		areaSol = length*breadth;
		
	}

	@Override
	public void computeParameterSolution() {
		periSol = 2*(length + breadth);
		
	}

	@Override
	public void displayAreaSolution() {
		System.out.println("So, the area of your rectangle is about : " + areaSol);
		
	}

	@Override
	public void displayPeriSolution() {
		System.out.println("So, the perimeter of your rectangle is about : " + periSol);
		
	}

}
