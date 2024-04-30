package week2;
import java.util.Scanner;
public class RecursivePowers {

//Üslü sayıyı hesaplama methodu:
public static int power(int b, int p){
    int total = 1;
    for (int i = 1; i<=p; i++) {
        total *= b;
    }
    return total;
}
    //Main method:
    public static void main(String[] args) {
        //Kullanıcıdan inputları al:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz:");
        int b = scanner.nextInt();
        System.out.println("Üs sayısını giriniz:");
        int p = scanner.nextInt();
        //Üslü sayı için alınan değerleri method parametresi olarak gir:
        System.out.println("Sonuç: "+power(b, p));
    }
}
//Can Ekşioğlu