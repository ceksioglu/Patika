package week1;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        //Kullanıcdan veri alma:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Alınan elma miktarı (kg): ");
        double elma = scanner.nextDouble();

        System.out.print("Alınan armut miktarı (kg): ");
        double armut = scanner.nextDouble();

        System.out.print("Alınan domates miktarı (kg): ");
        double domates = scanner.nextDouble();

        System.out.print("Alınan muz miktarı (kg): ");
        double muz = scanner.nextDouble();

        System.out.print("Alınan patlıcan miktarı (kg): ");
        double patlican = scanner.nextDouble();

        //Total hesaplama:

        double ef = 3.67, af = 2.14, df=1.11, mf = 0.95, pf = 5.0;
        double total = (elma * ef) + (armut * af) + (domates * df) + (muz * mf) + (patlican * pf);

        //Sonuçları print etme:

        System.out.println("Elma kaç kg?: " +elma);
        System.out.println("Armut kaç kg?: " +armut);
        System.out.println("Domates kaç kg?: " +domates);
        System.out.println("Muz kaç kg?: " +muz);
        System.out.println("Patlıcan kaç kg?: " +patlican);
        System.out.println("Toplam Tutar: " +total);

        scanner.close(); //Memory leak
    }
}
//Can Ekşioğlu