import java.util.Scanner;

public class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter their information
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours: ");
			double hours = input.nextInt();
		
		System.out.print("Enter hourly pay: $");
			double pay = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: %");
			double federalRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: %");
			double stateRate = input.nextDouble();
		
		// Display employee information
		System.out.println(" ");
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay rate: " + pay);
			double grossPay = (hours * pay);
			
		System.out.printf("Gross pay: $%4.2f\n", grossPay);
		System.out.println("Deductions:");					
		System.out.printf("\tFederal Withholding (%.1f%%): $%.2f\n", federalRate * 100, federalRate * grossPay );					
		System.out.printf("\tState Withholding (%.1f%%): $%.2f\n", stateRate * 100, stateRate * grossPay);					
		System.out.printf("\tTotal Deductions: $%.2f\n", (stateRate + federalRate) * grossPay);
		System.out.printf("Net Pay: $%.2f", (1 - stateRate - federalRate) * grossPay);
	}
}