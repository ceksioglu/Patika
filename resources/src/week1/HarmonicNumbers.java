package week1;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = scanner.nextInt();
        double result = 0;
        for(double i = 1; i <= num; i++){
            result += (1/i);
        }
        System.out.println("Result is: " +result);
    }
}
//Can Ekşioğlu