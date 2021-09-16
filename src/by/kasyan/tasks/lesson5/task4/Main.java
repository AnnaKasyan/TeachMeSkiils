package by.kasyan.tasks.lesson5.task4;

public class Main {
    public static void main(String[] args) {
        Reader first = new Reader("Иванов А. А.", 23546, "экономический", "01.10.2001", 8541254);
        Reader second = new Reader("Петрова В. В.", 12254, "филологический", "17.05.2003", 3219874);
        Reader third = new Reader("Сидоров И. И.", 75631, "математический", "12.11.2000", 123456);
        Reader[] readers = {first, second, third};

        Book encyclopedia = new Book("Энциклопедия");
        Book firstRoman = new Book("Джейн Эйр", "Шарлотта Бронте");
        Book secondRoman = new Book("Война и мир", "Л.Н. Толстой");
        Book firstDictionary = new Book("Словарь русского языка", "В.И. Даль");
        Book secondDictionary = new Book("Словарь англо-русский");
        Book thirdDictionary = new Book("Словарь экономических терминов");
        Book firstTextbook = new Book("Учебное пособие по высшей математике");
        Book secondTextbook = new Book("Философия Китая");
        Book thirdTextbook = new Book("Введение в социологические науки");
        Book forthTextbook = new Book("Капитал", "Карл Маркс");
        Book[] books = {encyclopedia, firstRoman, secondRoman, firstDictionary, secondDictionary, thirdDictionary, firstTextbook, secondTextbook, thirdTextbook, forthTextbook};

        first.takeBook(3);
        second.takeBook(thirdDictionary, firstRoman, forthTextbook, secondTextbook, encyclopedia);
        third.takeBook("Учебное пособие по высшей математике", "Джейн Эйр, Шарлотта Бронте");

        first.returnBook(2);
        second.returnBook(secondTextbook, encyclopedia);
        third.returnBook("Джейн Эйр, Шарлотта Бронте");

        first.displayInfo();
        firstDictionary.displayInfo();
        secondTextbook.displayInfo();

    }
}
