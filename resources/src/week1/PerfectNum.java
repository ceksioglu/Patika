package week1;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {

        System.out.println("Bu program bir sayının mükemmel sayı olup olmadığını denetler.");
        Scanner scanner = new Scanner(System.in);
        //Kullanıcı girişlerini al:
        System.out.println("Sayı giriniz: ");
        double num = scanner.nextDouble();
        double sum = 0;
        
        //Sayıyı tam bölen sayıları topla:
        for(int i = 1; i < num; i++){
            if(num % i == 0) {
                sum += i;
            }
        }
        //Bölenlerin toplamı sayıya eşit mi kontrol et:
        if (sum == num){
            System.out.println(num +" bir mükemmel sayıdır!");
        } else {
            System.out.println(num +" bir mükemmel sayı değildir!");
        }
    }
}
//Can Ekşioğlu