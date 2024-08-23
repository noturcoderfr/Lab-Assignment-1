public class Lab1_Task15 {

	static double balance1, balance2, intYear;
	
	public static void first_year(double iniBalance, double intYear) {
		double balance1 = iniBalance + (iniBalance * intYear);
		System.out.println("First year: " + balance1);
	}

	public static void second_year(double balance1, double intYear) {
		double balance2 = balance1 + (balance1 * intYear);
		System.out.println("Second year: " + balance2);
	}

	public static void third_year(double balance2, double intYear) {
		double balance3 = balance2 + (balance2 * intYear);
		System.out.println("Third year: " + balance3);
	}
	
	public static void main(String[] args) {

		double iniBalance = 1000;
		double intYear = (double) 5/100;

		first_year(iniBalance, intYear);
		second_year(balance1, intYear);
		third_year(balance2, intYear);
		
	}

}