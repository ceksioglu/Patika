package week1;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        int total = 1;
        System.out.println("Bu program üslü sayı hesaplar.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int n = scanner.nextInt();
        System.out.println("Üssü giriniz:");
        int k = scanner.nextInt();

        for (int i=1; i<=k; i++){
            total *= n;
        }
        System.out.println("Üslü sayı:" +total);
    }
}
