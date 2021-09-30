package by.kasyan.tasks.lesson7.tasks.task1;

public class Person {

    private final String surName;
    private final String name;

    public Person(String surName, String name) {
        this.surName = surName;
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }
}
