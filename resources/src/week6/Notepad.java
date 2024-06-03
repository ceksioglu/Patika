package week6;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kaydedilecek dosya adını girin: ");
        String dosyaAdi = scanner.nextLine();
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        // Geçerli sınıf dosyasının dizinini alın
        String calismaDizini;
        try {
            // Get the directory where the class file is located
            calismaDizini = new File(Notepad.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
            System.out.println("Çalışma dizini: " + calismaDizini);  // Debug: Print the working directory
        } catch (URISyntaxException e) {
            throw new RuntimeException("Geçerli sınıf dizinini belirlerken hata oluştu.", e);
        }

        // Dosya yolunu oluşturun
        String dosyaYolu = calismaDizini + File.separator + dosyaAdi + ".txt";
        System.out.println("Oluşturulan dosya yolu: " + dosyaYolu);  // Debug: Print the constructed file path

        // Dosyaya yazma işlemi
        try (
                FileWriter fileWriter = new FileWriter(dosyaYolu);
                PrintWriter printWriter = new PrintWriter(fileWriter)
        ) {
            printWriter.print(metin);
            System.out.println("Dosyaya yazma işlemi başarılı.");
        } catch (IOException e) {
            throw new RuntimeException("Dosyaya yazma işlemi sırasında hata oluştu.", e);
        }

        // Dosyadan okuma işlemi
        try (
                FileReader fileReader = new FileReader(dosyaYolu);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String okunanMetin = bufferedReader.readLine();
            System.out.println("Okunan metin: " + okunanMetin);
        } catch (IOException e) {
            throw new RuntimeException("Dosyadan okuma işlemi sırasında hata oluştu.", e);
        }
    }
}
