import java.util.Scanner;

public class Lab2_2_Task4 {

	public static void calculateRectangle (double rectangleWidth, double rectangleLength) {
		double rectangleArea = rectangleWidth * rectangleLength;
		System.out.printf("Area of rectangle = %.2f", rectangleArea);

		double rectanglePerimeter = (2 * rectangleLength) + (2 * rectangleWidth);
		System.out.printf("Perimeter of rectangle = %.2f", rectanglePerimeter);
	}

	public static void calculateCircle (double circleRadius) {
		double circleArea = Math.PI * Math.pow(circleRadius, 2);
		System.out.printf("Area of circle = %.2f", circleArea);
		
		double circleCircumference = 2 * Math.PI * circleRadius;
		System.out.printf("Circumference of circle = %.2f", circleCircumference);
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Choice:");
		System.out.println("1. Find area and perimeter of a rectangle.");
		System.out.println("2. Find area and circumference of a circle.");

		System.out.print("Input your choice (1 or 2): ");
		int choice = input.nextInt();

		if (choice == 1) {
			calculateRectangle(rectangleWidth, rectangleLength);
		} else if {
			calculateCircle(circleRadius);
		} else {
			System.out.println("Error: Wrong menu choice");
		}
		


		
	}
	
}