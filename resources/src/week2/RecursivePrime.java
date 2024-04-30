package week2;

import java.util.Scanner;

public class RecursivePrime {
    //Asal sayı kontrol eden method:
    public static boolean isPrime(int n){
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullancıdan alınan sayıyı isPrime methoduna yolla ve geriye gelen boolean değerini yeni lokal değişkene ata:
        System.out.println("Bu program recursive method kullanarak asal sayı incelemesi yapar. \n Lütfen incelenecek sayıyı giriniz.");
        int num = scanner.nextInt();
        boolean isPrimeValue = isPrime(num);
        //Değer doğru veya yanlış ise sonucu bastır:
        String result = isPrimeValue ? "Sayı asal sayıdır." : "Sayı asal değildir.";
        System.out.println(result);
    }
}
//Can Ekşioğlu