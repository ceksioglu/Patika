import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        //Kullanıcı girişi:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçaıpını giriniz: ");
        //Kullanıcıdan yarıçap iste:
        double radius = scanner.nextDouble();
        System.out.print("Merkez açıyı giriniz: ");
        double angle = scanner.nextDouble();
        // Memory leak için objeyi kapat.
        scanner.close();
        // Dairenin alanı
        double area = (Math.PI * (radius * radius) * angle) / 360;
        // Display the result
        System.out.println("Yarıçapı " + radius + " merkez açısı: " + angle + " olan daire diliminin alanı: " + area +" cm^2");
    }
}
