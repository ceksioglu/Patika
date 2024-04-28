// Uçak bileti fiyatı hesaplama grup ödevi
// Ali Kuruçay, Cihan Özdemir, Emre Çimen, Mert Acu, Mirac Eyüpoğlu


/* Uçak bileti fiyatı hesaplama. Kullanıcıdan mesafe, yaş ve yolculuk tipi girdileri
alınarak ücret hesabı yapılacak. */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//Değişkenleri tanımlayalım
        int mesafe, yas, yolculukTipi;
        double birimFiyat = 0.10, toplamFiyat;

//Kullanıcıdan giriş değerlerini alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz (km)..: ");
        mesafe = input.nextInt();
        System.out.print("Yaşı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = input.nextInt();

        // Veri doğruluğunu kontrol edelim.
        if ((yolculukTipi != 1 && yolculukTipi != 2) || yas <= 0 || mesafe <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");

        } else {
            toplamFiyat = mesafe * birimFiyat;

            // İndirimleri uygulayalım
            // 12 yaşından küçükse %50 indirim
            if (yas < 12) {
                toplamFiyat = toplamFiyat * 0.50;

                // 12-24 yaş arası ise %10 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat = toplamFiyat * 0.90;

                // 65 yaşından büyükse %30 indirim
            } else if (yas >= 65) {
                toplamFiyat = toplamFiyat * 0.70;}

            // Gidiş-dönüş ise %20 indirim
            if (yolculukTipi == 2) {
                toplamFiyat = toplamFiyat * 0.80 * 2;}

            // Sonuçları ekrana yazdır
            System.out.printf("Toplam Tutar: " + toplamFiyat + "TL");
        }
    }
}