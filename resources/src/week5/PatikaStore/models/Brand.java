package week5.PatikaStore.models;

public class Brand implements Comparable<Brand> {
    private String title;
    private int id;

    public Brand(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Brand other) {
        return this.title.compareTo(other.title);
    }
}
