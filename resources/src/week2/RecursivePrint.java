package week2;

import java.util.Scanner;

public class RecursivePrint {

    public static void subRecursion(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            subRecursion(n - 5);
        } else {
            // 0'dan küçük
        }
    }
    public static void addRecursion(int original, int current) {
        if (current <= original) {
            System.out.print(current + " ");
            addRecursion(original, current + 5);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("İlk değer: " + num + " ");
        subRecursion(num);
        addRecursion(num, 0);

        System.out.println();
    }
}

