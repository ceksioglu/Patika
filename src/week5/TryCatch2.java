package week5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {

    // Statik bir dizi oluşturuluyor
    static int[] arr = {2,4,6,8,10,12,14,16,18,20};

    // Belirtilen indeksdeki değeri ekrana yazdıran metot
    static void getIndexData(int n) {
        System.out.println("Seçilen indeksteki değer: " + arr[n]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner nesnesi oluşturuluyor
        System.out.println("Dizi: " + Arrays.toString(arr)); // Diziyi ekrana yazdır
        System.out.println("Lütfen dizi indeksini girin: "); // Kullanıcıdan indeks girmesini iste

        try {
            int choice = scanner.nextInt(); // Kullanıcıdan indeks değeri al
            getIndexData(choice); // Alınan indeksi kullanarak değeri yazdır
        } catch (ArrayIndexOutOfBoundsException e) {
            // Eğer kullanıcı geçersiz bir indeks girerse bu hata yakalanır
            System.out.println("Geçersiz indeks. Lütfen 0 ile " + (arr.length - 1) + " arasında bir değer girin.");
        } catch (InputMismatchException e) {
            // Kullanıcı geçersiz bir veri tipi girerse bu hata yakalanır
            System.out.println("Geçersiz giriş. Lütfen bir tamsayı girin.");
        } finally {
            scanner.close(); // Scanner nesnesini kapat
            System.out.println("Program bitti."); // Programın bittiğini belirten mesajı ekrana yazdır
        }
    }
}
