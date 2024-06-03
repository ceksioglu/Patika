package week1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Kullancıdan uzunluğu al:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi'nin elaman sayısını giriniz: ");
        int len = scanner.nextInt();

        //Seri hesaplama:
        System.out.println("Girilen uzunlukta fibonacci serisi:");
        int first=0;
        int second=1; //Serideki ilk sayılar hep 0 ve 1 olur.
        for (int i = 0; i < len; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second; //İlk rakam bir sonraki ile değiştirilir.
            second = next;  //İkinci rakam ise baştaki değerlerin toplamıyla değiştirilir.
        }
    }
}
//Can Ekşioğlu