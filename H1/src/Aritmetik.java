import java.util.Scanner;

public class Aritmetik {
    public static void main(String[] args) {

        //Kullanıcıdan sayıları alma:
        Scanner scanner = new Scanner(System.in);
        System.out.println("A sayısını girin");
        int a = scanner.nextInt();
        System.out.println("B sayısını girin");
        int b = scanner.nextInt();
        System.out.println("C sayısını girin");
        int c = scanner.nextInt();

        //İşlemi yap ve çıktı ver:
        int islem = (a+b*c-b);
        System.out.println("Sonuç: " +islem);
    }
}
//Can Ekşioğlu