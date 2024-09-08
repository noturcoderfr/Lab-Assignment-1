import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void menu() {
		System.out.println("Welcome to Rock, Paper and Scissors Game!");
		System.out.println("Choose an option: R, P or S.");
	}

	public static void gameWinner(char p1Choice, char p2Choice) {
		if ((p1Choice == 'R' || p1Choice == 'r') && (p2Choice == 'S' || p2Choice == 's')) {
			System.out.println("Rock beats Scissors. Player 1 wins!");
		} else if ((p1Choice == 'P' || p1Choice == 'p') && (p2Choice == 'R' || p2Choice == 'r')) {
			System.out.println("Paper beats Rock. Player 1 wins!");
		} else if ((p1Choice == 'S' || p1Choice == 's') && (p2Choice == 'P' || p2Choice == 'p')) {
			System.out.println("Scissors beat Paper. Player 1 wins!");
		} else if ((p1Choice == 'S' || p1Choice == 's') && (p2Choice == 'R' || p2Choice == 'r')) {
			System.out.println("Scissors beat Rock. Player 2 wins!");
		} else if ((p1Choice == 'R' || p1Choice == 'r') && (p2Choice == 'P' || p2Choice == 'p')) {
			System.out.println("Rock beats Paper. Player 2 wins!");
		} else if ((p1Choice == 'P' || p1Choice == 'p') && (p2Choice == 'S' || p2Choice == 's')) {
			System.out.println("Paper beats Scissors. Player 2 wins!");
		} else {
			System.out.println("Invalid input. Please try again!");
		}
		
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		menu();

		System.out.println("Player 1, enter your choice: ");
		char p1Choice = input.next().charAt(0);

		System.out.println("Player 2, enter your choice: ");
		char p2Choice = input.next().charAt(0);

		gameWinner(p1Choice, p2Choice);
		
	}

}