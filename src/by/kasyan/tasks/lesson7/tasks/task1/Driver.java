package by.kasyan.tasks.lesson7.tasks.task1;

public class Driver extends Person {

    private final int experience;

    public Driver(String surName, String name, int experience) {
        super(surName, name);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
