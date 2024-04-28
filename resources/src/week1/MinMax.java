import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Hesaplanacak sayı adedini kullanıcıdan al:
        System.out.print("Hesaplanacak sayı adedini girin (n): ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Girilen sayı pozitif tam sayı olmalıdır: ");
            return;
        }
        //Kullancıdan ilk sayıyı al:
        System.out.print("İlk sayıyı girin: ");
        double num = scanner.nextDouble();
        double min = num;
        double max = num;
        //İlk sayı girildiği için döngüyü 2'den başlat ve (n)'e kadar sayı girişi iste:
        for (int i = 2; i <= count; i++) {
            System.out.print("Sayı " + i + ": ");
            num = scanner.nextDouble();
            //Eğer sayı minimumdan küçükse yeni değeri o sayıya eşitle:
            if (num < min) {
                min = num;
            }
            //Eğer sayı maksimumdan büyükse yeni değeri o sayıya eşitle:
            if (num > max) {
                max = num;
            }
        }
        System.out.println("En kücük rakam: " + min);
        System.out.println("En büyük rakam: " + max);

        scanner.close();
    }
}
//Can Ekşioğlu