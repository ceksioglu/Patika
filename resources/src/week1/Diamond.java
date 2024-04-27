import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input (n):");
        int n = scanner.nextInt();

        // Elmasın üst tarafını yazdır:
        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdır:
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır:
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Elmasın alt tarafını yazdır:
        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları yazdır:
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır:
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Can Ekşioğlu