package Gusser_Game;
import java.util.*;

public class Umpire {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is a small guesser game :- ");
		System.out.println("In this game a guesser will guess a number and then multiple players have to guess that number to win...");
		System.out.println("So, to start and to continue this game press - '1' and to stop this press -  '-1' :- ");
		int choice = ip.nextInt();
		while(choice == 1){
			Guesser gr = new Guesser();
			gr.guessNUM();
			System.out.println("First of all you'hv to say the number of players :- ");
			int len = ip.nextInt();
			Player[] pl = new Player[len];
			
			
			System.out.println("Now, you all have to guess your individual number :- ");
			for(int i = 0; i < pl.length; i++){
				pl[i] = new Player();
				System.out.println("Player-" + (i+1) + " guess your number :- ");
				int num = ip.nextInt();
				pl[i].setNum(num);
			}
			
			for(int i = 0; i < pl.length; i++){
				int plNum = pl[i].getNum();
				int grNum = gr.getNum();
				if(plNum == grNum){
					System.out.println("So, player-" + i + " wins...");
				}
				else{
					System.out.println("So, player-" + i + " loses...");
				}
			}
			System.out.println("So, to play again this game press - '1' and to stop this press - '-1' :- ");
			choice = ip.nextInt();
		}
		System.out.println("Thanks for playing me and waiting for the next time...");
	}

}
