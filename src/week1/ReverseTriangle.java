package week1;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan uzunluğu al:
        System.out.print("Desenin uzunlugunu belirleyin: ");
        int length = scanner.nextInt();

        // Ters üçgeni yazdırmaya başla:
        for (int i = length; i >= 1; i--) {
            // Yıldızları bastır:
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
//Can Ekşioğlu