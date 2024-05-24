package week5.PatikaStore;

import week5.PatikaStore.models.Product;
import week5.PatikaStore.services.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        while (true) {
            System.out.println("1. Ürün Ekle");
            System.out.println("2. Ürünleri Listele");
            System.out.println("3. Ürün Sil");
            System.out.println("4. Marka ile Ürün Filtrele");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // buffer temizleme
        }
    }
}
