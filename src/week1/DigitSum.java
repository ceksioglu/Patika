package week1;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("This program calculates the sum of a number's digits.");
        System.out.println("Please enter a number:");
        int num = scanner.nextInt();
        // Close the scanner after reading the input
        scanner.close();
        // Initialize variables
        int tempNum = num;
        int result = 0;
        int digitCount = 0;
        // Find the digit count
        while (tempNum != 0) {
            tempNum /= 10;
            digitCount++;
        }
        // Reset tempNum for digit sum calculation
        tempNum = num;
        // Calculate the sum of digits
        while (tempNum != 0) {
            int digitValue = tempNum % 10; // Extract the last digit
            result += digitValue; // Add the last digit to the result
            tempNum /= 10; // Remove the last digit
        }

        // Output the digit count and the sum of digits
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Sum of digits: " + result);
    }
}
