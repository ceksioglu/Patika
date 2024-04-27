package week1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //Kullanıcı girişi:

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vücüt kütlesi(kg): ");
         double kg = scanner.nextDouble();

        System.out.println("Boy(cm): ");
         double boy = scanner.nextDouble();
         boy = boy / 100; //cm -> m

         //week1.BMI Hesaplama:
        double BMI = kg / Math.pow(boy,2);
        System.out.println("Vücüt kütle indeksiniz: " +BMI);

        scanner.close(); //Memory leak
    }
}
//Can Ekşioğlu