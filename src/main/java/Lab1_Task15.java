public class Lab1_Task15 {

	public static double first_year(double iniBalance, double intYear) {
		double balance1 = iniBalance + (iniBalance * intYear);
		System.out.println("First year: " + balance1);
		return balance1; // Return the calculated balance
	}

	public static double second_year(double balance1, double intYear) {
		double balance2 = balance1 + (balance1 * intYear);
		System.out.println("Second year: " + balance2);
		return balance2; // Return the calculated balance
	}

	public static double third_year(double balance2, double intYear) {
		double balance3 = balance2 + (balance2 * intYear);
		System.out.println("Third year: " + balance3);
		return balance3; // Return the calculated balance
	}

	public static void main(String[] args) {

		double balance1 = 0;
		double balance2 = 0;
		double balance3 = 0;

		double iniBalance = 1000;
		double intYear = (double) 5/100;

		balance1 = first_year(iniBalance, intYear); // Store the returned value
		balance2 = second_year(balance1, intYear); // Store the returned value
		balance3 = third_year(balance2, intYear); // Store the returned value
	}
}