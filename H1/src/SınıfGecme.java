import java.util.Scanner;

public class SınıfGecme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turkce, mat, fizik, kimya, muzik;
        double toplam = 0;

        System.out.println("Türkçe notunuzu girin (0-100):");
        turkce = gecerliNotAl(scanner);
        toplam += turkce;

        System.out.println("Matematik notunuzu girin (0-100):");
        mat = gecerliNotAl(scanner);
        toplam += mat;

        System.out.println("Fizik notunuzu girin (0-100):");
        fizik = gecerliNotAl(scanner);
        toplam += fizik;

        System.out.println("Kimya notunuzu girin (0-100):");
        kimya = gecerliNotAl(scanner);
        toplam += kimya;

        System.out.println("Müzik notunuzu girin (0-100):");
        muzik = gecerliNotAl(scanner);
        toplam += muzik;

        double ortalama = toplam / 5;
        System.out.println("Ortalama not: " + ortalama);

        if (ortalama >= 55) {
            System.out.println("Tebrikler! Geçtiniz.");
        } else {
            System.out.println("Maalesef, geçemediniz.");
        }
    }

    private static int gecerliNotAl(Scanner scanner) {
        int not;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen 0 ile 100 arasında geçerli bir tamsayı girin.");
                scanner.next();
            }
            not = scanner.nextInt();
            if (not < 0 || not > 100) {
                System.out.println("Not 0 ile 100 arasında olmalıdır. Lütfen geçerli bir not girin:");
            }
        } while (not < 0 || not > 100);
        return not;
    }
}
