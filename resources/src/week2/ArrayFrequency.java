package week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args) {
        // Programın amacını kullanıcıya açıklar.
        System.out.println("Bu program girilen dizideki sayıların kaç defa tekrar ettiğini hesaplar.");

        // Kullanıcıdan veri almak için Scanner nesnesi oluşturulur.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu girmesini isteriz.
        System.out.println("Lütfen dizinin boyutunu seçin: ");
        int size = scanner.nextInt();

        // Kullanıcının girdiği boyutta bir tam sayı dizisi oluşturulur.
        int[] array = new int[size];

        // Kullanıcıdan dizi elemanlarını girmesini isteriz. Her eleman için döngü içinde giriş yapılır.
        for(int i = 0; i < array.length; i++){
            System.out.println("Lütfen " + (i + 1) + ". sayıyı girin: ");
            array[i] = scanner.nextInt();
        }

        // Dizi sıralanır. Arrays.sort metodu dizi elemanlarını küçükten büyüğe doğru sıralar.
        Arrays.sort(array);

        // Frekans hesaplama için gerekli değişkenler başlatılır.
        int currentCount = 1;  // Şu anki sayının tekrar sayısını tutar.
        int currentNumber = array[0];  // Şu anki sayıyı tutar.

        // Dizinin ikinci elemanından başlayarak sonuna kadar döngü ile elemanlar kontrol edilir.
        for (int i = 1; i < array.length; i++){
            if(array[i] == currentNumber){
                // Eğer şu anki eleman, mevcut elemanla aynıysa sayacı arttır.
                currentCount++;
            } else {
                // Eğer farklı bir sayıya geçildiyse ve mevcut sayı birden fazla tekrar etmişse, yazdır.
                if(currentCount>1){
                    System.out.println(currentNumber + " şu kadar tekrar ediyor: " + currentCount);
                }
                // Yeni sayıya geçildiği için mevcut sayıyı ve tekrar sayısını güncelle.
                currentNumber = array[i];
                currentCount = 1;
            }
        }

        // Son sayı grubunu kontrol et. Döngü bittikten sonra son sayının tekrar sayısını kontrol et ve gerekirse yazdır.
        if (currentCount > 1) {
            System.out.println(currentNumber + " şu kadar tekrar ediyor: " + currentCount);
        }

        // Sıralanmış diziyi ekrana yazdır. Bu, kullanıcıya işlenmiş verileri gösterir.
        String result = Arrays.toString(array);
        System.out.println("Array:\n" + result);

        // Scanner nesnesini kapat. Böylece kaynaklar serbest bırakılır.
        scanner.close();
    }
}
//Can Ekşioğlu