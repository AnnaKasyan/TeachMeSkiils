package by.kasyan.tasks.lesson7.tasks.task2;

public class Animal {

    private final String food;
    private final String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public void makeNoise() {
        System.out.print("Подает голос ");
    }

    public void eat() {
        System.out.print("Ест ");
    }

    public void sleep() {
        System.out.print("Спит ");
    }
}
