package week5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private int pageCount;
    private String title;

    public Book(int pageCount, String title) {
        this.pageCount = pageCount;
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Book {" +
                "Title='" + title + '\'' +
                ", Page Count=" + pageCount +
                '}';
    }



    public static void main(String[] args) {
        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book(500, "Java 101"));
        bookSet.add(new Book(500, "Effective Java"));
        bookSet.add(new Book(300, "Spring 101"));
        bookSet.add(new Book(400, "Clean Code"));
        bookSet.add(new Book(450, "Design Patterns"));


        for (Book book : bookSet ){
            System.out.println(book);
        }

        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSet);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }

}