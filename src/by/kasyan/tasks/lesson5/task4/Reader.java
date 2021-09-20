package by.kasyan.tasks.lesson5.task4;

public class Reader {
    private String fullName;
    private int libraryCard;
    private String faculty;
    private String dateOfBirth;
    private int phoneNumber;

    Reader(String name, int card, String faculty, String dateOfBirth, int phoneNumber) {
        fullName = name;
        libraryCard = card;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    void displayInfo() {
        System.out.printf("ФИО: %s \tНомер читательского билета: %d \tФакультет: %s\tДата рождения: %s \tТелефон: %d\n", fullName, libraryCard, faculty, dateOfBirth, phoneNumber);
    }

    public void takeBook(int numOfBooks) {
        System.out.println(fullName + " взял книг в количестве: " + numOfBooks + " штук.");
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.println(book.title + ", автор " + book.author);
        }
        System.out.println();
    }

    public void takeBook(String... books) {
        System.out.println(fullName + " взял книги: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(int num) {
        System.out.println(fullName + " вернул книги в количестве: " + num + " штук.");
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.println(book.title + ", автор " + book.author);
        }
        System.out.println();
    }

    public void returnBook(String... books) {
        System.out.println(fullName + " вернул книги: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}
