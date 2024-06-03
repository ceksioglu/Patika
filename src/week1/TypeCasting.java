package week1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Integer (tam sayı) bir sayı girin: ");
        int num1_int = scanner.nextInt();

        System.out.println("Double (ondalıklı) bir sayı girin:");
        double num2_double = scanner.nextDouble();

        //Double olan sayıyı integer olarak cast et:
        double num1_double = (double) num1_int;
        //Integer olan sayıyı double olarak cast et:
        int num2_int = (int) num2_double;

        System.out.println("İlk sayı (int -> double) : "+num1_double);
        System.out.println("İkinci sayı (double -> int) : "+num2_int);
    }
}
//Can Ekşioğlu