package week5.PatikaStore.models;

public class Cellphone extends Product {
    private String memory;
    private double screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    public String getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public Cellphone(int id, Brand brand, String name, int stock, double discountRate, double price, String memory, double screenSize, int batteryPower, int ram, String color) {
        super(id, brand, name, stock, discountRate, price);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;


    }
}
