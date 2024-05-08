package week2;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan girdi alma işlemleri başlatılıyor.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matrisin satır sayısını girmesi isteniyor.
        System.out.print("Satır sayısını girin: ");
        int rows = scanner.nextInt();

        // Kullanıcıdan matrisin sütun sayısını girmesi isteniyor.
        System.out.print("Sütun sayısını girin: ");
        int cols = scanner.nextInt();

        // Girilen satır ve sütun sayısına göre matris (dizi) oluşturuluyor.
        int[][] array = new int[rows][cols];

        // Dizi elemanlarının kullanıcı tarafından girilmesi sağlanıyor.
        System.out.println("Dizideki elemanları girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Pozisyondaki sayıları girin: [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Kullanıcının girdiği orijinal matris ekrana yazdırılıyor.
        System.out.println("Orjinal Matris:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        // transposeMatrix fonksiyonu çağrılarak matrisin transpozu hesaplanıyor.
        int[][] transpose = transposeMatrix(array);

        // Transpoze edilmiş matris ekrana yazdırılıyor.
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < transpose.length; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }

        // Scanner nesnesi artık kullanılmayacağı için kapatılıyor.
        scanner.close();
    }

    // Matrisin transpozunu hesaplayan metod.
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length; // Girdi matrisinin satır sayısı
        int cols = matrix[0].length; // Girdi matrisinin sütun sayısı
        int[][] transpose = new int[cols][rows]; // Transpoze matris için yeni bir dizi oluşturuluyor

        // İki döngü ile matrisin transpozu hesaplanıyor: her sütun satıra, her satır sütuna dönüştürülüyor.
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose; // Hesaplanan transpoze matris döndürülüyor.
    }
}
//Can Ekşioğlu