package by.kasyan.tasks.lesson6.task4;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Л.Н. Толстой");
        Book book2 = new Book("Java.Полное руководство", "Г. Шилдт");
        Book book3 = new Book("Вишневый сад", "А.П. Чехов");
        Book book4 = new Book("Гарри Поттер", "Дж.Роулинг");
        Magazine magazine1 = new Magazine("Дача и огород");
        Magazine magazine2 = new Magazine("Vogue");
        Magazine magazine3 = new Magazine("Cosmopolitan");
        Printable[] printable = new Printable[]{book1, book2, book3, book4, magazine1, magazine2, magazine3};

        for (Printable i : printable) {
            i.print();
        }

        System.out.println("---------------");

        Magazine.printMagazines(printable);

        System.out.println("---------------");

        Book.printBooks(printable);
    }
}
