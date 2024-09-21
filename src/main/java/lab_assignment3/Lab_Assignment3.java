import java.util.Scanner;

public class Lab_Assignment3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int round = 1;
		boolean on = true;

		while (on) {

			System.out.println("Round " + round + ":");
			System.out.println("Type any number to roll dice (Type -1 to quit rolling).");
			int input = scanner.nextInt();

			if (input == -1) {
				System.out.println("Thanks for rolling!");
				break;
			}
			
			int die1 = rollDice();
			int die2 = rollDice();
			int sum = addDice(die1, die2);

			String result = addResult(sum);
			String prizes = assignPrizes(result);

			printResult(die1, die2, sum, result, prizes);
			round++;
		}

		scanner.close();
		
	}

	public static int rollDice() {
		int number = (int) (Math.random() * 6) + 1;
		return number;
	}

	public static int addDice(int die1, int die2) {
		return die1 + die2;
	}

	public static String addResult(int sum) {
		if (sum == 12) {
			return "Result is 12.";
		} else if (sum >= 6 && sum <= 11) {
			return "Result is between 6 and 11.";
		} else if (sum >= 2 && sum <= 5) {
			return "Result is between 2 and 5.";
		} else {
			return "Result is less than 2.";
		}
	}

	public static String assignPrizes(String result) {
		switch (result) {
			case "Result is 12":
				return "You won the Grand Prize!";
			case "Result is between 6 and 11.":
				return "You won the Second Prize!";
			case "Result is between 2 and 5.":
				return "You won the Third Prize!";	
			default:
				return "No prize. Better luck next time!";
		}
	}

	public static void printResult(int die1, int die2, int sum, String result, String prizes) {
		System.out.println("Die 1: " + die1 + ", " + "Die 2: " + die2);
		System.out.println("Sum of dice: " + sum);
		System.out.println("Result: " + result);
		System.out.println("Prize: " + prizes);
	}
	
}