package Assignment1;

import java.util.Scanner;

public class NumberSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Input second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Swap numbers using a temporary variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        // Display swapped numbers
        System.out.println("Swapped Numbers: First = " + firstNumber + ", Second = " + secondNumber);

        // Close the scanner
        scanner.close();
    }
}
