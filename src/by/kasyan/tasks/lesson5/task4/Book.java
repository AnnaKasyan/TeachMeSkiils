package by.kasyan.tasks.lesson5.task4;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title) {
        this.title = title;
    }

    void displayInfo() {
        System.out.printf("Название:  %s\tАвтор: %s\n", title, author);
    }
}
