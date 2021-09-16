package by.kasyan.tasks.lesson5.task3;

public class Main {
    public static void main(String[] args) {
        Person first = new Person("Petrov Ivan", 27);
        Person second = new Person();

        first.move();
        first.talk();
        second.move();
        second.talk();
    }
}
