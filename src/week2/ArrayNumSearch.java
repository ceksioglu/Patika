package week2;

public class ArrayNumSearch {
    public static void main(String[] args) {
        // Dizi tanımı, farklı türde ve değerde elemanlar içerir.
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        // Hedef sayımız, kullanıcının girdiği veya belirlenen sayı
        int target = 5;

        // En yakın küçük sayıyı bulmak için başlangıç değeri olarak Integer'ın minimum değerini kullanıyoruz.
        int closestSmaller = Integer.MIN_VALUE;
        // En yakın büyük sayıyı bulmak için başlangıç değeri olarak Integer'ın maksimum değerini kullanıyoruz.
        int closestLarger = Integer.MAX_VALUE;

        // Dizideki tüm elemanları tek tek incelemek için bir döngü kullanılıyor.
        for (int num : array) {
            // Şu anki sayının hedef sayıdan küçük olup olmadığını kontrol ediyoruz.
            if (num < target) {
                // Eğer hedef sayı ile bu sayı arasındaki fark, şu ana kadar bulduğumuz en küçük farktan daha az ise
                if (target - num < target - closestSmaller) {
                    // Bu sayıyı en yakın küçük sayı olarak güncelliyoruz.
                    closestSmaller = num;
                }
                // Şu anki sayının hedef sayıdan büyük olup olmadığını kontrol ediyoruz.
            } else if (num > target) {
                // Eğer bu sayı ile hedef sayı arasındaki fark, şu ana kadar bulduğumuz en küçük farktan daha az ise
                if (num - target < closestLarger - target) {
                    // Bu sayıyı en yakın büyük sayı olarak güncelliyoruz.
                    closestLarger = num;
                }
            }
        }

        // Sonuçları kullanıcıya sunmak için ekrana yazdırıyoruz.
        // Eğer Integer.MIN_VALUE ise dizide hedef sayıdan küçük bir sayı bulunamamıştır.
        if (closestSmaller == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük en yakın sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        }

        // Eğer Integer.MAX_VALUE ise dizide hedef sayıdan büyük bir sayı bulunamamıştır.
        if (closestLarger == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük en yakın sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
        }
    }
}
//Can Ekşioğlu
