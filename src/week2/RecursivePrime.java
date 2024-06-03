package week2;

import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan sayıyı al:
        System.out.print("Lütfen bir sayı girin: ");
        int number = scanner.nextInt();

        //Asal sayı metodunu çağırıp, gelen değere göre mesaj yazdır:
        if (isPrime(number, number / 2)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }

        scanner.close();
    }

    // Sayının asal olduğunu belirlemek için recursive method:
    public static boolean isPrime(int num, int divisor) {
        if (divisor == 1) {
            return true;
        } else {
            if (num % divisor == 0) {
                return false;
            } else {
                return isPrime(num, divisor - 1);
            }
        }
    }
}
//Can Ekşioğlu