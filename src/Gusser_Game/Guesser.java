package Gusser_Game;
import java.math.*;
import java.util.*;

public class Guesser {

	private int guessNum;
	public void guessNUM(){
		Scanner ip = new Scanner(System.in);
		System.out.println("Guesser please guess a number :- ");
		int num = ip.nextInt();
		guessNum = num;
	}
	
	public int getNum(){
		return guessNum;
	}

}
