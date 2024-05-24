package week5.PatikaStore.models;

public class Brand implements Comparable<Brand> {
    private String name;
    private int id;

    public Brand(int id,String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Brand other) {
        return this.name.compareTo(other.name);
    }
}
