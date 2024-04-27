package week1;

import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.println("Bu program girilen sayıya kadar olan çift ve 4 ile bölünebilen rakamları toplar. Tek sayı girildiğinde durur.");
            System.out.print("Sayıyı giriniz:");
            num = scanner.nextInt();
            if (num % 2 != 0) {
                System.out.println("Lütfen çift sayı giriniz.");
            }
        } while (num % 2 != 0);

        int sum = 0;
        for (int i = 4; i <= num; i += 4) {
            if (i % 4 == 0 && i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sayı:" +num +" Çift ve 4 ile bölünebilen rakamların toplamı: " +sum);
        scanner.close();
    }
}
