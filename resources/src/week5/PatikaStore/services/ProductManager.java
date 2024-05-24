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

    // Yeni bir cep telefonu ekler
    public void addCellphone(double price, double discountRate, int stock, String name, int brandId, String memory, double screenSize, int batteryPower, int ram, String color) {
        Brand brand = findBrandById(brandId); // Markayı id ile bulur
        if (brand != null) {
            Cellphone cellphone = new Cellphone(productId++, price, discountRate, stock, name, brand, memory, screenSize, batteryPower, ram, color);
            products.add(cellphone); // Yeni cep telefonunu listeye ekler
        }
    }

    // Yeni bir notebook ekler
    public void addNotebook(double price, double discountRate, int stock, String name, int brandId, int ram, String storage, double screenSize) {
        Brand brand = findBrandById(brandId); // Markayı id ile bulur
        if (brand != null) {
            Notebook notebook = new Notebook(productId++, price, discountRate, stock, name, brand, ram, storage, screenSize);
            products.add(notebook); // Yeni notebook'u listeye ekler
        }
    }

    // Tüm ürünleri listeler
    public void listProducts() {
        System.out.format("%-10s %-20s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Name", "Price", "Discount", "Stock", "Brand", "Type");
        for (Product product : products) {
            System.out.format("%-10d %-20s %-10.2f %-10.2f %-10d %-10s %-10s\n", product.getId(), product.getName(), product.getPrice(), product.getDiscountRate(), product.getStock(), product.getBrand().getName(), product.getType());
        }
    }

    // Belirtilen id'ye sahip ürünü siler
    public void deleteProductById(int id) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getId() == id) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove); // Ürünü listeden kaldırır
        }
    }

    // Belirtilen marka id'sine sahip ürünleri filtreler ve listeler
    public void filterProductsByBrand(int brandId) {
        Brand brand = findBrandById(brandId); // Markayı id ile bulur
        if (brand != null) {
            System.out.format("%-10s %-20s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Name", "Price", "Discount", "Stock", "Brand", "Type");
            for (Product product : products) {
                if (product.getBrand().getId() == brandId) {
                    System.out.format("%-10d %-20s %-10.2f %-10.2f %-10d %-10s %-10s\n", product.getId(), product.getName(), product.getPrice(), product.getDiscountRate(), product.getStock(), product.getBrand().getName(), product.getType());
                }
            }
        }
    }

    // Belirtilen id'ye sahip markayı bulur
    private Brand findBrandById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }
}
