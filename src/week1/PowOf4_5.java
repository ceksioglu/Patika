package week1;

import java.util.Scanner;

public class PowOf4_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz:");
        int num = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for(int i=1; i<=num; i*=4) {
            System.out.println(i);
        }
        System.out.println("5'in kuvvetleri:");
        for(int j=1; j<=num; j*=5) {
            System.out.println(j);
        }
    }
}
