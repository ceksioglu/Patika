package week4.hw;

public class MyList <T> {
    private int capacity;
    private T[] data;
    private int size;

    public MyList() {
        this.capacity = 10;
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    public MyList(int capacity){
        this.capacity = capacity;
        this.data = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    public int getCapacity() {
        return capacity;
    }
    public void add(T data){
        System.out.println("Adding operation");
        if (capacity<size){
            capacity *= 2;
        }
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.getSize());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.getSize());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.getSize());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
    }
}
