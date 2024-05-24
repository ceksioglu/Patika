package week5.PatikaStore.models;

public class Notebook extends Product {
    private int ram;
    private String storage;
    private double screenSize;

    public Notebook(int id, double price, double discountRate, int stock, String name, Brand brand, int ram, String storage, double screenSize) {
        super(id, price, discountRate, stock, name, brand, "Notebook");
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
