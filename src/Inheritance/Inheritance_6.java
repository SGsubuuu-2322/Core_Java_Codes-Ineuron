package Inheritance;
import java.util.*;

class Interest{
	
}

class InterestPersonalLoan extends Interest{
	
}

class Loans{
	
	public Interest interest(){
		Interest it = new Interest();
		return it;
	}
	
//	public int add() {
//		return 1;
//	}
}

class PersonalLoans extends Loans{
	
	public InterestPersonalLoan interest(){
		InterestPersonalLoan ipl = new InterestPersonalLoan();
		return ipl;
	}
	
//	public String add() {
//		return "laxman";
//	}
	
}
public class Inheritance_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
