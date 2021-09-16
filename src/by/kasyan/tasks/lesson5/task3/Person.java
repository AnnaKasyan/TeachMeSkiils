package by.kasyan.tasks.lesson5.task3;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "Unknown";
        this.age = 18;
    }

    public void move() {
        System.out.printf("%s, %d", fullName, age);
        System.out.print(", talk: ");
    }

    public void talk() {
        System.out.println("Hello!");
    }
}
