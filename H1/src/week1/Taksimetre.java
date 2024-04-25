package week1;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //Kilometre girişi:

        Scanner input = new Scanner(System.in);
        System.out.println("KM'yi giriniz: ");
        double km = input.nextDouble();

        //Fiyat hesaplama:
        double tarife = 2.20;
        double fiyat = 10.0 + (km * tarife);

        if (fiyat<20.0) {
            System.out.println("Ücret 20 TL");
        } else {
            System.out.println("Ücret: " +fiyat + "TL" );
        }
    }
}
