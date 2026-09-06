
import java.util.Scanner;

/**
 * This program reads a specific number of integer values
 * and determines the maximum value among them.
 *
 * The first value indicates how many numbers will be processed.
 * The program stores the first number as the initial maximum
 * and compares the remaining values using a for loop.
 *
 * @author Santiago Gomez Pena
 */

public class MaximumSearch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Number of values that will be processed.
		int numberCount;
		
		// Stores the number currently being evaluated.
		long currentNumber;
		
		// Stores the maximum value found so far.
		long maximum;
		
		// Read the amount of numbers.
		numberCount = scanner.nextInt();
		
		// The first number becomes the initial maximum value.
		maximum = scanner.nextLong();
		
		// Read and compare the remaining numbers.
		for (int i = 1; i < numberCount; i++) {
			
			currentNumber = scanner.nextLong();
			
			// Update maximum only if the current number is greater.
			if (currentNumber > maximum) {
				maximum = currentNumber;
			}
		}
		
		// Print the maximum value found.
		System.out.println(maximum);
		
		scanner.close();

	}

}
