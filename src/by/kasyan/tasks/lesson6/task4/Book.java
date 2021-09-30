package by.kasyan.tasks.lesson6.task4;

public class Book implements Printable {

    private final String name;
    private final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    static void printBooks(Printable[] printable) {
        for (Printable i : printable) {
            if (i instanceof Book) {
                System.out.println(((Book) i).name + ", " + ((Book) i).author);
            }
        }
    }

    @Override
    public void print() {
        System.out.println(name + ", " + author);
    }
}
