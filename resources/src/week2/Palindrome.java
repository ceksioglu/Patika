package week2;
public class Palindrome {

    public static boolean isPalindrome(int num) {
        // Base case: single-digit number is always a palindrome
        if (num >= 0 && num < 10) {
            return true;
        }
        // Recursive case: check if the first and last digits are equal
        int length = String.valueOf(num).length();
        int firstDigit = num / (int) Math.pow(10, length - 1);
        int lastDigit = num % 10;

        if (firstDigit != lastDigit) {
            return false;
        }
        // If first and last digits are equal, strip them off and check the remaining digits
        int remainingNum = (num % (int) Math.pow(10, length - 1)) / 10;
        return isPalindrome(remainingNum);
    }

    public static void main(String[] args) {
        int number = 12321; // Change this number to test different inputs
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}