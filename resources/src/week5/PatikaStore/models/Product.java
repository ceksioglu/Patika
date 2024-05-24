package week5.PatikaStore.models;

public abstract class Product {
    private int id;
    private double price;
    private double discountRate;
    private int stock;
    private String name;
    private Brand brand;

    public Product(int id, Brand brand, String name, int stock, double discountRate, double price) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.stock = stock;
        this.discountRate = discountRate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }
}
