public class Exercise6_12 {
	public static void main(String[] args) {
		printChars('1', 'Z', 10);
		
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int numberOfPrintedChars = 0;
		
		for (; ch1 <= ch2; ch1++) {
			System.out.println(ch1 + " ");
			numberOfPrintedChars++;
			
			if (numberOfPrintedChars % numberPerLine == 0) {
				System.out.println();
			}
		}
	}
}