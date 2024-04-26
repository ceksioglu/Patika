import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int mat, turkce, kimya, fizik, muzik, tarih;

        Scanner calc = new Scanner(System.in);

        System.out.println("Matematik notu:");
        mat = calc.nextInt();

        System.out.println("Türkçe notu:");
        turkce = calc.nextInt();

        System.out.println("Kimya notu:");
        kimya = calc.nextInt();

        System.out.println("Fizik notu:");
        fizik = calc.nextInt();

        System.out.println("Müzik notu:");
        muzik = calc.nextInt();

        System.out.println("Tarih notu:");
        tarih = calc.nextInt();

        int total = (mat+turkce+kimya+fizik+muzik+tarih);
        double average = (total / 6.0);

        String result = (average > 60) ? "Geçti":"Kaldı";
        System.out.println(result);
    }
}

//Can Ekşioğlu