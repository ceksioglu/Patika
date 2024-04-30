package week2;

import java.util.Scanner;

public class RecursivePowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Kullanıcı inputları:
        System.out.print("Taban sayıyı giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üssü giriniz: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);

        scanner.close();
    }
    //Sonuç sayıyı hesaplama:
    public static int power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
//Can Ekşioğlu