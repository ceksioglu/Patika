import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year, remainder;

        System.out.println("Bu program artık yılları hesaplar.\nLütfen yılı giriniz:");
        year = scanner.nextInt();

        if (year > 100) {
            remainder = year % 400;
            if (remainder == 0) {
                System.out.println(year + " bir artık yıldır!");
            } else {
                System.out.println(year + " bir artık yıl değildir!");
            }
        } else {
            int remainder2 = year % 4;
            if (remainder2 == 0) {
                System.out.println(year + " bir artık yıldır!");
            } else {
                System.out.println(year + " bir artık yıl değildir!");
            }
        }
    }
}
