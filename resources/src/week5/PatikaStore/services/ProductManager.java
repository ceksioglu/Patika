package week5.PatikaStore.services;

import week5.PatikaStore.models.Brand;
import week5.PatikaStore.models.Product;
import week5.PatikaStore.models.Cellphone;
import week5.PatikaStore.models.Notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    private List<Brand> brands = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private static int productId = 1;

    public ProductManager() {
        // Markaları ekleyelim
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
        Collections.sort(brands);
    }

    public void addPhone(double price, double discountRate, int stock, String name, int brandId, String memory, double screenSize, int batteryPower, int ram, String color) {
        Brand brand = findBrandById(brandId);
        if (brand != null) {
            Cellphone phone = new Cellphone(productId++, price, discountRate, stock, name, brand, memory, screenSize, batteryPower, ram, color);
            products.add(phone);
        }
    }

    public void addNotebook(double price, double discountRate, int stock, String name, int brandId, int ram, String storage, double screenSize) {
        Brand brand = findBrandById(brandId);
        if (brand != null) {
            Notebook notebook = new Notebook(productId++, price, discountRate, stock, name, brand, ram, storage, screenSize);
            products.add(notebook);
        }
    }

    //Bu kod niye çalışıyor sadece Allah biliyor.
    public void listProducts() {
        System.out.format("%-10s %-20s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Name", "Price", "Discount", "Stock", "Brand", "Type");
        for (Product product : products) {
            System.out.format("%-10d %-20s %-10.2f %-10.2f %-10d %-10s %-10s\n", product.getId(), product.getName(), product.getPrice(), product.getDiscountRate(), product.getStock(), product.getBrand().getName(), product.getType());
        }
    }

    public void deleteProductById(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void filterProductsByBrand(int brandId) {
        Brand brand = findBrandById(brandId);
        if (brand != null) {
            System.out.format("%-10s %-20s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Name", "Price", "Discount", "Stock", "Brand", "Type");
            for (Product product : products) {
                if (product.getBrand().getId() == brandId) {
                    System.out.format("%-10d %-20s %-10.2f %-10.2f %-10d %-10s %-10s\n", product.getId(), product.getName(), product.getPrice(), product.getDiscountRate(), product.getStock(), product.getBrand().getName(), product.getType());
                }
            }
        }
    }

    private Brand findBrandById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }
}
