package week1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        //Kullanıcdan sayıyı al:
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 ile n arasındaki asal sayıları listelemek için lütfen (n) girin:");

        int range = scanner.nextInt();
        System.out.println("1 ile " + range + " arasındaki asal sayılar:");

        for (int i = 2; i <= range; i++) {
            boolean prime = true;
            //"Eğer i 2'den i/2 kadar olan herhangi bir sayıya bölünebiliyorsa, o zaman o bir asal sayı değildir.")
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                System.out.print(+i +" ");
            }
        }
    }
}
