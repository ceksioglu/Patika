package week1;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        int total = 1;
        System.out.println("This program calculates a power of a number.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int n = scanner.nextInt();
        System.out.println("Enter the power:");
        int k = scanner.nextInt();

        for (int i=1; i<=k; i++){
            total *= n;
        }
        System.out.println("Result is:" +total);
    }
}
