package week2;

import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int num = scanner.nextInt();
        //Değişkenler:
        double sum = 0;
        int count = 0;
        //1'den girilen sayıya kadar olan rakamların 3 ve 4 ile bölünebildiğini kontrol et:
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        // 3 ve 4 ile bölünen sayıların ortalamasını çıkar:
        if (count > 0) {
            double average = sum / count;
            System.out.println("3 ve 4 ile bölünenebilen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4 ile bölünenebilen sayı bulunamadı!");
        }
        scanner.close();
    }
}
//Can Ekşioğlu