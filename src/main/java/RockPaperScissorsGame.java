import java.util.Scanner;

public class RockPaperScissorsGame {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Pick the first choice (rock, paper or scissors): ");
		String firstInput = input.next();

		System.out.println("Pick the second choice (rock, paper or scissors): ");
		String secondInput = input.next();

		if (firstInput.equals("rock") && secondInput.equals("scissors")) {
			System.out.println("Player 1 wins!");
		} 
		else if (firstInput.equals("scissors") && secondInput.equals("rock")) {
			System.out.println("Player 2 wins!");
		}
		else if (firstInput.equals("paper") && secondInput.equals("rock")) {
			System.out.println("Player 1 wins!");
		}
		else if (firstInput.equals("rock") && secondInput.equals("paper")) {
			System.out.println("Player 2 wins!");
		}
		else if (firstInput.equals("scissors") && secondInput.equals("paper")) {
			System.out.println("Player 1 wins!");
		}
		else if (firstInput.equals("paper") && secondInput.equals("scissors")) {
			System.out.println("Player 2 wins!");
		}
		else if (firstInput.equals(secondInput)) {
			System.out.println("Tie. No winner!");
		}
		else {
			System.out.println("Invalid choice!");
		}
		
	}
	
}