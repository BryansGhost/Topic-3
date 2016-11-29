import java.util.Scanner;

public class Exercise6_3 {
	// Main Method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter an integer 
		System.out.println("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
			}
		else {
			System.out.println(number + " is not a palindrome.");
		}
	}
	
		// Return the reversal of an integer, i.e., reverse(456) returns 654
		public static int reverse(int number) {
			int reverse = 0;
			int digit;
			
			do {
				digit = number % 10;
				reverse = reverse * 10 + digit;
				number /= 10;
			}   
				while (number != 0);
			
			return reverse;
		}
			
		//Return true if number is a palindrome
		public static boolean isPalindrome(int number) {
			return (number == reverse(number));
			
		}
}