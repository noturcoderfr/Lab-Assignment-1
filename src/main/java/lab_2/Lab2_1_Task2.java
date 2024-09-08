import java.util.Scanner;

public class Lab2_1_Task2 {

	public static void calcpInflation(double cAmount, double cYear, double pYear) {
		double amountpYear = cAmount * Math.pow(0.97, pYear - cYear);
		System.out.printf("The amount for year %.0f is %f", pYear, amountpYear);
	}

	public static void calcf1Inflation(double cAmount, double cYear, double f1Year) {
		double amountf1Year = cAmount * Math.pow(0.97, f1Year - cYear);
		System.out.printf("The amount for year %.0f is %f", f1Year, amountf1Year);
	}

	public static void calcf2Inflation(double cAmount, double cYear, double f2Year) {
		double amountf2Year = cAmount * Math.pow(0.97, f2Year - cYear);
		System.out.printf("The amount for year %.0f is %f", f2Year, amountf2Year);
	}
	
	public static void main(String[] args) {

		double cAmount = 1000;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Input the current year : ");
		double cYear = input.nextDouble();
		
		System.out.print("Input a year in the past : ");
		double pYear = input.nextDouble();

		System.out.print("Input a year in the future : ");
		double f1Year = input.nextDouble();

		System.out.print("Input another year in the future : ");
		double f2Year = input.nextDouble();

		System.out.printf("The current amount is %.0f", cAmount);
		System.out.println();
		System.out.printf("The current year is %.0f", cYear);
		System.out.println();
		
		calcpInflation(cAmount, cYear, pYear);
		System.out.println();
		calcf1Inflation(cAmount, cYear, f1Year);
		System.out.println();
		calcf2Inflation(cAmount, cYear, f2Year);
		
	}
	
}