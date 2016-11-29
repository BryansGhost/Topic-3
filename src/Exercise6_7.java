import java.util.Scanner;

public class Exercise6_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter investment amount
		System.out.println("Enter the investment amount: ");
		double investment = input.nextDouble();
		
		// Prompt user to enter annual interest rate
		System.out.println("Enter the annual interest rate: ");
		double interestRate = input.nextDouble();
		
		// Display table
		System.out.println("Years       Future Interest");
		for (int i = 0; i < 30; i++) {
			System.out.printf("%2d%25.2f\n", i + 1, futureInvestmentValue(
					investment, interestRate, i + 1));
		}

	}
		public static double futureInvestmentValue(double investment, double interestRate, int years) {
			
			return investment * Math.pow((1 + interestRate / 100), (years * 12));
		}
}