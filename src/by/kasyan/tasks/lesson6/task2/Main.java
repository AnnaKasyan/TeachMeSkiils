package by.kasyan.tasks.lesson6.task2;

public class Main {
    public static void main(String[] args) {

        Person firstPerson = new Person("Jack", "black jacket", "grey pants", "brown shoes");
        Person secondPerson = new Person();

        firstPerson.putOn();
        firstPerson.takeOff();
        secondPerson.putOn();
        secondPerson.takeOff();
    }
}
