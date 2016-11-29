import java.util.Scanner;

public class Exercise4_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter lattitude and longitude
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		
		// Compute great circle distance
		double d = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		// Display results
		System.out.println("The distance betewen the two points is " + d + " km!");

	}

}
