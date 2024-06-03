package week1;

import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        //Değişken yaratımı:
        Scanner scanner = new Scanner(System.in);
        double ortaFiyat = 0, yasIndirimi, sonFiyat;

        //Kullanıcı girişleri
        System.out.println("Mesafeyi km cinsinden giriniz:");
        double mesafe = scanner.nextDouble();
        //Negatif sayı kontrolü:
        if (mesafe <= 0) {
            System.out.println("Mesafe negatif veya 0 olamaz! Tekrar deneyin.");
            System.exit(0);
        }

        System.out.println("Yaşınızı giriniz:");
        double yas = scanner.nextDouble();
        //Negatif sayı kontrolü:
        if (yas < 0) {
            System.out.println("Yaş negatif olamaz! Tekrar deneyin.");
            System.exit(0);
        }

        System.out.println("Yolculuk tipini seçiniz: ( 1 => Tek Yön, 2 => Çift Yön )");
        int tip = scanner.nextInt();

        //Ücret hesaplaması:
        double ilkFiyat = mesafe * 0.10;
        //Yaş indirimi hesaplaması:
        if(yas > 0 && yas < 12) {
            yasIndirimi = ilkFiyat * 0.50;
            ortaFiyat = ilkFiyat - yasIndirimi;

        } else if (yas > 12 && yas < 24) {
            yasIndirimi = ilkFiyat * 0.10;
            ortaFiyat = ilkFiyat - yasIndirimi;

        } else if (yas > 24 && yas < 65) {
            yasIndirimi = 0;
            ortaFiyat = ilkFiyat - yasIndirimi;

        } else if (yas > 65) {
            yasIndirimi = ilkFiyat * 0.30;
            ortaFiyat = ilkFiyat - yasIndirimi;

        } else {
            System.out.println("Hatalı Veri! Tekrar deneyin.");
            System. exit(0);
        }
        //Yolculuk tipine göre fiyat belirleme:
        switch (tip){
            case 1:
                sonFiyat = ortaFiyat * 1;
                System.out.println("Ücret:" + sonFiyat + "TL.");
                break;
            case 2:
                sonFiyat = ortaFiyat * 2 * 0.80;
                System.out.println("Ücret:" + sonFiyat + "TL.");
                break;
            default:
                System.out.println("Yanlış tip seçimi!");
                break;
        }
    }
}
//Can Ekşioğlu