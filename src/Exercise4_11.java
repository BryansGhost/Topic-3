import java.util.Scanner;

public class Exercise4_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a decimal between 0 and 15
		System.out.print("Enter a decimal value (0 - 15): ");
		
		int decimal = input.nextInt();
		
		// Check if decimal is exactly one character
		if (decimal > 15 || decimal < 0) {
			System.out.println(decimal + " you must enter a value between 0 and 15");
			System.exit(1);
		}
		
		// Display hex value for decimal
		
		System.out.println("The hex value is " + Integer.toHexString(decimal).toUpperCase());
			
	}
}