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
        manager.addCellphone(799.99, 10, 50, "Samsung Galaxy S21", 1, "128GB", 6.2, 4000, 8, "Phantom Gray");
        manager.addCellphone(999.99, 15, 30, "iPhone 12", 3, "64GB", 6.1, 3800, 4, "Blue");
        manager.addCellphone(699.99, 20, 100, "Xiaomi Mi 11", 8, "256GB", 6.5, 4500, 12, "Black");
        manager.addCellphone(899.99, 5, 40, "OnePlus 9", 2, "128GB", 6.55, 4300, 8, "Astral Black");
        manager.addCellphone(749.99, 12, 60, "Huawei P40", 4, "128GB", 6.1, 3800, 6, "Silver Frost");

        // Mock Notebooks
        manager.addNotebook(1299.99, 10, 20, "MacBook Pro", 3, 16, "512GB SSD", 13.3);
        manager.addNotebook(999.99, 5, 15, "Dell XPS 13", 6, 8, "256GB SSD", 13.4);
        manager.addNotebook(1099.99, 8, 10, "HP Spectre x360", 7, 16, "512GB SSD", 13.3);
        manager.addNotebook(899.99, 12, 25, "Asus ZenBook 14", 6, 8, "512GB SSD", 14.0);
        manager.addNotebook(799.99, 15, 30, "Lenovo ThinkPad X1", 2, 16, "256GB SSD", 14.0);
    }
}
