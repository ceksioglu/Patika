package week5.PatikaStore;

import week5.PatikaStore.services.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ürün yönetim sistemi oluşturulur
        ProductManager manager = new ProductManager();

        // Mock data eklenir
        addMockData(manager);

        Scanner scanner = new Scanner(System.in);

        // Kullanıcı etkileşim döngüsü
        while (true) {
            // Menü seçeneklerini görüntüler
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Delete Product");
            System.out.println("4. Filter Products by Brand");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Buffer temizleme

            switch (choice) {
                case 1:
                    // Ürün ekleme seçenekleri
                    System.out.println("1. Add Cellphone");
                    System.out.println("2. Add Notebook");
                    System.out.print("Your choice: ");
                    int productType = scanner.nextInt();
                    scanner.nextLine();

                    // Ortak ürün bilgilerini alır
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Discount Rate: ");
                    double discount = scanner.nextDouble();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Product Name: ");
                    String name = scanner.nextLine();

                    // Markaları listeler
                    manager.listBrands();
                    System.out.print("Brand ID: ");
                    int brandId = scanner.nextInt();
                    scanner.nextLine();

                    if (productType == 1) {
                        // Cep telefonu bilgilerini alır
                        System.out.print("Memory: ");
                        String memory = scanner.nextLine();
                        System.out.print("Screen Size: ");
                        double screenSize = scanner.nextDouble();
                        System.out.print("Battery Power: ");
                        int batteryPower = scanner.nextInt();
                        System.out.print("RAM: ");
                        int ram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Color: ");
                        String color = scanner.nextLine();

                        // Yeni cep telefonu ekler
                        manager.addCellphone(price, discount, stock, name, brandId, memory, screenSize, batteryPower, ram, color);
                    } else if (productType == 2) {
                        // Notebook bilgilerini alır
                        System.out.print("RAM: ");
                        int ram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Storage: ");
                        String storage = scanner.nextLine();
                        System.out.print("Screen Size: ");
                        double screenSize = scanner.nextDouble();
                        scanner.nextLine();

                        // Yeni notebook ekler
                        manager.addNotebook(price, discount, stock, name, brandId, ram, storage, screenSize);
                    }
                    break;
                case 2:
                    // Tüm ürünleri listeler
                    manager.listProducts();
                    break;
                case 3:
                    // Ürün silme
                    System.out.print("Product ID to delete: ");
                    int id = scanner.nextInt();
                    manager.deleteProductById(id);
                    break;
                case 4:
                    // Markaya göre ürün filtreleme
                    manager.listBrands();
                    System.out.print("Brand ID: ");
                    int filterBrandId = scanner.nextInt();
                    manager.filterProductsByBrand(filterBrandId);
                    break;
                case 0:
                    // Çıkış
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addMockData(ProductManager manager) {
        // Mock Cellphones
        manager.addCellphone(999.99, 10, 50, "Samsung Galaxy S23 Ultra", 1, "256GB", 6.8, 5000, 12, "Phantom Black");
        manager.addCellphone(1099.99, 15, 30, "iPhone 14 Pro", 3, "128GB", 6.1, 3200, 6, "Space Black");
        manager.addCellphone(799.99, 20, 100, "Xiaomi 13 Pro", 8, "256GB", 6.73, 4820, 12, "Ceramic White");
        manager.addCellphone(949.99, 5, 40, "OnePlus 11", 2, "256GB", 6.7, 5000, 8, "Titan Black");
        manager.addCellphone(899.99, 12, 60, "Google Pixel 7 Pro", 4, "128GB", 6.7, 4355, 12, "Obsidian");

        // Mock Notebooks
        manager.addNotebook(1999.99, 10, 20, "MacBook Pro 16 M1", 3, 32, "1TB SSD", 16.0);
        manager.addNotebook(1499.99, 5, 15, "Dell XPS 15", 6, 16, "512GB SSD", 15.6);
        manager.addNotebook(1599.99, 8, 10, "HP Spectre x360 15", 7, 16, "1TB SSD", 15.6);
        manager.addNotebook(1299.99, 12, 25, "Asus ZenBook Duo 14", 6, 16, "512GB SSD", 14.0);
        manager.addNotebook(1399.99, 15, 30, "Lenovo ThinkPad X1 Carbon Gen 9", 2, 16, "1TB SSD", 14.0);
    }
}
