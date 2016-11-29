import java.util.Scanner;

public class Exercise6_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three numbers
		System.out.print("Enter three numbers:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		// Display numbers method
		displaySortedNumbers(num1, num2, num3);
}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		if (num3 > num2) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}

		if (num2 > num1) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num3 > num2) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		// Display numbers in incresed order
		System.out.println("The numbers entered in incresed order is " + num3 + " "
				+ num2 + " " + num1);
 		}
}