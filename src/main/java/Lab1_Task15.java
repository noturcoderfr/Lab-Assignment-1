// Write a program that prints the balance of an account after the first, second, and third year. The account has an initial balance of $1,000 and earns 5 percent interest per year. 

// (Hint: Calculate first year interest. The first year balance will be the sum of initial balance and first year interest. Then continue to calculate second year balance using first year balance and so on.)

// -----Summary-----
// An account with initial balance of $1000 earns 5% interest per year:
//		Outcome ---> $1000 would increase to $1050 after a year.

// Expected output:
// First year: $1050
// Second year: $1102.50
// Third year: $1157.625 / $1157.63

// -----Program-----
// Declare and initialise variables:
//		- inBalance ( initial balance )
//		- ipYear ( interest per year )
//		- balance1 ( first year balance )
//		- balance2 ( second year balance )
//		- balance3 ( third year balance )

// Create 3 static methods to calculate each year's balance after gaining interest:
//		- new balance = initial balance + ( initial balance * 0.05 interest )
//		- Print strings stating the year with its respective new amount after interest.


public class Lab1_Task15 {

	public static double first_year(double inBalance, double ipYear) {  // First static method.
		double balance1 = inBalance + (inBalance * ipYear);  // Calculates the balance after interest of the first year.
		System.out.println("First year: $" + balance1);
		return balance1;  // Return balance1 to be used in second year method.
		
	}

	public static double second_year(double balance1, double ipYear) {  // Second static method.
		double balance2 = balance1 + (balance1 * ipYear);  // Calculates the balance after interest of the second year.
		System.out.println("Second year: $" + balance2);
		return balance2;  // Return balance2 to be used in third year method.
		
	}

	public static double third_year(double balance2, double ipYear) {  // Third static method.
		double balance3 = balance2 + (balance2 * ipYear);  // Calculates the balance after interest of the third year.
		System.out.println("Third year: $" + balance3);
		return balance3;  // Return balance3.
		
	}

	public static void main(String[] args) {
		
		double inBalance = 1000;
		double ipYear = (double) 5/100;

		double balance1 = first_year(inBalance, ipYear);  // Store the returned value
		double balance2 = second_year(balance1, ipYear);  // Store the returned value
		double balance3 = third_year(balance2, ipYear);  // Store the returned value
		
	}
	
}