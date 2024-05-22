package week5;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatch2 {

    static int[] arr = {2,4,6,8,10,12,14,16,18,20};

    static void getIndexData(int n) {
        System.out.println("Seçilen indeksteki değer :"+ arr[n]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi : " +Arrays.toString(arr));
        System.out.println("Lütfen dizi indeksini girin: ");

        try {
            int choice = scanner.nextInt();
            getIndexData(choice);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println("Program bitti.");
        }
    }
}
