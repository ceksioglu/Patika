package week2;

import java.util.Scanner;

public class RecursivePrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int userInput = scanner.nextInt();

        System.out.println("Recursion kullanarak 5 azalt ve arttır:");
        reduceAndAddByFive(userInput, userInput); // Recursive fonksiyonu çağır:
    }

    public static void reduceAndAddByFive(int num, int originalInput) {
        // Sayı 0 olunca 5 eklemeye başla.
        if (num == 0) {
            System.out.print(num + " "); //Mevcut sayıyı yazdır
            addByFive(num + 5, originalInput); // 5 ekleme başlamak için fonksiyonu çağır
        }
        // Sayı eksi olunca 5 eklemeye başla:
        else if (num < 0) {
            addByFive(num, originalInput);
        }
        // Sayı originalinden büyük olursa döngüyü bitirir.
        else if (num > originalInput) {
            return;
        }
        // Sayıyı 5 azalt ve recursion'a devam et:
        else {
            System.out.print(num + " "); // Güncel sayıyı göster
            reduceAndAddByFive(num - 5, originalInput); // 5 ile azaltma recursive fonksiyonu
        }
    }

    // Sayıyı 5 arttırma fonksiyonu
    public static void addByFive(int num, int originalInput) {
        // Sayı orjinaline gelince döngüyü bitir
        if (num == originalInput) {
            System.out.print(num + " "); // Güncel sayıyı bastır
        }
        // Sayı ve orjinal değer eşit değilse 5 ekleme fonksiyonu:
        else {
            System.out.print(num + " ");
            addByFive(num + 5, originalInput); // 5 arttırmak için recursive call
        }
    }
}
//Can Ekşioğlu
