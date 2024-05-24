package week5.PatikaStore.models;

public class Notebook extends Product {
    private int ram;
    private String storage;
    private double screenSize;

    public Notebook(int id, Brand brand, String name, int stock, double discountRate, double price, int ram, String storage, double screenSize) {
        super(id, brand, name, stock, discountRate, price);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public double getScreenSize() {
        return screenSize;
    }
}
