package week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        // Scanner sınıfı, kullanıcıdan veri almak için kullanılır.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu girmesini isteyin.
        System.out.println("Lütfen dizi büyüklüğünü giriniz: ");
        int size = scanner.nextInt();  // Girilen boyutu 'size' değişkenine kaydedin.

        // Girilen boyuta sahip yeni bir tam sayı dizisi oluşturun.
        int[] array = new int[size];

        // Dizinin her bir elemanı için kullanıcıdan sayı girmesini isteyin.
        for (int i = 0; i < size; i++) {
            System.out.println("Lütfen " + (i + 1) + ". sayıyı girin:");  // Kullanıcının 1'den başlayarak sayıları girmesi sağlanır.
            array[i] = scanner.nextInt();  // Kullanıcıdan alınan sayıyı diziye atayın.
        }

        // Arrays sınıfının sort metodu ile diziyi küçükten büyüğe sıralayın.
        Arrays.sort(array);

        // Diziyi string formatında yazdırmak için Arrays.toString kullanılır.
        String result = Arrays.toString(array);
        System.out.println("Sıralama: ");
        System.out.println(result);  // Sıralanmış diziyi ekrana yazdırın.
    }
}
//Can Ekşioğlu
