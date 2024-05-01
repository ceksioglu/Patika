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
        // If the number is within range, reduce by 5 and continue recursion
        else {
            System.out.print(num + " "); // Output the current number
            reduceAndAddByFive(num - 5, originalInput); // Recursive call to reduce by 5
        }
    }

    // Function to add by 5 recursively
    public static void addByFive(int num, int originalInput) {
        // If the number reaches the original input, stop recursion
        if (num == originalInput) {
            System.out.print(num + " "); // Output the current number
        }
        // If not, output the current number and continue adding by 5 recursively
        else {
            System.out.print(num + " "); // Output the current number
            addByFive(num + 5, originalInput); // Recursive call to add by 5
        }
    }
}
//Can Ekşioğlu
