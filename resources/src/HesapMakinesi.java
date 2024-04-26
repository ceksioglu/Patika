import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Kullanıcdan input al:
        System.out.println("--Hesap Makinesi--");
        System.out.println("İlk sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        //İşlem seçimi:
        System.out.println("İşlem Seçimi:");
        System.out.println("1. Toplama (+)");
        System.out.println("2. Çıkarma (-)");
        System.out.println("3. Çarpma (*)");
        System.out.println("4. Bölme (/)");
        System.out.println("Lütfen işlem seçin: ");

        int islem = scanner.nextInt();

        double sonuc = 0;

        switch(islem) {
            case 1:
                sonuc = num1 + num2;
                break;
            case 2:
                sonuc = num1 - num2;
                break;
            case 3:
                sonuc = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    sonuc = num1 / num2;
                } else {
                    System.out.println("0'a bölme olmaz!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Yanlış seçim.");
                scanner.close();
                return;
        }

        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }
}
