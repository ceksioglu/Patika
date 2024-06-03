package week2;

import java.util.Scanner;

public class HarmonicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        double[] numbers = new double[size];

        // Ask the user to input numbers
        System.out.println("Lütfen " + size + " sayı giriniz:");
        for (int i = 0; i < size; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the harmonic average
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += 1 / numbers[i];
        }
        double harmonicAverage = size / sum;

        // Print the result
        System.out.print("Girilen dizinin Harmonik ortalaması: " +harmonicAverage);

        // Close the scanner
        scanner.close();
    }
}
//Can Ekşioğlu