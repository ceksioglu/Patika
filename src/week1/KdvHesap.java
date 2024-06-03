package week1;

import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args){

        double fiyat, kdvOran, kdvTutar, kdvliTutar;
        //Kullanıcıdan fiyatı al (0'dan büyük olduğunu kontrol et);

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Fiyatı girin: ");
            while (!input.hasNextDouble()) {
                System.out.println("0'dan büyük bir sayı girin: ");
                input.next();
            }
            fiyat = input.nextDouble();
        } while (fiyat <= 0);

        //KDV Hesaplama
        if (fiyat < 1000) {
            System.out.println("KDV %18");
            kdvOran = 0.18;
            kdvTutar = kdvOran * fiyat;
            kdvliTutar = fiyat + kdvTutar;
            System.out.println("KDV'li fiyat: " + kdvliTutar);
        } else {
            System.out.println("KDV %8");
            kdvOran = 0.08;
            kdvTutar = kdvOran * fiyat;
            kdvliTutar = fiyat + kdvTutar;
            System.out.println("KDV'li fiyat: " + kdvliTutar);
        }
    }
}
//Can Ekşioğlu