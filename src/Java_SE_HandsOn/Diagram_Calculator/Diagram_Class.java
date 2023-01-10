package Java_SE_HandsOn.Diagram_Calculator;
import java.util.*;

abstract public class Diagram_Class {
	
	public static Scanner ip = new Scanner(System.in);
	public static double pi = 3.14;

	abstract public void inputData();
	abstract public void computeAreaSolution();
	abstract public void computeParameterSolution();
	abstract public void displayAreaSolution();
	abstract public void displayPeriSolution();
}
