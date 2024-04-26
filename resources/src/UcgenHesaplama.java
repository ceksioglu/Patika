import java.util.Scanner;

public class UcgenHesaplama {
    public static void main(String[] args) {
        //Değişken atama ve kullanıcı girişi:
      double a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk girin kenarı girin: ");
        a = input.nextDouble();

        System.out.print("İkinci kenarı girin: ");
        b = input.nextDouble();

        System.out.print("Son kenarı girin: ");
        c = input.nextDouble();

        //Heron Formülü:
        double u = (a+b+c) / 2;
        double alan = u * (u-a) * (u-b) * (u-c);
        alan = Math.sqrt(alan);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
