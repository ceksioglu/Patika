package week5.PatikaStore.models;

public abstract class Product {
    private int id;
    private double price;
    private double discountRate;
    private int stock;
    private String name;
    private Brand brand;
    private String type;

    public Product(int id, double price, double discountRate, int stock, String name, Brand brand, String type) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.type = type;
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

    public String getType() {
        return type;
    }
}
