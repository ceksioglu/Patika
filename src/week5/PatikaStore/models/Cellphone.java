package week5.PatikaStore.models;

public class Cellphone extends Product {
    private String memory;
    private double screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    public Cellphone(int id, double price, double discountRate, int stock, String name, Brand brand, String memory, double screenSize, int batteryPower, int ram, String color) {
        super(id, price, discountRate, stock, name, brand, "Phone");
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }
}
